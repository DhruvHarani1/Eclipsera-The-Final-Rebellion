/*  Eclipsera: The Final Rebellion
    meaning of name
    Eclipsera --> Eclipse + era         //eclipse referes to solar eclipse the dark time
    so the darkest time of this era
    and the final rebeliion mean the final and biggest war of this era
    so ----->  Eclipsera: The Final Rebellion <-----

  */

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
    Calling Call = new Calling();
    ClockTower CT = new ClockTower();

    // variables
    int[] alreadyCalled = new int[4]; // used in part 1 to find which charater is already called
    boolean flag = true;

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

        System.out.print("\nPress Enter To Continue.");
        sc.nextLine();
        nextpart();

        System.out.println("\n\t\t\t******************************************************");
        System.out.println("\t\t\t*                 Episode 1: Calling                 *");
        System.out.println("\t\t\t******************************************************");
        nextpart();

        System.out.println("\n*****Switching role To Professor may take upto 5 sec*****");
        nextpart();
        System.out.println("\nFirst of all");
        System.out.println("As Professor you need to gather TEAM\n");
        for (int i = 1; i < 5; i++) {

            flag = true;

            System.out.println("Select a member to add to the team:");
            System.out.println("Press 1 for Arjun");
            System.out.println("Press 2 for Suhani");
            System.out.println("Press 3 for Alex");
            System.out.println("Press 4 for Tyson");
            System.out.print("Enter number: ");
            int select = sc.nextInt();
            sc.nextLine();
            alreadyCalled[i - 1] = select;

            for (int j = 0; j < alreadyCalled.length; j++) {
                if (select == alreadyCalled[j] && j != (i - 1)) {
                    System.out.println("\nAlready Called Call Someone Else\n");
                    i--;
                    flag = false;
                    break;
                }
            }

            if (select < 1 || select > 4) {
                System.out.println("\n Please Enter correct number between 1 to 4\n");
                i--;
            } else if (flag) {
                Call.callingMain(select);
            }
        }
        // End Of Episode 1 calling

        // Episode 2 Clock Tower

        System.out.print("\nPress Enter To Continue.");
        sc.nextLine();
        nextpart();

        System.out.println("\n\t\t\t******************************************************");
        System.out.println("\t\t\t*                 Episode 2: Clock Tower             *");
        System.out.println("\t\t\t******************************************************");
        nextpart();
        CT.clockTowerMain();

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
        // nextpart();
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
        System.out.println(
                "Whether it's a sophisticated device or a crude machine, Tyson's engineering  knows no limits.");
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

class Calling {

    // classes
    Scanner sc = new Scanner(System.in);

    void callingMain(int calling) {
        if (calling == 1) {
            displayTitle("Switching Role to Arjun");
            nextpart();

            System.out.println("--------------------------------------------------------------------------");
            System.out.println("|| Scene: A dark chamber filled with laser traps and crumbling walls. ||");
            System.out.println("|| Arjun, the strategist, must diffuse a tripwire to escape the room. ||");
            System.out.println("--------------------------------------------------------------------------");
            nextpart();
            nextpart();

            displayMessage("\n<-- Arjun: One wrong move, and this whole place", false);
            displayMessage("goes up in flames. Focus, Arjun. focus. -->", false);
            nextpart();

            System.out.println("\nOn the left wall, it's written - 'The color when a vehicle STOPS'."); // hint
            nextpart();

            String wire;
            do {
                System.out.println("\nAvailable Wires:");
                System.out.println("1) RED");
                System.out.println("2) GREEN");
                System.out.println("3) YELLOW");
                System.out.print("Choose a wire to cut: ");
                wire = sc.next().toLowerCase();

                switch (wire) {
                    case "red":
                        displayMessage("Arjun: I trust my instincts. Let's do this!", true);
                        nextpart();
                        break;

                    case "green":
                    case "yellow":
                        displayMessage("\nBOOM! The room explodes into flames. Press Enter to rewind.", false);
                        sc.nextLine(); // Clear input
                        sc.nextLine();
                        break;

                    default:
                        displayMessage("\nInvalid choice. Please enter 'Red', 'Green', or 'Yellow'.", false);
                        break;
                }
            } while (!wire.equals("red"));

            displayMessage("\nArjun cuts the RED wire, and the room powers down.", false);
            nextpart();
            System.out.println();

            displayMessage("A faint voice echoes from a hidden speaker above.", true);
            nextpart();
            System.out.println();

            displayMessage("Voice: You're a natural-born leader, Arjun.", false);
            nextpart();
            displayMessage("But even the best leaders need a team.", false);
            nextpart();
            displayMessage("meet me at the Clock Tower. Midnight.", false);
            nextpart();
            System.out.println();
            displayMessage("Arjun (thinking): 'A team? What does that even mean? I need answers.'", true);
            System.out.println();
            nextpart();

        } else if (calling == 2) {
            displayTitle("Switching Role to Suhani");
            nextpart();

            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("|| Scene: A futuristic lab with shattered glass and chemical spills.       ||");
            System.out.println("|| Suhani, the scientist, is surrounded by broken equipment and chemicals  ||");
            System.out.println("|| as she frantically mixes compounds to neutralize a spreading gas(Cl).   ||");
            System.out.println("---------------------------------------------------------------------------------");
            nextpart();
            nextpart();
            nextpart();

            displayMessage("\n<-- Suhani: I need a stabilizer.", false);
            displayMessage("Without it, this gas will take me out -->", false);
            nextpart();

            System.out.println("\n\tIn the Flask on table, it's written - 'NaOH'"); // hint
            nextpart();
            System.out.println("\n\tCl + NaOH ---> NaCl + NaOCl + Water"); // hint
            nextpart();

            String chemical;
            do {
                System.out.println("\nAvailable stabilizer:");
                System.out.println("1) NaCl");
                System.out.println("2) NaOH");
                System.out.println("3) NaOCl");
                System.out.print("Choose a stabilizer: ");
                chemical = sc.next().toLowerCase();

                switch (chemical) {
                    case "naoh":
                        displayMessage("Suhani: God I trust you. Hare Krishna!", true);
                        nextpart();
                        break;

                    case "nacl":
                    case "naocl":
                        displayMessage("\nShit! The gas spread in the Room. Press Enter to rewind.", false);
                        sc.nextLine(); // Clear input
                        sc.nextLine();
                        break;

                    default:
                        displayMessage("\nInvalid choice. Please enter 'NaOH', 'NaCl', or 'NaOCl'.", false);
                        break;
                }
            } while (!chemical.equals("naoh"));

            displayMessage("\nSuhani pours NaOH in mixture, and the gas stops spreading.", false);
            nextpart();
            System.out.println();

            displayMessage("revealing a monitor flashing a message:", true);
            nextpart();
            System.out.println();

            displayMessage("Your brilliance is wasted here, Suhani.", false);
            nextpart();
            displayMessage("If you want to fix what's broken,", false);
            nextpart();
            displayMessage("meet me at the Clock Tower. Midnight.", false);
            nextpart();
            System.out.println();
            displayMessage("Suhani (thinking): 'Fix what's broken? Who sent this?'", true);
            System.out.println();
            nextpart();

        } else if (calling == 3) {
            displayTitle("Switching Role to Alex");
            nextpart();

            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("|| Scene: A bunker, wires hanging in every corner. Alex, the tech genius, is  ||");
            System.out.println("|| typing on a malfunctioning terminal as alarms blare in the background.     ||");
            System.out.println("---------------------------------------------------------------------------------");
            nextpart();
            nextpart();

            displayMessage("\n<-- Alex: I will hack this at any cost!", false);
            displayMessage("    What should I do?-->", false);
            nextpart();

            System.out.println("\n\tOn the mini screen hanging, it's written"); // hint
            nextpart();
            System.out.println("\n\t'Google a Tech Giant of 2030 Destroyed After DDoS attack"); // hint
            nextpart();

            String attacktype;
            do {
                System.out.println("\nAvailable Attacks:");
                System.out.println("1) SQLi (SQL Injection)");
                System.out.println("2) MitM (Man-in-the-Middle)");
                System.out.println("3) DDoS (Distributed Denial of Service)");
                System.out.print("Choose a Attack: ");
                attacktype = sc.next().toLowerCase();

                switch (attacktype) {
                    case "ddos":
                        displayMessage("Alex: Come on... bypass the firewall!", true);
                        nextpart();
                        break;

                    case "mitm":
                    case "sqli":
                        displayMessage("\nAttack Failed!!! Press Enter to rewind.", false);
                        sc.nextLine(); // Clear input
                        sc.nextLine();
                        break;

                    default:
                        displayMessage("\nInvalid choice. Please enter 'DDos', 'MitM', or 'SQLi'.", false);
                        break;
                }
            } while (!attacktype.equals("ddos"));

            displayMessage("Alex perform DDos attack, and downs the system", false);
            nextpart();
            System.out.println();

            displayMessage("The screen flashes red: and a new message appears", true);
            nextpart();
            System.out.println();

            displayMessage("This system is only the beginning, Alex.", false);
            nextpart();
            displayMessage("If you want to break through,", false);
            nextpart();
            displayMessage("meet me at the Clock Tower. Midnight.", false);
            nextpart();
            System.out.println();
            displayMessage("Alex (thinking): 'Who's watching me? And what's this Clock Tower?'", true);
            System.out.println();
            nextpart();

        } else if (calling == 4) {

            displayTitle("Switching Role to Tyson");
            nextpart();

            System.out.println("------------------------------------------------------------------------");
            System.out.println("|| Scene: A workshop filled with broken machines and sparking wires. ||");
            System.out.println("|| Tyson, the hardware engineer,                                     ||");
            System.out.println("|| A combination of brilliant Mind and powerful hands                ||");
            System.out.println("------------------------------------------------------------------------");
            nextpart();
            nextpart();

            displayMessage("\n<-- Tyson: Just one more connection,", false);
            displayMessage("    and this place will hold for another day! -->", false);
            nextpart();

            System.out.println("\n\tOn the picture hanging on wall shows"); // hint
            nextpart();
            System.out.println("\n\t'The fuel should be three-fourths part for the generator to work'"); // hint
            nextpart();

            String fuel;
            do {
                System.out.println("\nfuel to fill:");
                System.out.println("1) 100%");
                System.out.println("2) 75%");
                System.out.println("3) 50%");
                System.out.println("4) 25%");
                System.out.print("Choose  percentage: ");
                fuel = sc.next().toLowerCase();

                switch (fuel) {
                    case "100":
                        displayMessage("\nOver Filled Press Enter to rewind.", false);
                        sc.nextLine(); // Clear input
                        sc.nextLine();
                        break;
                    case "75":
                        displayMessage("Tyson: Its Time to ROCK!!!", true);
                        nextpart();
                        break;

                    case "50":
                    case "25":
                        displayMessage("\nInsufficient Fuel Press Enter to rewind.", false);
                        sc.nextLine(); // Clear input
                        sc.nextLine();
                        break;

                    default:
                        displayMessage("\nInvalid choice. Please enter '100', '75', , '50' or '25'.", false);
                        break;
                }
            } while (!fuel.equals("75"));

            displayMessage("\nThe generator roars to life,", false);
            nextpart();

            displayMessage("and a hologram projects from its core.", false);
            nextpart();
            System.out.println();

            displayMessage("The hologram speaks: You build for survival, Tyson.", false);
            nextpart();
            displayMessage("But what if I told you there's more to fight for?", false);
            nextpart();
            displayMessage("Meet me at the Clock Tower. Midnight.", false);
            nextpart();
            System.out.println();
            displayMessage("Tyson (thinking): 'More to fight for? What the hell is going on?", true);
            System.out.println();
            nextpart();
        }
    }

    // Method to display a formatted title
    void displayTitle(String title) {
        System.out.println("\n===================================");
        System.out.println("           " + title);
        System.out.println("===================================\n");
    }

    // Method to display a message with optional emphasis
    void displayMessage(String message, boolean addStars) {
        if (addStars) {
            System.out.println("* " + message + " *");
        } else {
            System.out.println(message);
        }
    }

    // Utility to prompt and wait for the user to press Enter
    void waitForEnter(String prompt) {
        System.out.println(prompt);
        sc.nextLine();
    }

    // Method to add a pause of 3 seconds between scenes
    void nextpart() {
        long nextsentence = System.currentTimeMillis(); // Store the start time
        while (System.currentTimeMillis() - nextsentence < 3000) {
            // Wait for 3 seconds
        }
    }
}

class ClockTower {

    // classes
    Scanner sc = new Scanner(System.in);

    void clockTowerMain() {

        System.out.println("---------------------------------------------------------");
        System.out.println("|| Scene: A towering structure surrounded in mist,     ||");
        System.out.println("|| One by one, the four characters arrive,             ||");
        System.out.println("|| A hologram of a figure flickers before them         ||");
        System.out.println("|| it's the mysterious Professor                       ||");
        System.out.println("---------------------------------------------------------");
        nextpart();
        nextpart();
        nextpart();
        System.out.println("\n*****Switching role To Professor may take some Time*****");
        nextpart();

        displayMessage("\n<-- Professor: Welcome. You've all proven yourselves", false);
        displayMessage("\n    capable of surviving in this nightmare. Congratulations", false);
        displayMessage("\n    But survival isn't enough. Humanity needs you to fight back. -->", false);
        nextpart();
        nextpart();

        System.out.println();
        displayMessage("Arjun: Who are you, and why should we trust you?", true);
        nextpart();
        System.out.println();

        waitForEnter("Press Enter To Reply");
        System.out.println();
        displayMessage("I'm the one who knows how to get you out of here.", false);
        nextpart();
        displayMessage("This prison, Eclipsera, was built to enslave us.", false);
        nextpart();
        displayMessage("But every system has a weakness, and I've found it.", false);
        nextpart();

        System.out.println();
        displayMessage("Suhani: And what exactly do you expect us to do?", true);
        nextpart();
        System.out.println();
        
        waitForEnter("Press Enter To Reply");
        System.out.println();
        displayMessage("Fight against Nexus", false);
        displayMessage("Destroy Eclipsera", false);
        displayMessage("and free humanity.", false);
        nextpart();

        System.out.println();
        displayMessage("Alex: And here I thought my day couldn't get worse. Why us?", true);
        nextpart();
        System.out.println();
        
        waitForEnter("Press Enter To Reply");
        System.out.println();
        displayMessage("Because each of you has a skill this system fears.", false);
        nextpart();
        displayMessage("Suhani , Alex and Tyson you all have different Skills", false);
        nextpart();
        displayMessage("and Arjun Knows when and where to execute them .", false);
        nextpart();

        System.out.println();
        displayMessage("Tyson : And what happens if we fail?", true);
        nextpart();
        System.out.println();
        
        waitForEnter("Press Enter To Reply");
        System.out.println();
        displayMessage("Failure is not an option.", false);
        displayMessage("You're humanity's last hope.", false);
        nextpart();
        System.out.println();
        System.out.println();

        System.out.println("\t<*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*>");
        System.out.println("\t<>                                                                       <>");
        System.out.println("\t<>      The hologram flickers as the Clock Tower begins to shake.        <>");
        System.out.println("\t<>      The Professor's voice grows urgent!!!                            <>");
        System.out.println("\t<>                                                                       <>");
        System.out.println("\t<*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*>");
        System.out.println();
        nextpart();
        nextpart();

        displayMessage("\nProfessor: The system knows you're here.", false);
        displayMessage("\n    Go now ,I will contact you later", false);
        displayMessage("\n    Na Nexus amar hai, na uski ghulami!", false);
        nextpart();
    }

    // Method to display a message with optional emphasis
    void displayMessage(String message, boolean addStars) {
        if (addStars) {
            System.out.println("* " + message + " *");
        } else {
            System.out.println(message);
        }
    }

    // Utility to prompt and wait for the user to press Enter
    void waitForEnter(String prompt) {
        System.out.println(prompt);
        sc.nextLine();
    }

    // Method to add a pause of 3 seconds between scenes
    void nextpart() {
        long nextsentence = System.currentTimeMillis(); // Store the start time
        while (System.currentTimeMillis() - nextsentence < 3000) {
            // Wait for 3 seconds
        }
    }

}