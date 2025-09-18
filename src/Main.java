import java.util.*;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;



public class Main {

    // The Random object is created once and can be used by all methods.
    public static Random rand = new Random();


    public static int roll4d6() {
        int[] diceRolls = new int[4];
        Random random = new Random();

        for (int i = 0; i < diceRolls.length; i++) {
            diceRolls[i] = random.nextInt(6) + 1;
        }

        Arrays.sort(diceRolls);

        int sum = diceRolls[1] + diceRolls[2] + diceRolls[3];

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Char Name:");

        String charName = input.nextLine();
        System.out.println(charName);
        int STR = roll4d6();
        int DEX = roll4d6();
        int CON = roll4d6();
        int INT = roll4d6();
        int WIS = roll4d6();
        int CHA = roll4d6();
                System.out.println(STR);
    }
}


