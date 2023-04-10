import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for (int row = 1; row <= N; row++)
        {
            for (int i = 1 ; i < row ; i++) // left sided increasing triangle (space) 1
            {
                System.out.print("  ");
            }
            for (int i = row ; i <= N; i++) // right sided decreasing triangle (star) 2
            {
                System.out.print("* ");
            }
            for (int i = 1; i <= row; i++) // left sided increasing triangle (star) 3
            {
                System.out.print("* ");
            }
            for (int i = row ; i < N; i++) // right sided decreasing triangle (space) 4
            {
                System.out.print("  ");
            }
            for (int i = row; i < N; i++) // left sided decreasing triangle (space) 5
            {
                System.out.print("  ");
            }
            for (int i = 1; i <= row; i++) // right sided increasing triangle (star) 6
            {
                System.out.print("* ");
            }
            for (int i = row; i <= N; i++) // left sided decreasing triangle (star) 7
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= N; row++)
        {
            for (int i = row; i < N; i++) // left sided decreasing triangle (space) 1
            {
                System.out.print("  ");
            }
            for (int i = 1; i <= row; i++) // right sided increasing triangle (star) 2
            {
                System.out.print("* ");
            }
            for (int i = row; i <= N; i++) // left sided decreasing triangle (star) 3
            {
                System.out.print("* ");
            }
            for (int i = 1; i < row; i++) // right sided increasing triangle (space) 4
            {
                System.out.print("  ");
            }
            for (int i = 1; i < row; i++) // left sided increasing triangle (space) 5
            {
                System.out.print("  ");
            }
            for (int i = row ; i <= N; i++) // right sided decreasing triangle (star) 6
            {
                System.out.print("* ");
            }
            for (int i = 1; i <= row; i++) // left sided increasing triangle (star) 7
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("----------------------");

        int factorialN = 1;
        for (int i1 = 1; i1 <= N; i1++){ //factorial for N, I defined a new variable i1 to prevent any mistake.
            factorialN = factorialN * i1;
        }
        System.out.println("----------------------");
        System.out.println(factorialN);
    }
}