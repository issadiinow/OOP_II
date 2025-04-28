import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the If-Else Demo!");

        System.out.print("Enter a day of the week: ");
        String day = scanner.nextLine().toLowerCase();

        if (day.equals("saturday") || day.equals("sunday")) {
            System.out.println("It's the weekend!");
        } else {
            System.out.println("It's a weekday.");
        }

        scanner.close();
    }
}