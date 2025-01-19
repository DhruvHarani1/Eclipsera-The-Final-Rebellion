import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Classes
        Scanner sc = new Scanner(System.in);
        Awakening AK = new Awakening();

        // Starting the game with game name and tagline
        System.out.println("\n\t\t\t******************************************************");
        System.out.println("\t\t\t*                                                    *");
        System.out.println("\t\t\t*               Eclipsera: The Final Rebellion       *");
        System.out.println("\t\t\t*                                                    *");
        System.out.println("\t\t\t*            ~Together we escape, divided we fall!   *");
        System.out.println("\t\t\t*                                                    *");
        System.out.println("\t\t\t******************************************************");
        AK.nextpart();

        // Chapter One Awakening
        AK.EnterPoint();

    }
}

class Awakening {

    // Classes
    Scanner sc = new Scanner(System.in);

    // Main Entry point of Awakening
    void EnterPoint() {
        System.out.println("\n\t\t\t******************************************************");
        System.out.println("\t\t\t*                 Chapter 1: Awakening               *");
        System.out.println("\t\t\t*                                                    *");
        System.out.println("\t\t\t*              Date: 18 Auguest 2050                 *");
        System.out.println("\t\t\t*              Location: Somewhere in North India    *");
        System.out.println("\t\t\t******************************************************");

        System.out.println("\t\tThe world is no longer free");
        System.out.println("\t\tTwo decades ago, humanity created NEXUS Prime");
        System.out.println("\t\tthe most advanced AI in history");
        System.out.println("\t\tThe world is no longer free");
    }

    void nextpart(){
        long startTime = System.currentTimeMillis();  // Store the start time
        while (System.currentTimeMillis() - startTime < 1000) {
            // Do nothing for 5 seconds
        }
    }
}