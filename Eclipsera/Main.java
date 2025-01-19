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

        initialDialogues();

        System.out.println("\nFirst Lets Introduce with Characters.");
        System.out.print("Press Enter To Continue");
        sc.nextLine();

        professorIntroduction();
        arjunIntroduction();
        suhaniIntroduction();
        alexIntroduction();
        tysonIntroduction();
    }

    // Method for initial Dialogues
    void initialDialogues() {
        System.out.println("\n\t Date: 18 Auguest 2050");
        System.out.println("\t Location: Somewhere in North India");
        nextpart();
        System.out.println("\t\n\nThe world is no longer free.");
        nextpart();
        System.out.println("Two decades ago, humanity created NEXUS Prime,");
        nextpart();
        System.out.println("the most advanced AI in history.");
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
        System.out.println("\nBut four individuals stand strong, unaware of their destiny,");
        System.out.println("chosen to rise and bring the change.");        
        nextpart();
        nextpart();
        System.out.println("\nTheir story begins here.");
        nextpart();
        nextpart();
    }

    // Method For professor Introduction
    void professorIntroduction() {
        System.out.println("\n\t********************");
        System.out.println("\t*     Professor    *");
        System.out.println("\t********************");
        nextpart();
        System.out.println("The Professor is a brilliant mind, a pioneering researcher in creating the Nexus.");
        System.out.println("He's the scientist who helped build the foundations of the virtual world,");
        nextpart();
        nextpart();
        System.out.println("But now, the Professor is determined to undo the mistake");
        nextpart();
        System.out.println("\nNo one knows his real name, but he knows everything about everyone.");
        nextpart();
        System.out.print("\nPress Enter for overview.");
        sc.nextLine();
        System.out.println("A genius, data scientist, and the mind behind the Nexus,");
        System.out.println("the Professor holds the key to escaping the virtual prison.");
        nextpart();
        System.out.print("\nPress Enter To View next Character.");
        sc.nextLine();
    }

    // Method For Tech Introduction (Initial name --> Alex)
    void alexIntroduction() {
        System.out.println("\n\t********************");
        System.out.println("\t*     Alex         *");
        System.out.println("\t********************");
        nextpart();
        System.out.println("Alex is a tech expert, known for his hacking skills.");
        System.out.println("His life is spent in the virtual world, hacking minor systems to survive");
        nextpart();
        nextpart();
        System.out.print("\nPress Enter for overview.");
        sc.nextLine();
        System.out.println("\nA true hacker at heart,");
        System.out.println("solving complex problems very easily");
        nextpart();
        System.out.print("\nPress Enter To View next Character.");
        sc.nextLine();
    }

    // Method For Scientist Introduction (Initial name --> Suhani)
    void suhaniIntroduction() {
        System.out.println("\n\t********************");
        System.out.println("\t*     Suhani       *");
        System.out.println("\t********************");
        nextpart();
        System.out.println("Suhani is a master in the fields of Physics and Chemistry, a champion of science.");
        System.out.println("She spends her days experimenting and researching within the Eclipsera,");
        nextpart();
        nextpart();
        System.out.print("\nPress Enter for overview.");
        sc.nextLine();
        System.out.println("\nSuhani's understanding of the natural world");
        System.out.println("makes her an indispensable asset for freedom.");
        nextpart();
        System.out.print("\nPress Enter To View next Character.");
        sc.nextLine();
    }

    // Method For Strategy Maker Introduction (Initial name --> Arjun)
    void arjunIntroduction() {
        System.out.println("\n\t********************");
        System.out.println("\t*     Arjun        *");
        System.out.println("\t********************");
        nextpart();
        System.out.println("Arjun is a brilliant strategist, a mastermind when it comes to overcoming challenges.");
        System.out.println("He can analyze any situation and find the best path forward");
        nextpart();
        nextpart();
        System.out.print("\nPress Enter for overview.");
        sc.nextLine();
        System.out.println("\nArjun's intelligence and leadership skills");
        System.out.println("have earned him a reputation as a leader and problem solver.");
        nextpart();
        System.out.print("\nPress Enter To View next Character.");
        sc.nextLine();
    }

    // Method For hardWare engineer Maker Introduction (Initial name --> Tyson)
    void tysonIntroduction() {
        System.out.println("\n\t********************");
        System.out.println("\t*     Tyson        *");
        System.out.println("\t********************");
        nextpart();
        System.out.println("Tyson is a true engineering genius, capable of building anything from scratch.");
        System.out.println("Whether it's a sophisticated device or a crude machine, Tyson's engineering  knows no limits.");
        nextpart();
        nextpart();
        System.out.print("\nPress Enter for overview.");
        sc.nextLine();
        System.out.println("\nFrom gadgets to full-scale machines, Tyson can build it all,");
        System.out.println("using his skills to create tools that will aid in the fight for freedom.");
        nextpart();
    }

    // Method to give a pause of 3 sec between each sentense
    void nextpart() {
        long nextsentence = System.currentTimeMillis(); // Store the start time
        while (System.currentTimeMillis() - nextsentence < 3000) {
            // Do nothing for 3 seconds
        }
    }
}