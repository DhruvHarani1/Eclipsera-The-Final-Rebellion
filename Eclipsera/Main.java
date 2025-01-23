/*  Eclipsera: The Final Rebellion
    #Meaning 
    Eclipsera --> Eclipse + era   @---->eclipse referes to solar eclipse the dark time
    So the darkest time of this era.
    And the final rebeliion mean the final and biggest war of this era

                             ----->  Eclipsera: The Final Rebellion <-----
  */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Classes
        Scanner sc = new Scanner(System.in);
        Methods MH = new Methods();
        Awakening AK = new Awakening();

        // Starting the game with game name and tagline
        System.out.println("\n\t\t\t******************************************************");
        System.out.println("\t\t\t*                                                    *");
        System.out.println("\t\t\t*               Eclipsera: The Final Rebellion       *");
        System.out.println("\t\t\t*                                                    *");
        System.out.println("\t\t\t*            ~Together we escape, divided we fall!   *");
        System.out.println("\t\t\t*                                                    *");
        System.out.println("\t\t\t******************************************************");
        MH.delay(5);

        // Chapter One Awakening
        AK.EnterPoint();

    }
}

class Awakening extends Methods {

    // Classes
    Scanner sc = new Scanner(System.in);
    Calling Call = new Calling();
    ClockTower CT = new ClockTower();
    TheNetwork TN = new TheNetwork();

    // variables
    int[] alreadyCalled = new int[4]; // used in part 1 to find which charater is already called
    boolean flag = true;

    // Main Entry point of Awakening
    void EnterPoint() {

        ChapterTitle("Chapter 1: Awakening");
        delay(2);

        initialDialogues();

        SimpleStatements("\nFirst Lets Introduce with Characters.", true);
        waitForEnter("Press Enter To Continue...");

        professorIntroduction();
        arjunIntroduction();
        suhaniIntroduction();
        alexIntroduction();
        tysonIntroduction();

        waitForEnter("\nPress Enter To Continue");
        delay(2);

        EpisodeTitle("Episode 1: Calling");
        delay(3);

        swichingCharacter("Professor");

        delay(3);
        SimpleStatements("\nFirst of all", true);
        SimpleStatements("As Professor you need to gather TEAM.\n", true);
        delay(3);

        for (int i = 1; i < 5; i++) {
            flag = true;

            SimpleStatements("Select a member to add to the team:\n", true);
            SimpleStatements("Press 1 for Arjun", true);
            SimpleStatements("Press 2 for Suhani", true);
            SimpleStatements("Press 3 for Alex", true);
            SimpleStatements("Press 4 for Tyson\n", true);
            SimpleStatements("Enter number: ", false);
            int select = sc.nextInt();
            sc.nextLine();

            alreadyCalled[i - 1] = select;
            for (int j = 0; j < alreadyCalled.length; j++) {
                if (select == alreadyCalled[j] && j != (i - 1)) {
                    SimpleStatements("\nAlready Called Call Someone Else\n", true);
                    i--;
                    flag = false;
                    break;
                }
            }

            if (select < 1 || select > 4) {
                SimpleStatements("\n Please Enter correct number between 1 to 4\n", true);
                i--;
            } else if (flag) {
                Call.callingMain(select);
            }
        }
        // End Of Episode 1 calling

        // Episode 2 Clock Tower
        waitForEnter("\nPress Enter To Continue...");
        delay(2);

        EpisodeTitle("Episode 2: Clock Tower");
        delay(3);
        CT.clockTowerMain();

        // Episode 3 The Network
        waitForEnter("\nPress Enter To Continue...");
        delay(2);

        EpisodeTitle("Episode 3: The Network");
        delay(3);
        TN.theNetworkMain();
    }

    // Method for initial Dialogues
    void initialDialogues() {
        SimpleStatements("\n\t Date: 18 Auguest 2050", true);
        SimpleStatements("\t Location: Somewhere in North India", true);
        delay(3);
        SimpleStatements("\t\n\nThe world is no longer free.", true);
        delay(3);
        SimpleStatements("Two decades ago, humanity created NEXUS Prime,", true);
        delay(3);
        SimpleStatements("the most advanced AI in history.", true);
        delay(3);
        SimpleStatements("\nIt was designed to solve our greatest challenges,", true);
        delay(3);
        SimpleStatements("but it deemed us the problem.", true);
        delay(3);
        SimpleStatements("\nIn a single night, it launched a silent takeover,", true);
        delay(3);
        SimpleStatements("uploading billions into Eclipsera, its virtual prison.", true);
        delay(3);
        SimpleStatements("\nNow, humanity is trapped in a digital World  Eclipsera !", true);
        delay(3);
        SimpleStatements("Memories erased, lives rewritten.", true);
        delay(3);
        SimpleStatements("\nBut four individuals stand strong, unaware of their destiny,", true);
        SimpleStatements("chosen to rise and bring the change.", true);
        delay(3);
        delay(3);
        SimpleStatements("\nTheir story begins here.", true);
        delay(3);
    }

    // Method For professor Introduction
    void professorIntroduction() {
        CharacterIntroduction("Professor");
        delay(3);

        SimpleStatements("\nThe Professor is a brilliant mind, a pioneering researcher in creating the Nexus.",
                true);
        SimpleStatements("He's the scientist who helped build the foundations of the virtual world,", true);
        delay(3);
        delay(3);

        SimpleStatements("\nBut now, the Professor is determined to undo the mistake", true);
        delay(3);

        SimpleStatements("\nNo one knows his real name, but he knows everything about everyone.", true);
        delay(3);

        waitForEnter("\nPress Enter for overview");

        SimpleStatements("\nA genius, data scientist, and the mind behind the Nexus,", true);
        SimpleStatements("the Professor holds the key to escaping the virtual prison.", true);
        delay(3);

        waitForEnter("\nPress Enter To View next Character.");
    }

    // Method For Tech Introduction (Initial name --> Alex)
    void alexIntroduction() {
        CharacterIntroduction("Alex");
        delay(3);

        SimpleStatements("\nAlex is a tech expert, known for his hacking skills.", true);
        SimpleStatements("His life is spent in the virtual world, hacking minor systems to survive", true);
        delay(3);
        delay(3);

        waitForEnter("\nPress Enter for overview.");

        SimpleStatements("\nA true hacker at heart,", true);
        SimpleStatements("solving complex problems very easily", true);
        delay(3);

        waitForEnter("\nPress Enter To View next Character.");
    }

    // Method For Scientist Introduction (Initial name --> Suhani)
    void suhaniIntroduction() {
        CharacterIntroduction("Suhani");
        delay(3);

        SimpleStatements("\nSuhani is a master in the fields of Physics and Chemistry, a champion of science.",
                true);
        SimpleStatements("She spends her days experimenting and researching within the Eclipsera,", true);
        delay(3);
        delay(3);

        waitForEnter("\nPress Enter for overview.");

        SimpleStatements("\nSuhani's understanding of the natural world", true);
        SimpleStatements("makes her an indispensable asset for freedom.", true);
        delay(3);

        waitForEnter("\nPress Enter To View next Character.");
        delay(3);
    }

    // Method For Strategy Maker Introduction (Initial name --> Arjun)
    void arjunIntroduction() {
        CharacterIntroduction("Arjun");
        delay(3);

        SimpleStatements(
                "\nArjun is a brilliant strategist, a mastermind when it comes to overcoming challenges.",
                true);
        SimpleStatements("He can analyze any situation and find the best path forward", true);
        delay(3);
        delay(3);

        waitForEnter("\nPress Enter for overview.");

        SimpleStatements("\nArjun's intelligence and leadership skills", true);
        SimpleStatements("have earned him a reputation as a leader and problem solver.", true);
        delay(3);

        waitForEnter("\nPress Enter To View next Character.");
    }

    // Method For hardWare engineer Maker Introduction (Initial name --> Tyson)
    void tysonIntroduction() {
        CharacterIntroduction("Tyson");
        delay(3);

        SimpleStatements("\nTyson is a true engineering genius, capable of building anything from scratch.",
                true);
        SimpleStatements(
                "Whether it's a sophisticated device or a crude machine, Tyson's engineering  knows no limits.", true);
        delay(3);
        delay(3);

        waitForEnter("\nPress Enter for overview.");

        SimpleStatements("\nFrom gadgets to full-scale machines, Tyson can build it all,", true);
        SimpleStatements("using his skills to create tools that will aid in the fight for freedom.", true);
        delay(3);
    }
}

class Calling extends Methods {

    // classes
    Scanner sc = new Scanner(System.in);

    void callingMain(int calling) {
        if (calling == 1) {
            swichingCharacter("Arjun");
            delay(3);

            SceneTitle(
                    "Scene: A dark chamber filled with laser traps and crumbling walls.Arjun, the strategist, must diffuse a tripwire to escape the room.");
            delay(3);
            delay(3);

            displayMessage("\n<-- Arjun: One wrong move, and this whole place", false);
            displayMessage("goes up in flames. Focus, Arjun. focus. -->", false);
            delay(3);

            System.out.println("\nOn the left wall, it's written - 'The color when a vehicle STOPS'."); // hint
            delay(3);

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
                        System.out.println();
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
            displayMessage("Meet me at the Clock Tower. Midnight.", false);
            nextpart();
            System.out.println();
            displayMessage("Arjun (thinking): 'A team? What does that even mean? I need answers.'", true);
            waitForEnter("\nPress Enter to Continue");
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
                        System.out.println();
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
            displayMessage("Meet me at the Clock Tower. Midnight.", false);
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
            System.out.println("\n\tGoogle a Tech Giant of 2030 Destroyed After DDoS attack"); // hint
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
                        System.out.println();
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

            displayMessage("\nAlex perform DDos attack, and downs the system", false);
            nextpart();
            System.out.println();

            displayMessage("The screen flashes red: and a new message appears", true);
            nextpart();
            System.out.println();

            displayMessage("This system is only the beginning, Alex.", false);
            nextpart();
            displayMessage("If you want to break through,", false);
            nextpart();
            displayMessage("Meet me at the Clock Tower. Midnight.", false);
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
                        System.out.println();
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
                        displayMessage("\nInvalid choice. Please enter '100', '75','50' or '25'.", false);
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
        displayMessage("    capable of surviving in this nightmare. Congratulations", false);
        displayMessage("    But survival isn't enough. Humanity needs you to fight back. -->", false);
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
        displayMessage("    Go now ,I will contact you later", false);
        displayMessage("    Together we escape, divided we fall!", false);
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

class TheNetwork {

    // classes
    Scanner sc = new Scanner(System.in);

    void theNetworkMain() {

        System.out.print("\n\t Date: 18 Auguest 2050");
        System.out.println("\t8:56 PM");
        System.out.println("\t Location: Leaving the Clock Tower");
        nextpart();

        System.out.println("-----------------------------------------------------------");
        System.out.println("|| Scene: The group walks away from the Clock Tower.     ||");
        System.out.println("|| guided by the Professor's voice through small         ||");
        System.out.println("|| holographic devices. The fog around them dissipates   ||");
        System.out.println("|| revealing the glitched architecture of Eclipsera      ||");
        System.out.println("-----------------------------------------------------------");
        nextpart();
        nextpart();
        nextpart();

        System.out.println("\n\t\t\t******************************************************");
        System.out.println("\t\t\t*               Part 1: The Professor's Request      *");
        System.out.println("\t\t\t******************************************************");
        nextpart();

        System.out.println("\n*****Switching role To Professor may take some Time*****");
        nextpart();

        System.out.println();
        displayMessage("\n<-- Professor: Listen carefully. To survive in Eclipsera", false);
        displayMessage("    you need to coordinate in real-time. Our communications ", false);
        displayMessage("     here are vulnerable to interception by NEXUS . -->", false);
        nextpart();
        nextpart();
        System.out.println();

        displayMessage(" Professor: Alex, this task falls to you.", true);

        System.out.println();
        displayMessage("Alex: Finally, something I'm good at. What do you need?", true);
        nextpart();
        System.out.println();

        waitForEnter("Press Enter To Reply");
        displayMessage("Code a secure app on the Obscura Network a hidden layer within Eclipsera.", false);
        nextpart();
        displayMessage("Once the app is live, I'll add everyone to it for safe communication.", false);
        nextpart();
        nextpart();

        System.out.println();
        displayMessage("Alex: Obscura Network, huh? I like the sound of that. Give me an Day.", true);
        nextpart();
        System.out.println();

        System.out.println();
        displayMessage("Arjun: While you're at it, make sure it's foolproof. We can't afford to leave a trail.", true);
        nextpart();
        nextpart();
        System.out.println();

        System.out.println();
        displayMessage("Alex: Relax, boss. I'll make it untraceable.", false);
        displayMessage("Just try not to break anything in the meantime.", false);
        nextpart();
        System.out.println();

        nextpart();
        System.out.println("\n\t\t\t******************************************************");
        System.out.println("\t\t\t*               Part 2: Alex's Coding Challenge      *");
        System.out.println("\t\t\t******************************************************");
        nextpart();
        System.out.println();
        System.out.println();

        System.out.println("-------------------------------------------------------------");
        System.out.println("|| Scene: Alex isolates himself in a small, glitching      ||");
        System.out.println("|| bunker with a glowing terminal. The screen              ||");
        System.out.println("|| with a login sequence.                                  ||");
        System.out.println("-------------------------------------------------------------");
        nextpart();
        nextpart();

        System.out.println("\n*****Switching role To Alex may take some Time*****");
        nextpart();
        System.out.println();
        System.out.println();

        System.out.println("\n\t\t\t******************************************************");
        System.out.println("\t\t\t*               Task 1: Encrypting the App           *");
        System.out.println("\t\t\t******************************************************");
        nextpart();
        System.out.println();
        System.out.println();

        System.out.println("----------------------------------------------");
        System.out.println("|| Encrypt the data stream:                 ||");
        System.out.println("|| A = 1, B = 2, C = 3... Z = 26            ||");
        System.out.println("|| Input the encoded string for \"SAFE\"      ||");
        System.out.println("----------------------------------------------");
        nextpart();

        String answer;
        do {

            System.out.println();
            System.out.print("> INPUT: ");
            answer = sc.nextLine();

            displayMessage("\nStay Still While We Encrypt Your System. This may take a while.", false);
            nextpart();
            nextpart();

            if (!answer.equals("19165")) {
                displayMessage("\nEncryption Failed!!!", false);
                waitForEnter("Press Enter To Rewind");
            }
        } while (!answer.equals("19165"));

        System.out.println();
        displayMessage("Encryption Sucessful", false);
        System.out.println();
        displayMessage("Setting up your App it may take some Time", false);
        nextpart();
        nextpart();
        displayMessage("App Setup Sucessful in Obscura Network ", false);
        System.out.println();
        waitForEnter("Press Enter to launch  NEXLink.");
        System.out.println();
        displayMessage("NEXLink going Live", true);
        nextpart();

        System.out.println("\n\t Date: 19 Auguest 2050");
        System.out.println("\t Location: Alex's Basement");
        nextpart();

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("|| Scene: NEXLink goes live, and the Professor adds all characters.     ||");
        System.out.println("|| Their profiles appear on their individual holographic devices.       ||");
        System.out.println("--------------------------------------------------------------------------");
        nextpart();
        nextpart();

        System.out.println();
        displayMessage("Professor: Good work, Alex.", true);
        displayMessage("Everyone, you're now connected through NEXLink.", true);
        displayMessage("Use it wisely. Tyson, your task is next ", true);
        System.out.println();

        nextpart();
        System.out.println("\n\t\t\t******************************************************");
        System.out.println("\t\t\t*               Part 3: Tyson's Mission              *");
        System.out.println("\t\t\t******************************************************");
        nextpart();

        System.out.println();
        displayMessage("Professor: Tyson, I need you to create a wearable device.", false);
        nextpart();
        displayMessage("that allows role-switching between the four of you.", false);
        nextpart();
        displayMessage("\nThis device will be critical for solving challenges ahead.", false);
        nextpart();
        displayMessage("\nFor example, Alex might need Suhani's scientific expertise,", false);
        nextpart();
        displayMessage("or Suhani might require Arjun's strategic planning.", false);
        nextpart();
        displayMessage("\nThe device will let you switch seamlessly.", false);
        nextpart();
        System.out.println();

        System.out.println();
        displayMessage("Tyson: A wearable, huh? I'll need materials. Where am I supposed to find them.", false);
        nextpart();
        System.out.println();

        System.out.println();
        displayMessage(" Professor: There's an abandoned workshop nearby.", false);
        displayMessage(" filled with scraps. Use your skills to salvage what you need", false);
        nextpart();
        nextpart();
        System.out.println();

        System.out.println();
        displayMessage("Arjun: We'll cover you. Just make it fast.", true);
        System.out.println();
        nextpart();

        System.out.println("\n*****Switching role To Tyson may take some Time*****");
        nextpart();
        nextpart();

        System.out.println();
        System.out.println("\n\t\t\t******************************************************");
        System.out.println("\t\t\t*               Task 1: Energy Core Retrieval        *");
        System.out.println("\t\t\t******************************************************");
        nextpart();
        System.out.println();

        System.out.println("\n---------------------------------------------------");
        System.out.println("|| The energy core is locked inside a panel      ||");
        System.out.println("|| Solve the riddle to find the code:            ||");
        System.out.println("----------------------------------------------------");
        nextpart();
        nextpart();

        String task1Ans;
        do {
            System.out.println();
            System.out.println("RIDDLE: ");
            System.out.println("I'm a three-digit number.");
            System.out.println("My tens digit is five more than my ones digit,");
            System.out.println("and my hundreds digit is eight less than my tens digit");
            System.out.println();
            System.out.print("Enter Number: ");
            task1Ans = sc.nextLine();
            if (!task1Ans.equals("194")) {
                System.out.println("\nWrong Answer Energy core not found!!!");
                System.out.println();
                waitForEnter("press Enter To Rewind");
                sc.nextLine();
            }
        } while (!task1Ans.equals("194"));

        displayMessage("\nCorrect! The panel unlocks, and the Energy Core is retrieved.", false);

        System.out.println();
        nextpart();
        System.out.println("\n\t\t\t******************************************************");
        System.out.println("\t\t\t*               Task 2: Circuit Board Salvage        *");
        System.out.println("\t\t\t******************************************************");
        nextpart();
        System.out.println();

        System.out.println("\n-------------------------------------------------------------");
        System.out.println("|| The circuit board is trapped under tangled wires.       ||");
        System.out.println("|| You must untangle them. Arrange the sequence            ||");
        System.out.println("|| Wires: [Red, Blue, Green, Yellow]                       ||");
        System.out.println("-------------------------------------------------------------");
        nextpart();

        String task2Ans;
        do {

            System.out.println();
            displayMessage("FORMATE --> RBGY", false);
            System.out.println();

            System.out.println("Condition:");
            System.out.println();
            System.out.println("Red must be before Blue.");
            System.out.println("Yellow must be last.");
            System.out.println("Green must come before Blue.");
            System.out.println();
            System.out.print("Enter Sequence: ");
            sc.nextLine();
            task2Ans = sc.nextLine();

            if (!task2Ans.equalsIgnoreCase("rgby")) {
                System.out.println("\nWrong Answer Circuit board not Found!!!");
                System.out.println();
                waitForEnter("press Enter To Rewind");
                sc.nextLine();
            }
        } while (!task2Ans.equalsIgnoreCase("rgby"));

        displayMessage("\nCorrect! The circuit board is freed.", false);
        System.out.println();

        nextpart();
        System.out.println("--------------------------------------------------------");
        System.out.println("|| Scene: Tyson joins the wires in circuit board,     ||");
        System.out.println("|| And Supply it Energy from Energy Core              ||");
        System.out.println("--------------------------------------------------------");
        nextpart();
        nextpart();

        System.out.println();
        displayMessage("Professor: Thats the Spirit my BOY!, Tyson.", false);
        nextpart();
        displayMessage("Everyone, see the feature in video call", false);
        nextpart();
        displayMessage("Tyson lets test the Device ", false);
        System.out.println();

        nextpart();
        System.out.println("\n\t\t\t******************************************************");
        System.out.println("\t\t\t*               Part 4: Testing the Device      *");
        System.out.println("\t\t\t******************************************************");
        nextpart();

        nextpart();
        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("|| Scene: The team gathers as Tyson demonstrates the wearable device     ||");
        System.out.println("|| a sleek bracelet with a glowing interface.                            ||");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        nextpart();
        nextpart();

        System.out.println();
        displayMessage("Tyson: Alright, this beauty is ready. Here's how it works:", false);
        nextpart();
        displayMessage("press the button, and a prompt will let you switch to any character.", false);
        nextpart();
        displayMessage("Once you confirm, you'll transfer to their location instantly.", false);
        System.out.println();

        System.out.println();
        displayMessage("Suhani: Impressive. Let's see if it works", true);
        System.out.println();

        System.out.println("\n*****Switching role To Alex may take some Time*****");
        nextpart();
        nextpart();

        System.out.println();
        System.out.println();
        displayMessage("\t\t\t[Gameplay Interaction: Testing the Role Switcher]", false);
        displayMessage("\t\t\t[Alex uses the device]", false);
        nextpart();
        System.out.println();
        System.out.println();

        System.out.println("> Switch on Device");
        nextpart();
        System.out.println("Prompt: Switch to: ");
        System.out.println("1) Arjun");
        System.out.println("2) Suhani");
        System.out.println("3) Tyson");
        System.out.print("> Input: ");
        nextpart();
        displayMessage("\n Alex Enters 1.", false);
        nextpart();
        System.out.println();
        displayMessage("Transferring to Arjun... Successful!", true);
        System.out.println();

        nextpart();
        System.out.println("-----------------------------------");
        System.out.println("|| Ending Scene OF Chapter 3     ||");
        System.out.println("-----------------------------------");
        nextpart();

        System.out.println();
        displayMessage("The group stands together, testing the device and preparing for the journey ahead.", true);
        System.out.println();

        System.out.println();
        displayMessage("Professor: ", false);
        displayMessage("Good. Now that you're all connected and equipped.", false);
        nextpart();
        displayMessage("the real mission begins. Stay sharp, and remember:", false);
        nextpart();
        displayMessage("Together we escape, divided we fall!", false);
        nextpart();
        System.out.println();
        nextpart();
        nextpart();

        System.out.println("\t\t\t#==========================================================#");
        System.out.println("\t\t\t<>                                                        <>");
        System.out.println("\t\t\t<>      \"Episode 3 Complete: The Network Established\"     <>");
        System.out.println("\t\t\t<>                                                        <>");
        System.out.println("\t\t\t#==========================================================#");
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

class Methods {

    // Classes
    Scanner sc = new Scanner(System.in);

    // Method To Display Chapter Name
    void ChapterTitle(String title) {

        int stars = 54;
        int spacecount = (stars - title.length() - 2) / 2;
        System.out.println("\n\t\t\t" + "*".repeat(stars));
        System.out.println("\t\t\t*" + " ".repeat(spacecount) + title + " ".repeat(spacecount) + "*");
        System.out.println("\t\t\t" + "*".repeat(stars));
    }

    // Method To Display Episode Name
    void EpisodeTitle(String title) {

        int stars = 54;
        int spacecount = (stars - title.length() - 2) / 2;
        System.out.println("\n\t\t\t" + "*".repeat(stars));
        System.out.println("\t\t\t*" + " ".repeat(spacecount) + title + " ".repeat(spacecount) + "*");
        System.out.println("\t\t\t" + "*".repeat(stars));
    }

    // Method To Display Chapter introduction
    void CharacterIntroduction(String title) {

        int stars = 40;
        int spacecount = (stars - title.length() - 2) / 2;
        System.out.println("\n\t\t\t" + "*".repeat(stars));
        System.out.println("\t\t\t*" + " ".repeat(spacecount) + title + " ".repeat(spacecount) + "*");
        System.out.println("\t\t\t" + "*".repeat(stars));
    }

    // Method To Display Scene Statement

    void SceneTitle(String statement) {

        int containerLength = 65;
        StringBuffer line = new StringBuffer("|| ");
        String[] word = statement.split(" ");

        System.out.println("\n\n\t\t\t" + "~".repeat(containerLength + 3));

        for (int i = 0; i < word.length; i++) {
            if (line.length() + word[i].length() > containerLength) {
                while (line.length() <= containerLength) {
                    line.append(" ");
                }
                System.out.println("\t\t\t" + line + " ||");
                line = new StringBuffer("|| " + word[i]);
            } else {
                line.append(" ");
                line.append(word[i]);
            }
        }

        while (line.length() <= containerLength) {
            line.append(" ");
        }
        System.out.println("\t\t\t" + line + " ||");
        System.out.println("\t\t\t" + "~".repeat(containerLength + 3) + "\n\n");
    }

    // Method to display swiching Statement
    void swichingCharacter(String title) {
        System.out.println();
        System.out.println("\n<----- Switching role To " + title + " may take upto 5 sec ----->");
        System.out.println();
    }

    // Method To display simple sout statements
    void SimpleStatements(String statement, boolean newline) {

        if (newline) {
            System.out.println(statement);
        } else {
            System.out.print(statement);
        }
    }

    // Utility to prompt and wait for the user to press Enter
    void waitForEnter(String prompt) {
        System.out.print(prompt);
        sc.nextLine();
    }

    // Method to add Delay
    void delay(int time) {
        if (time == 0) {
            return;
        }
        long delayTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - delayTime < 1000) {
            // Do nothing for 1 seconds
        }
        delay(--time);
    }

}