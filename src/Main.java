import java.util.*;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;



public class Main {

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

        String[] classes = {
                "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk",
                "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"
        };

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Char Name:");

        String charName = input.nextLine();
        //(Current Ability score - 10) / 2 (*rounded down*)
        System.out.println(charName);

        int STR = roll4d6();
            int STRMod = ((STR-10)/2);
        int DEX = roll4d6();
            int DEXMod = ((DEX-10)/2);
        int CON = roll4d6();
            int CONMod = ((CON-10)/2);
        int INT = roll4d6();
            int INTMod = ((INT-10)/2);
        int WIS = roll4d6();
            int WISMod = ((WIS-10)/2);
        int CHA = roll4d6();
            int CHAMod = ((CHA-10)/2);

        System.out.printf("Character: %s%n",charName);
        System.out.printf("STR: %d (%d) | DEX: %d (%d) | CON: %d (%d)%n",STR,STRMod,DEX,DEXMod,CON,CONMod);
        System.out.printf("INT: %d (%d) | WIS: %d (%d) | CHA: %d (%d)%n",INT,INTMod,WIS,WISMod,CHA,CHAMod);

        System.out.printf("%-10s | %-16s | %-40s%n", "Class", "Modifiers", "Additional Features");
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("%-10s | %-16s | %-40s%n", "1. Barbarian", "+2 STR, +1 CON", "Rage, Unarmored Defense");
        System.out.printf("%-10s | %-16s | %-40s%n", "2. Bard", "+2 CHA, +1 DEX", "Inspiration, Jack of all Trades");
        System.out.printf("%-10s | %-16s | %-40s%n", "3. Cleric", "+2 WIS, +1 CON", "Channel Divinity, Turn Undead");
        System.out.printf("%-10s | %-16s | %-40s%n", "4. Druid", "+2 WIS, +1 CON", "Wild Shape, Commune with Nature");
        System.out.printf("%-10s | %-16s | %-40s%n", "5. Fighter", "+2 DEX, +1 CON", "Action Surge, Second Wind");
        System.out.printf("%-10s | %-16s | %-40s%n", "6. Monk", "+2 DEX, +1 WIS", "Unarmored Movement, Stunning Strike");
        System.out.printf("%-10s | %-16s | %-40s%n", "7. Paladin", "+2 STR, +1 CHA", "Divine Smite, Aura of Protection");
        System.out.printf("%-10s | %-16s | %-40s%n", "8. Ranger", "+2 DEX, +1 WIS", "Favored Enemy, Surefooted");
        System.out.printf("%-10s | %-16s | %-40s%n", "9. Rogue", "+2 DEX, +1 INT", "Sneak Attack, Uncanny Dodge");
        System.out.printf("%-10s | %-16s | %-40s%n", "10. Sorcerer", "+2 CHA, +1 CON", "Wild Magic, Flexible Spellcasting");
        System.out.printf("%-10s | %-16s | %-40s%n", "11. Warlock", "+2 CHA, +1 CON", "Eldritch Patron, Pact Magic");
        System.out.printf("%-10s | %-16s | %-40s%n", "12. Wizard", "+2 INT, +1 CON", "Arcane Recovery, Spell Mastery");
        System.out.println("-------------------------------------------------------------------------");

        System.out.print("Please enter the # of the class you choose: ");
        int choice = input.nextInt();
        String chosenClass = classes[choice - 1];

        System.out.println("You have chosen: " + chosenClass);

        switch (chosenClass) {
            case "Barbarian":
                STR += 2; CON += 1;
                break;
            case "Bard":
                CHA += 2; DEX += 1;
                break;
            case "Cleric":
                WIS += 2; CON += 1;
                break;
            case "Druid":
                WIS += 2; CON += 1;
                break;
            case "Fighter":
                DEX += 2; CON += 1;
                break;
            case "Monk":
                DEX += 2; WIS += 1;
                break;
            case "Paladin":
                STR += 2; CHA += 1;
                break;
            case "Ranger":
                DEX += 2; WIS += 1;
                break;
            case "Rogue":
                DEX += 2; INT += 1;
                break;
            case "Sorcerer":
                CHA += 2; CON += 1;
                break;
            case "Warlock":
                CHA += 2; CON += 1;
                break;
            case "Wizard":
                INT += 2; CON += 1;
                break;
        }

        STRMod = (STR - 10) / 2;
        DEXMod = (DEX - 10) / 2;
        CONMod = (CON - 10) / 2;
        INTMod = (INT - 10) / 2;
        WISMod = (WIS - 10) / 2;
        CHAMod = (CHA - 10) / 2;

        System.out.printf("\n%s's stats have been updated to reflect the %s class.%n", charName, chosenClass);
        System.out.printf("Character: %s, [%s]%n",charName,chosenClass);
        System.out.printf("STR: %d (%d) | DEX: %d (%d) | CON: %d (%d)%n",STR,STRMod,DEX,DEXMod,CON,CONMod);
        System.out.printf("INT: %d (%d) | WIS: %d (%d) | CHA: %d (%d)%n",INT,INTMod,WIS,WISMod,CHA,CHAMod);


    }
}


