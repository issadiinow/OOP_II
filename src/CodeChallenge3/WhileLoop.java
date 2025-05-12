package CodeChallenge3;
/*
* a program that checks whether a number is even or odd in a given range
* */

public class WhileLoop {
    public static void main(String[] args) {
        int number = 1;

        while (number <= 10) {
            if (number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
            number++;
        }
    }
}
