/*
* Prompts user to enter 2 numbers
* Calculates sum, average, difference, product and division
*/

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for the first number
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        // Ask for the second number
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        // Calculations
        double sum = num1 + num2;
        double diff = num1 - num2;
        double average = (num1 + num2) / 2;
        double product = num1 * num2;
        double division;

        // Handle division by zero
        if (num2 != 0) {
            division = num1 / num2;
        } else {
            division = Double.NaN; // Not a Number if division by zero
        }

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);

        if (num2 != 0) {
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Undefined (cannot divide by zero)");
        }

        sc.close();
    }
}
