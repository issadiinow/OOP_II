package ArrayChallenges;


import java.util.Arrays;

public class ArrayClearDemo {
    public static void main(String[] args){
        String[] pallets = { "B14", "A11", "B12", "A13" };

        System.out.println("Before: " + pallets[0].toLowerCase());

        Arrays.fill(pallets, 0, 2, null);
    }
}
