package projects;
/*
    * Classes: `Library`, `Book`, `Member` (with `StudentMember`, `TeacherMember`).
    * Use **composition** (`Library HAS-A List<Book>`).
    * Store books in a `Map<ISBN, Book>`.
    * Features: add/remove books, search by title, list members.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        
        Library library = new Library();

        library.addBook(new Book("111", "Java Basics", "Will smith"));
        library.addBook(new Book("222", "Design", "Dupont"));

        library.addMember(new StudentMember("S1", "Kien"));
        library.addMember(new TeacherMember("T1", "Vinh"));

        library.searchByTitle("Java basics");

        library.listMembers();
    }
    
}


class Library {

    private final Map<String, Book> books = new HashMap<>();
    private final List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public void removeBook(String isbn) {
        books.remove(isbn);
    }

    public void searchByTitle(String title) {
        for (Book book : books.values()) {
            if (book.getTitle().equalsIgnoreCase(title)) { // https://www.w3schools.com/java/ref_string_equalsignorecase.asp
                System.out.println(book);
            }
        }
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void listMembers() {
        for (Member member : members) {
            System.out.println(member.displayMember());
        }
    }
}


class Book {
     private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{ISBN='" + isbn + "', title='" + title + "', author='" + author + "'}";
    }
}

abstract class Member {
    protected String id;
    protected String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract String displayMember();
}


class StudentMember extends Member {

    public StudentMember(String id, String name) {
        super(id, name);
    }

    @Override
    public String displayMember() {
        return "StudentMember{id='" + id + "', name='" + name + "'}";
    }
}


class TeacherMember extends Member {

    public TeacherMember(String id, String name) {
        super(id, name);
    }

    @Override
    public String displayMember() {
        return "TeacherMember{id='" + id + "', name='" + name + "'}";
    }
}
