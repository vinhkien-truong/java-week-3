package composition.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 TODO:
 1. Create class Book with title and author.
 2. Create class Library that HAS-A List<Book>.
 3. Add methods addBook(), listBooks().
 4. In main(), add multiple books and print them.
*/

public class Library
{
        private final List<Book> books;
    
        public Library() {
            this.books = new ArrayList<Book>();
        }
    
        public void addBook(Book book) {
            this.books.add(book);
        }
    
        public void listBooks() {
          for (Book book : this.books) {
            book.displayInfoBook();
          }
           // return books;
        }
}
class Book {
     private String title;
     private String author;
     private int page;

     public Book(String title, String author, int page) {
          this.title = title;
          this.author = author;
          this.page = page;
     }

     public String getTitle() {
          return title;
     }

     public String getAuthor() {
          return author;
     }

     public int getPage() {
          return page;
     }

     public void displayInfoBook() {
          System.out.println("title:"+ this.title + "\nauthor : " + this.author + "\npage: " + this.page);
     }
}
