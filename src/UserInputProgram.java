import java.util.Scanner;

public class UserInputProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Input Challenge!");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your favorite number: ");
        int favoriteNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine();

        System.out.println("\n--- Input Summary ---");
        System.out.println("Hello, " + name + "!");
        System.out.println("Your favorite number is: " + favoriteNumber);
        System.out.println("Your favorite color is: " + favoriteColor);


        scanner.close();
    }
}