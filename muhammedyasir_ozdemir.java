import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class muhammedyasir_ozdemir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int tempNum = num;

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= tempNum - 1; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (num - tempNum + 1); k++){
                System.out.print(tempNum);
            }
            System.out.println();

            tempNum--;
        }
    }
}