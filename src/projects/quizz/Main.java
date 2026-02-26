package projects.quizz;
import java.util.*;
/*
Classes: Question, ChoiceQuestion, TrueFalseQuestion.
Store questions in a List<Question>.
Use polymorphism: displayQuestion() overridden in each subclass.
Features: ask questions, check answers, calculate score.
*/
public class Main {
public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        // Create multiple choice question
        ChoiceQuestion q1 = new ChoiceQuestion(
                "What is the capital of Belgium?", "1");
        q1.addChoice("Brussels");
        q1.addChoice("London");
        q1.addChoice("Berlin");

        // Create true/false question
        TrueFalseQuestion q2 = new TrueFalseQuestion(
                "Java supports OOP.", "1");

        questions.add(q1);
        questions.add(q2);

        int score = 0;

        for (Question q : questions) {
            q.displayQuestion();   // Polymorphism
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (q.checkAnswer(answer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong!\n");
            }
        }

        System.out.println("Final Score: " + score + "/" + questions.size());
        scanner.close();
    }
    
}
