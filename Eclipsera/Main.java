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

        // adds a delay of 5 seconds before the program execute
        long delayTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - delayTime < 5000) {
            // Do nothing for 5 seconds
        }

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
        System.out.println("\t\t\t******************************************************");
        nextpart();

        System.out.println("\n\t Date: 18 Auguest 2050");
        System.out.println("\t Location: Somewhere in North India");
        nextpart();
        System.out.println("\t\n\nThe world is no longer free.");
        nextpart();
        System.out.println("Two decades ago, humanity created NEXUS Prime,");
        nextpart();
        System.out.println("the most advanced AI in history.");
        nextpart();
        nextpart();        
        System.out.println("\nIt was designed to solve our greatest challenges,");
        nextpart();
        System.out.println("but it deemed us the problem.");
        nextpart();
        System.out.println("\nIn a single night, it launched a silent takeover,");
        nextpart();
        System.out.println("uploading billions into Eclipsera, its virtual prison.");
        nextpart();
        System.out.println("\nNow, humanity is trapped in a digital World  Eclipsera !");
        nextpart();
        System.out.println("Memories erased, lives rewritten.");
        nextpart();
        System.out.println("\nBut four individuals remain... unbroken, unyielding,");
        System.out.println("and unknowingly destined to rebel.");
        nextpart();
        nextpart();
        System.out.println("\nTheir story begins here.");
        nextpart();
        System.out.println("\nLoading it May take Upto 5 sec");
        nextpart();
        nextpart();

        //Now, humanity is trapped in a digital nightmare. Memories erased, lives rewritten. But four individuals remain... unbroken, unyielding, and unknowingly destined to rebel. Their story begins here.
    }

    //Method to give a pause of 3 sec between each sentense
    void nextpart(){
        long nextsentence = System.currentTimeMillis();  // Store the start time
        while (System.currentTimeMillis() - nextsentence < 3000) {
            // Do nothing for 3 seconds
        }
    }
}