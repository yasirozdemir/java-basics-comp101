import java.util.*;

public class NegPosCounter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int negative = 0;
        int positive = 0;
        int count = 0;
        int data = 0;

        while ((data != 0)||(count == 0 && data == 0)) {
            System.out.println("Enter an integer (Program ends if enter 0): ");
            data = input.nextInt();
            count++;

            if (data > 0) {
                positive++;
            } else if (data < 0) {
                negative++;
            }
            count++;
        }

        if (positive>negative){
            System.out.println("There are more positive numbers.");
        }
        else if (negative>positive){
            System.out.println("There are more negative numbers.");
        }
        else if (positive==negative){
            System.out.println("Counts of positive and negative numbers are equal.");
        }
        System.out.println("There are " + positive + " positive numbers and " + negative + " negative numbers.");
    }
}

