import java.util.Scanner;

public class Scanners {
    public static void  main(String[] args) {

        String studentfirstname = "Kayla";
        String studentlastname = "Hammon";
        double studentgpa = 3.45;
        System.out.println(studentfirstname + " " + studentlastname + " has a GPA of " + studentgpa);
        System.out.println("What dou you want to update it to?");

        Scanner scan = new Scanner(System.in);
        studentgpa = scan.nextDouble();

        System.out.println(studentfirstname + " " + studentlastname + " now has a GPA of " + studentgpa );


    }
}
