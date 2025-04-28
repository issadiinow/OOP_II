import java.util.Scanner;


public class WhileLoop {
    Scanner sc = new Scanner(System.in);

    void showHello() {
        String choice;
        System.out.println("For hello type 'h', anything else to stop");
        choice = sc.next();
        while ("h".equals(choice)) {
            System.out.println("Hello");
            System.out.println("For hello type 'h', anything else to stop");
            choice = sc.next();
        }
    }

    public static void main(String[] args) {
        WhileLoop obj = new WhileLoop();
        obj.showHello();
    }
}
