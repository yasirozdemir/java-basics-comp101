import java.util.*;
public class MultipleChoiceChallenge {
    public static void main(String[] args) {

        String question = "What is the name of the coder who wrote that code?";
        String choiceOne = "Furkan";
        String choiceTwo = "Yasir";
        String choiceThree = "Mustafa";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);
        System.out.print("Please insert the full answer.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (correctAnswer.equals(input)) {
            System.out.println("Congrats. The coder's name is Yasir.");
        }
        else {
            System.out.println("You're incorrect. The coder is " + choiceTwo);
        }
    }
}
