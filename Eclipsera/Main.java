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

        System.out.println("\nFirst Lets Introduct with Characters.");
        System.out.print("Press Enter To Continue");
        sc.nextLine();

        professorIntroduction();
        alexIntroduction();
        suhaniIntroduction();
        arjunIntroduction();
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
    }

    // Method For professor Introduction
    void professorIntroduction() {
        System.out.println("\n\t********************");
        System.out.println("\t*     Professor    *");
        System.out.println("\t********************");
        nextpart();
        System.out.println("Professor Was One Of The Researcher Who Made Nexus");
        System.out.println("The scientist who created part of the virtual world,");
        nextpart();
        nextpart();
        System.out.println("now determined to undo his mistake.");
        nextpart();
        System.out.println("\nNO one knows his real name But He Knows Everbody");
        nextpart();
        System.out.print("Press Enter for overview");
        sc.nextLine();
        System.out.println("Professor Is Genius , Data Scientist  And Knows About The Nexus");
        nextpart();
        System.out.print("Press Enter To View next Character");
        sc.nextLine();
    }

    // Method For Tech Introduction (Initial name --> Alex)
    void alexIntroduction() {
        System.out.println("\n\t********************");
        System.out.println("\t*     Alex         *");
        System.out.println("\t********************");
        nextpart();
        System.out.println("Alex Is A Tech Expert");
        System.out.println("Passes his days by Hacking minor Systems To Live his livelhood");
        nextpart();
        nextpart();
        System.out.print("Press Enter for overview");
        sc.nextLine();
        System.out.println("Alex Is a Hacker , intrested In Tech");
        nextpart();
        System.out.print("Press Enter To View next Character");
        sc.nextLine();
    }

    // Method For Scientist Introduction (Initial name --> Suhani)
    void suhaniIntroduction() {
        System.out.println("\n\t********************");
        System.out.println("\t*     Suhani       *");
        System.out.println("\t********************");
        nextpart();
        System.out.println("Suhani Is A  Physics And Chemistry Champ");
        System.out.println("Passes her days in Eclipsera doing Experiments ");
        nextpart();
        nextpart();
        System.out.print("Press Enter for overview");
        sc.nextLine();
        System.out.println("Suhani Understands Physics And Chemistry Well");
        nextpart();
        System.out.print("Press Enter To View next Character");
        sc.nextLine();
    }

    // Method For Strategy Maker Introduction (Initial name --> Arjun)
    void arjunIntroduction() {
        System.out.println("\n\t********************");
        System.out.println("\t*     Arjun        *");
        System.out.println("\t********************");
        nextpart();
        System.out.println("Arjun Is A  Strategy maker");
        System.out.println("Who Is Able To Find Ways in any Situation ");
        nextpart();
        nextpart();
        System.out.print("Press Enter for overview");
        sc.nextLine();
        System.out.println("Arjun is well known for his Intelligence And his ability to be a Leader");
        nextpart();
        System.out.print("Press Enter To View next Character");
        sc.nextLine();
    }

    // Method For hardWare engineer Maker Introduction (Initial name --> Tyson)
    void tysonIntroduction() {
        System.out.println("\n\t********************");
        System.out.println("\t*     Tyson        *");
        System.out.println("\t********************");        nextpart();
        System.out.println("Tyson is a engineering");
        System.out.println("he can make any type of Machine From Scratch");
        nextpart();
        nextpart();
        System.out.print("Press Enter for overview");
        sc.nextLine();
        System.out.println("Tyson can built any type of Device ");
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