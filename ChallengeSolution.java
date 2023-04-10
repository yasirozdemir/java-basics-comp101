import java.util.*;
public class ChallengeSolution {

    public static void main(String[] args) {
        String question = "What is the largest planet in our solar system?";
        String choiceOne = "earth";
        String choiceTwo = "jupiter";
        String choiceThree = "saturn";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println("Choose one of the following " +
                choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (correctAnswer.equals(input.toLowerCase())) { //we use .toLowerCase to make input's all the characters
            // lowercase so that case of the letter that inputted doesn't matter.
            System.out.println("Congrats! That's the correct answer.");
        }

        else {
            System.out.println("You're incorrect. The correct answer is " + correctAnswer);
        }
    }
}
