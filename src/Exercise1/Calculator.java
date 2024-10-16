package Exercise1;

import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        try {
            //code that might cause exceptions/problems
            System.out.println("Input your first value: ");
            int num1 = scanner.nextInt();

            System.out.println("Input another value: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;

            System.out.println("The result is : " + sum);
        } catch (NumberFormatException nfe) {
            System.out.println("That's not a number silly!");

        } finally {
            scanner.close();

        }

    }
}
