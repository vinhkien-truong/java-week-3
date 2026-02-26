package projects.quizz;
import java.util.*;

public class ChoiceQuestion extends Question {

    private List<String> choices = new ArrayList<>();

    public ChoiceQuestion(String questionText, String correctAnswer) {
        super(questionText, correctAnswer);
    }

    public void addChoice(String choice) {
        choices.add(choice);
    }

    @Override
    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ". " + choices.get(i));
        }
    }
}