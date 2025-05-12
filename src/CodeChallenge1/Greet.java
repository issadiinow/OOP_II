package CodeChallenge1;
/*
* Program that requests user for input i.e. their name
* Combines the greeting and the user's name
* Greets the user
* */

import java.util.Scanner;

public class Greet {
    void sayHello() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        scanner.close();
    }

    public static void main(String[] args) {
        Greet greet = new Greet();
        greet.sayHello();
    }
}
