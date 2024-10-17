package Exercise2;

import java.util.Scanner;
import java.util.Random;

public class Randomvalues {
    public static void main(String[] args){
        double[] array = new double[50];
        Random random = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextDouble() * 100;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an index between 0 and 49: ");

        boolean success = false;


        while(!success) {
            try {
                int index = scanner.nextInt();
                // Print the value at the entered index
                System.out.println("Value at index " + index + ": " + array[index]);
                success = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle the case when the index is out of bounds
                System.out.println("Error: Index out of bounds. Please enter an index between 0 and 49.");
                scanner.nextLine();
            } catch (Exception e) {
                // Handle any other unexpected exceptions
                System.out.println("Error: Invalid input. Try again.");
                scanner.nextLine();
            }
        }
        scanner.close();




    }
}
