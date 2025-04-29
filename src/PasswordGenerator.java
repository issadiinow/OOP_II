/**
 * Simple password generator using Java's Random class
 */
import java.util.Random;
import java.util.Arrays;


public class PasswordGenerator {
    public static void main(String[] args) {
        // Create Random object
        Random random = new Random();

        // Define character pools
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%^&*()-_=+";
        String allChars = upper + lower + digits + special;

        // Generate password of length 12
        StringBuilder password = new StringBuilder(12);
        for (int i = 0; i < 12; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        System.out.println("Generated password: " + password);
    }
}