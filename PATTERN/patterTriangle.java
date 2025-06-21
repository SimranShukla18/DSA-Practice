package Pattern;

import java.util.Scanner;

public class patterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column: ");
        for (int i = 1; i <= 3; i++) {

           for (int j = 3; j >= i; j--) {

              System.out.print("* ");

            }

           System.out.println();
}



        }
    }
