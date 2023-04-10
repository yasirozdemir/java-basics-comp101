/*This program is written to calculate the number of passing
students and failing students by checking the inputted grades.
Passing grade is 70. To stop the program insert 0.*/

import java.util.*;

public class PassOrFail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int totalNumberOfStudents = 0, passingStudents = 0, failingStudents = 0, data = 0;

        while ((data != 0)||(totalNumberOfStudents == 0 && data == 0)) {
            System.out.println("Enter the grades:");
            data = input.nextInt();

            if (data>=70) {
                passingStudents++;
            }
            else {
                failingStudents++;
            }
            totalNumberOfStudents++;
        }
        System.out.println("There are " + totalNumberOfStudents + " students. " + passingStudents +
                           " students are passing. " + failingStudents + " students are failing. ");
    }
}
