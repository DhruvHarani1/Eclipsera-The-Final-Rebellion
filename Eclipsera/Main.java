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

        simpleStatement("\nFirst Lets Introduce with Characters.", true);
        waitForEnter("Press Enter To Continue...");

        professorIntroduction();
        arjunIntroduction();
        suhaniIntroduction();
        alexIntroduction();
        tysonIntroduction();

        waitForEnter("\nPress Enter To Continue");
        delay(2);

        episodeTitle("Episode 1: Calling");
        delay(3);

        swichingCharacter("Professor");

        delay(3);
        simpleStatement("\nFirst of all", true);
        simpleStatement("As Professor you need to gather TEAM.\n", true);
        delay(3);

        for (int i = 1; i < 5; i++) {
            flag = true;

            simpleStatement("Select a member to add to the team:", true);
            simpleStatement("Press 1 for Arjun", true);
            simpleStatement("Press 2 for Suhani", true);
            simpleStatement("Press 3 for Alex", true);
            simpleStatement("Press 4 for Tyson\n", true);
            simpleStatement("Enter number: ", false);
            int select = sc.nextInt();
            sc.nextLine();

            alreadyCalled[i - 1] = select;
            for (int j = 0; j < alreadyCalled.length; j++) {
                if (select == alreadyCalled[j] && j != (i - 1)) {
                    simpleStatement("\nAlready Called Call Someone Else\n", true);
                    i--;
                    flag = false;
                    break;
                }
            }

            if (select < 1 || select > 4) {
                simpleStatement("\n Please Enter correct number between 1 to 4\n", true);
                i--;
            } else if (flag) {
                Call.callingMain(select);
            }
        }
        // End Of Episode 1 calling

        // Episode 2 Clock Tower
        waitForEnter("\nPress Enter To Continue...");
        delay(2);

        episodeTitle("Episode 2: Clock Tower");
        delay(3);
        CT.clockTowerMain();

        // Episode 3 The Network
        waitForEnter("\nPress Enter To Continue...");
        delay(2);

        episodeTitle("Episode 3: The Network");
        delay(3);
        TN.theNetworkMain();
    }

    // Method for initial Dialogues
    void initialDialogues() {
        simpleStatement("\n\t Date: 18 Auguest 2050", true);
        simpleStatement("\t Location: Somewhere in North India", true);
        delay(3);
        simpleStatement("\t\n\nThe world is no longer free.", true);
        delay(3);
        simpleStatement("Two decades ago, humanity created NEXUS Prime,", true);
        delay(3);
        simpleStatement("the most advanced AI in history.", true);
        delay(3);
        simpleStatement("\nIt was designed to solve our greatest challenges,", true);
        delay(3);
        simpleStatement("but it deemed us the problem.", true);
        delay(3);
        simpleStatement("\nIn a single night, it launched a silent takeover,", true);
        delay(3);
        simpleStatement("uploading billions into Eclipsera, its virtual prison.", true);
        delay(3);
        simpleStatement("\nNow, humanity is trapped in a digital World  Eclipsera !", true);
        delay(3);
        simpleStatement("Memories erased, lives rewritten.", true);
        delay(3);
        simpleStatement("\nBut four individuals stand strong, unaware of their destiny,", true);
        simpleStatement("chosen to rise and bring the change.", true);
        delay(3);
        delay(3);
        simpleStatement("\nTheir story begins here.", true);
        delay(3);
    }

    // Method For professor Introduction
    void professorIntroduction() {
        characterIntroduction("Professor");
        delay(3);

        simpleStatement("\nThe Professor is a brilliant mind, a pioneering researcher in creating the Nexus.",
                true);
        simpleStatement("He's the scientist who helped build the foundations of the virtual world,", true);
        delay(3);
        delay(3);

        simpleStatement("\nBut now, the Professor is determined to undo the mistake", true);
        delay(3);

        simpleStatement("\nNo one knows his real name, but he knows everything about everyone.", true);
        delay(3);

        waitForEnter("\nPress Enter for overview");

        simpleStatement("\nA genius, data scientist, and the mind behind the Nexus,", true);
        simpleStatement("the Professor holds the key to escaping the virtual prison.", true);
        delay(3);

        waitForEnter("\nPress Enter To View next Character.");
    }

    // Method For Tech Introduction (Initial name --> Alex)
    void alexIntroduction() {
        characterIntroduction("Alex");
        delay(3);

        simpleStatement("\nAlex is a tech expert, known for his hacking skills.", true);
        simpleStatement("His life is spent in the virtual world, hacking minor systems to survive", true);
        delay(3);
        delay(3);

        waitForEnter("\nPress Enter for overview.");

        simpleStatement("\nA true hacker at heart,", true);
        simpleStatement("solving complex problems very easily", true);
        delay(3);

        waitForEnter("\nPress Enter To View next Character.");
    }

    // Method For Scientist Introduction (Initial name --> Suhani)
    void suhaniIntroduction() {
        characterIntroduction("Suhani");
        delay(3);

        simpleStatement("\nSuhani is a master in the fields of Physics and Chemistry, a champion of science.",
                true);
        simpleStatement("She spends her days experimenting and researching within the Eclipsera,", true);
        delay(3);
        delay(3);

        waitForEnter("\nPress Enter for overview.");

        simpleStatement("\nSuhani's understanding of the natural world", true);
        simpleStatement("makes her an indispensable asset for freedom.", true);
        delay(3);

        waitForEnter("\nPress Enter To View next Character.");
        delay(3);
    }

    // Method For Strategy Maker Introduction (Initial name --> Arjun)
    void arjunIntroduction() {
        characterIntroduction("Arjun");
        delay(3);

        simpleStatement(
                "\nArjun is a brilliant strategist, a mastermind when it comes to overcoming challenges.",
                true);
        simpleStatement("He can analyze any situation and find the best path forward", true);
        delay(3);
        delay(3);

        waitForEnter("\nPress Enter for overview.");

        simpleStatement("\nArjun's intelligence and leadership skills", true);
        simpleStatement("have earned him a reputation as a leader and problem solver.", true);
        delay(3);

        waitForEnter("\nPress Enter To View next Character.");
    }

    // Method For hardWare engineer Maker Introduction (Initial name --> Tyson)
    void tysonIntroduction() {
        characterIntroduction("Tyson");
        delay(3);

        simpleStatement("\nTyson is a true engineering genius, capable of building anything from scratch.",
                true);
        simpleStatement(
                "Whether it's a sophisticated device or a crude machine, Tyson's engineering  knows no limits.", true);
        delay(3);
        delay(3);

        waitForEnter("\nPress Enter for overview.");

        simpleStatement("\nFrom gadgets to full-scale machines, Tyson can build it all,", true);
        simpleStatement("using his skills to create tools that will aid in the fight for freedom.", true);
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

            sceneTitle(
                    "Scene: A dark chamber filled with laser traps and crumbling walls.Arjun, the strategist, must diffuse a tripwire to escape the room.");
            delay(3);
            delay(3);

            simpleStatement("\n<--- Arjun: One wrong move, and this whole place", true);
            simpleStatement("          goes up in flames. Focus, Arjun. focus. --->", true);
            delay(3);

            simpleStatement("\nOn the left wall, it's written - \"The color when a vehicle STOPS\"", true); // hint
            delay(3);

            String wire;
            do {
                simpleStatement("\nAvailable Wires:", true);
                simpleStatement("1) RED", true);
                simpleStatement("2) GREEN", true);
                simpleStatement("3) YELLOW", true);
                simpleStatement("Choose a wire to cut: ", false);
                wire = sc.next().toLowerCase();

                switch (wire) {
                    case "red":
                        simpleStatement("\nArjun: I trust my instincts. Let's do this!", true);
                        delay(3);
                        break;

                    case "green":
                    case "yellow":
                        simpleStatement("\nBOOM! The room explodes into flames. Press Enter to rewind.", false);
                        sc.nextLine(); // Clear input
                        sc.nextLine();
                        break;

                    default:
                        simpleStatement("\nInvalid choice. Please enter 'Red', 'Green', or 'Yellow'.", false);
                        break;
                }
            } while (!wire.equals("red"));

            simpleStatement("\nArjun cuts the RED wire, and the room powers down.", true);
            delay(3);
            simpleStatement("", true);

            simpleStatement("A faint voice echoes from a hidden speaker above.", true);
            delay(3);
            simpleStatement("", true);

            simpleStatement("Voice: You're a natural-born leader, Arjun.", true);
            delay(3);
            simpleStatement("But even the best leaders need a team.", true);
            delay(3);
            simpleStatement("Meet me at the Clock Tower. Midnight.", true);
            delay(3);

            simpleStatement("", true);
            simpleStatement("Arjun (thinking): 'A team? What does that even mean? I need answers.'", true);

            waitForEnter("\nPress Enter to Continue");
            simpleStatement("", true);
            delay(3);

        } else if (calling == 2) {
            swichingCharacter("Suhani");
            delay(3);

            sceneTitle(
                    "Scene: A futuristic lab with shattered glass and chemical spills. Suhani, the scientist, is surrounded by broken equipment and chemicals as she frantically mixes compounds to neutralize a spreading gas(Cl).");
            delay(3);
            delay(3);
            delay(3);

            simpleStatement("\n<--- Suhani: I need a stabilizer.", true);
            simpleStatement("      Without it, this gas will take me out --->", true);
            delay(3);

            simpleStatement("\n\tIn the Flask on table, it's written - \"NaOH\"", true); // hint
            delay(3);
            simpleStatement("\n\tCl + NaOH ---> NaCl + NaOCl + Water", true); // hint
            delay(3);

            String chemical;
            do {
                simpleStatement("\nAvailable stabilizer:", true);
                simpleStatement("1) NaCl", true);
                simpleStatement("2) NaOH", true);
                simpleStatement("3) NaOCl", true);
                simpleStatement("Choose a stabilizer: ", false);
                chemical = sc.next().toLowerCase();

                switch (chemical) {
                    case "naoh":
                        simpleStatement("", true);
                        simpleStatement("Suhani: God I trust you. Hare Krishna!", true);
                        delay(3);
                        break;

                    case "nacl":
                    case "naocl":
                        simpleStatement("\nShit! The gas spread in the Room. Press Enter to rewind.", true);
                        sc.nextLine(); // Clear input
                        sc.nextLine();
                        break;

                    default:
                        simpleStatement("\nInvalid choice. Please enter 'NaOH', 'NaCl', or 'NaOCl'.", true);
                        break;
                }
            } while (!chemical.equals("naoh"));

            simpleStatement("\nSuhani pours NaOH in mixture, and the gas stops spreading.", true);
            delay(3);
            simpleStatement("", true);

            simpleStatement("revealing a monitor flashing a message:", true);
            delay(3);
            simpleStatement("", true);

            simpleStatement("Your brilliance is wasted here, Suhani.", true);
            delay(3);
            simpleStatement("If you want to fix what's broken,", true);
            delay(3);
            simpleStatement("Meet me at the Clock Tower. Midnight.", true);
            delay(3);

            simpleStatement("", true);
            simpleStatement("Suhani (thinking): 'Fix what's broken? Who sent this?'", true);
            simpleStatement("", true);
            delay(3);

        } else if (calling == 3) {
            swichingCharacter("Alex");
            delay(3);

            sceneTitle(
                    "Scene: A bunker, wires hanging in every corner. Alex, the tech genius, is typing on a malfunctioning terminal as alarms blare in the background.");
            delay(3);
            delay(3);

            simpleStatement("\n<-- Alex: I will hack this at any cost!", true);
            simpleStatement("    What should I do?-->", true);
            delay(3);

            simpleStatement("\n\tOn the mini screen hanging, it's written", true); // hint
            delay(3);

            simpleStatement("\n\tGoogle a Tech Giant of 2030 Destroyed After DDoS attack", true); // hint
            delay(3);

            String attacktype;
            do {
                simpleStatement("\nAvailable Attacks:", true);
                simpleStatement("1) SQLi (SQL Injection)", true);
                simpleStatement("2) MitM (Man-in-the-Middle)", true);
                simpleStatement("3) DDoS (Distributed Denial of Service)", true);
                simpleStatement("Choose a Attack: ", false);
                attacktype = sc.next().toLowerCase();

                switch (attacktype) {
                    case "ddos":
                        simpleStatement("", true);
                        simpleStatement("Alex: Come on... bypass the firewall!", true);
                        delay(3);
                        break;

                    case "mitm":
                    case "sqli":
                        simpleStatement("\nAttack Failed!!! Press Enter to rewind.", true);
                        sc.nextLine(); // Clear input
                        sc.nextLine();
                        break;

                    default:
                        simpleStatement("\nInvalid choice. Please enter 'DDos', 'MitM', or 'SQLi'.", true);
                        break;
                }
            } while (!attacktype.equals("ddos"));

            simpleStatement("\nAlex perform DDos attack, and downs the system", true);
            delay(3);
            simpleStatement("", true);

            simpleStatement("The screen flashes red: and a new message appears", true);
            delay(3);
            simpleStatement("", true);

            simpleStatement("This system is only the beginning, Alex.", true);
            delay(3);
            simpleStatement("If you want to break through,", true);
            delay(3);
            simpleStatement("Meet me at the Clock Tower. Midnight.", true);
            delay(3);

            simpleStatement("", true);
            simpleStatement("Alex (thinking): 'Who's watching me? And what's this Clock Tower?'", true);
            simpleStatement("", true);
            delay(3);

        } else if (calling == 4) {

            swichingCharacter("Tyson");
            delay(3);

            sceneTitle(
                    "Scene: A workshop filled with broken machines and sparking wires. Tyson, the hardware engineer, A combination of brilliant Mind and powerful hands");
            delay(3);
            delay(3);

            simpleStatement("\n<-- Tyson: Just one more connection,", true);
            simpleStatement("    and this place will hold for another day! -->", true);
            delay(3);

            simpleStatement("\n\tOn the picture hanging on wall shows", true); // hint
            delay(3);
            simpleStatement("\n\t\"The fuel should be three-fourths part for the generator to work\"", true); // hint
            delay(3);

            String fuel;
            do {
                simpleStatement("\nfuel to fill:", true);
                simpleStatement("1) 100%", true);
                simpleStatement("2) 75%", true);
                simpleStatement("3) 50%", true);
                simpleStatement("4) 25%", true);
                simpleStatement("Choose  percentage: ", false);
                fuel = sc.next().toLowerCase();

                switch (fuel) {
                    case "100":
                        simpleStatement("\nOver Filled Press Enter to rewind.", true);
                        sc.nextLine(); // Clear input
                        sc.nextLine();
                        break;
                    case "75":
                        simpleStatement("", true);
                        simpleStatement("Tyson: Its Time to ROCK!!!", true);
                        delay(3);
                        break;

                    case "50":
                    case "25":
                        simpleStatement("\nInsufficient Fuel Press Enter to rewind.", true);
                        sc.nextLine(); // Clear input
                        sc.nextLine();
                        break;

                    default:
                        simpleStatement("\nInvalid choice. Please enter '100', '75','50' or '25'.", true);
                        break;
                }
            } while (!fuel.equals("75"));

            simpleStatement("\nThe generator roars to life,", true);
            delay(3);

            simpleStatement("and a hologram projects from its core.", true);
            delay(3);
            simpleStatement("", true);

            simpleStatement("The hologram speaks: You build for survival, Tyson.", true);
            delay(3);
            simpleStatement("But what if I told you there's more to fight for?", true);
            delay(3);
            simpleStatement("Meet me at the Clock Tower. Midnight.", true);
            delay(3);

            simpleStatement("", true);
            simpleStatement("Tyson (thinking): 'More to fight for? What the hell is going on?", true);
            simpleStatement("", true);
            delay(3);
        }
    }
}

class ClockTower extends Methods {

    // classes
    Scanner sc = new Scanner(System.in);

    void clockTowerMain() {

        sceneTitle(
                "Scene: A towering structure surrounded in mist, One by one, the four characters arrive, A hologram of a figure flickers before them it's the mysterious Professor");
        delay(3);
        delay(3);
        delay(3);

        swichingCharacter("Professor");
        delay(3);

        simpleStatement("\n<-- Professor: Welcome. You've all proven yourselves", true);
        simpleStatement("    capable of surviving in this nightmare. Congratulations", true);
        simpleStatement("    But survival isn't enough. Humanity needs you to fight back. -->", true);
        delay(3);
        delay(3);

        simpleStatement("", true);
        simpleStatement("Arjun: Who are you, and why should we trust you?", true);
        delay(3);
        simpleStatement("", true);

        waitForEnter("Press Enter To Reply");
        simpleStatement("", true);
        simpleStatement("I'm the one who knows how to get you out of here.", true);
        delay(3);
        simpleStatement("This prison, Eclipsera, was built to enslave us.", true);
        delay(3);
        simpleStatement("But every system has a weakness, and I've found it.", true);
        delay(3);

        simpleStatement("", true);
        simpleStatement("Suhani: And what exactly do you expect us to do?", true);
        delay(3);
        simpleStatement("", true);

        waitForEnter("Press Enter To Reply");
        simpleStatement("", true);
        simpleStatement("Fight against Nexus", true);
        delay(1);
        simpleStatement("Destroy Eclipsera", true);
        delay(1);
        simpleStatement("and free humanity.", true);
        delay(3);

        simpleStatement("", true);
        simpleStatement("Alex: And here I thought my day couldn't get worse. Why us?", true);
        delay(3);
        simpleStatement("", true);

        waitForEnter("Press Enter To Reply");
        simpleStatement("", true);
        simpleStatement("Because each of you has a skill this system fears.", true);
        delay(3);
        simpleStatement("Suhani , Alex and Tyson you all have different Skills", true);
        delay(3);
        simpleStatement("and Arjun Knows when and where to execute them .", true);
        delay(3);

        simpleStatement("", true);
        simpleStatement("Tyson : And what happens if we fail?", true);
        delay(3);
        simpleStatement("", true);

        waitForEnter("Press Enter To Reply");
        simpleStatement("", true);
        simpleStatement("Failure is not an option.", true);
        delay(1);
        simpleStatement("You're humanity's last hope.", true);
        delay(3);
        simpleStatement("", true);
        simpleStatement("", true);

        System.out.println("\t<*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*>");
        System.out.println("\t<>                                                                       <>");
        System.out.println("\t<>      The hologram flickers as the Clock Tower begins to shake.        <>");
        System.out.println("\t<>      The Professor's voice grows urgent!!!                            <>");
        System.out.println("\t<>                                                                       <>");
        System.out.println("\t<*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*><*>");
        simpleStatement("", true);

        delay(3);
        delay(3);

        simpleStatement("\nProfessor: The system knows you're here.", true);
        simpleStatement("    Go now ,I will contact you later", true);
        simpleStatement("    Together we escape, divided we fall!", true);
        delay(3);
    }

}

class TheNetwork extends Methods {

    // classes
    Scanner sc = new Scanner(System.in);

    void theNetworkMain() {

        simpleStatement("\n\t Date: 18 Auguest 2050", false);
        simpleStatement("\t8:56 PM", true);
        simpleStatement("\t Location: Leaving the Clock Tower", true);
        delay(3);

        sceneTitle(
                "Scene: The group walks away from the Clock Tower. guided by the Professor's voice through small holographic devices. The fog around them dissipates revealing the glitched architecture of Eclipsera");
        delay(3);
        delay(3);
        delay(3);

        partTitle("Part 1: The Professor's Request");
        delay(3);

        swichingCharacter("Professor");
        delay(3);

        simpleStatement("", true);
        simpleStatement("\n<-- Professor: Listen carefully. To survive in Eclipsera", true);
        simpleStatement("    you need to coordinate in real-time. Our communications ", true);
        simpleStatement("     here are vulnerable to interception by NEXUS . -->", true);
        delay(3);
        delay(3);
        simpleStatement("", true);
        simpleStatement(" Professor: Alex, this task falls to you.", true);
        delay(3);

        simpleStatement("", true);

        simpleStatement("Alex: Finally, something I'm good at. What do you need?", true);
        delay(3);
        simpleStatement("", true);

        waitForEnter("Press Enter To Reply");
        simpleStatement("Code a secure app on the Obscura Network a hidden layer within Eclipsera.", true);
        delay(3);
        simpleStatement("Once the app is live, I'll add everyone to it for safe communication.", true);
        delay(3);
        delay(3);

        simpleStatement("", true);

        simpleStatement("Alex: Obscura Network, huh? I like the sound of that. Give me an Day.", true);
        delay(3);
        simpleStatement("", true);

        simpleStatement("", true);

        simpleStatement("Arjun: While you're at it, make sure it's foolproof. We can't afford to leave a trail.", true);
        delay(3);
        delay(3);
        simpleStatement("", true);

        simpleStatement("", true);

        simpleStatement("Alex: Relax, boss. I'll make it untraceable.", true);
        simpleStatement("Just try not to break anything in the meantime.", true);
        delay(3);
        simpleStatement("", true);

        delay(3);
        partTitle("Part 2: Alex's Coding Challenge");
        delay(3);
        simpleStatement("", true);

        simpleStatement("", true);

        sceneTitle(
                "Scene: Alex isolates himself in a small, glitching bunker with a glowing terminal. The screen with a login sequence.");
        delay(3);
        delay(3);

        swichingCharacter("Alex");
        delay(3);
        simpleStatement("", true);

        simpleStatement("", true);

        taskTitle("Task 1: Encrypting the App");
        delay(3);
        simpleStatement("", true);

        simpleStatement("", true);

        System.out.println("----------------------------------------------");
        System.out.println("|| Encrypt the data stream:                 ||");
        System.out.println("|| A = 1, B = 2, C = 3... Z = 26            ||");
        System.out.println("|| Input the encoded string for \"SAFE\"      ||");
        System.out.println("----------------------------------------------");
        delay(3);

        String answer;
        do {

            simpleStatement("", true);

            simpleStatement("> INPUT: ", false);
            answer = sc.nextLine();

            simpleStatement("\nStay Still While We Encrypt Your System. This may take a while.", true);
            delay(3);
            delay(3);

            if (!answer.equals("19165")) {
                simpleStatement("\nEncryption Failed!!!", true);
                waitForEnter("Press Enter To Rewind");
            }
        } while (!answer.equals("19165"));

        simpleStatement("", true);

        simpleStatement("Encryption Sucessful", true);
        simpleStatement("", true);

        simpleStatement("Setting up your App it may take some Time", true);
        delay(3);
        delay(3);
        simpleStatement("App Setup Sucessful in Obscura Network ", true);
        simpleStatement("", true);

        waitForEnter("Press Enter to launch  NEXLink.");
        simpleStatement("", true);

        simpleStatement("NEXLink going Live", true);
        delay(3);

        simpleStatement("\n\t Date: 19 Auguest 2050", true);
        simpleStatement("\t Location: Alex's Basement", true);
        delay(3);

        sceneTitle(
                "Scene: NEXLink goes live, and the Professor adds all characters. Their profiles appear on their individual holographic devices.");
        delay(3);
        delay(3);

        simpleStatement("", true);

        simpleStatement("Professor: Good work, Alex.", true);
        simpleStatement("Everyone, you're now connected through NEXLink.", true);
        simpleStatement("Use it wisely. Tyson, your task is next ", true);
        simpleStatement("", true);

        delay(3);
        partTitle("Part 3: Tyson's Mission");
        delay(3);

        simpleStatement("", true);

        simpleStatement("Professor: Tyson, I need you to create a wearable device.", true);
        delay(3);
        simpleStatement("that allows role-switching between the four of you.", true);
        delay(3);
        simpleStatement("\nThis device will be critical for solving challenges ahead.", true);
        delay(3);
        simpleStatement("\nFor example, Alex might need Suhani's scientific expertise,", true);
        delay(3);
        simpleStatement("or Suhani might require Arjun's strategic planning.", true);
        delay(3);
        simpleStatement("\nThe device will let you switch seamlessly.", true);
        delay(3);
        simpleStatement("", true);

        simpleStatement("", true);

        simpleStatement("Tyson: A wearable, huh? I'll need materials. Where am I supposed to find them.", true);
        delay(3);
        simpleStatement("", true);

        simpleStatement("", true);

        simpleStatement(" Professor: There's an abandoned workshop nearby.", true);
        simpleStatement(" filled with scraps. Use your skills to salvage what you need", true);
        delay(3);
        delay(3);
        simpleStatement("", true);

        simpleStatement("", true);

        simpleStatement("Arjun: We'll cover you. Just make it fast.", true);
        simpleStatement("", true);

        delay(3);

        swichingCharacter("Tyson");
        delay(3);
        delay(3);

        simpleStatement("", true);

        taskTitle("Task 1: Energy Core Retrieval");
        delay(3);
        simpleStatement("", true);

        System.out.println("\n---------------------------------------------------");
        System.out.println("|| The energy core is locked inside a panel      ||");
        System.out.println("|| Solve the riddle to find the code:            ||");
        System.out.println("----------------------------------------------------");
        delay(3);
        delay(3);

        String task1Ans;
        do {
            simpleStatement("", true);

            simpleStatement("RIDDLE: ", true);
            simpleStatement("I'm a three-digit number.", true);
            simpleStatement("My tens digit is five more than my ones digit,", true);
            simpleStatement("and my hundreds digit is eight less than my tens digit", true);
            simpleStatement("", true);

            System.out.print("Enter Number: ");
            task1Ans = sc.nextLine();
            if (!task1Ans.equals("194")) {
                simpleStatement("\nWrong Answer Energy core not found!!!", true);
                simpleStatement("", true);

                waitForEnter("press Enter To Rewind");
                sc.nextLine();
            }
        } while (!task1Ans.equals("194"));

        simpleStatement("\nCorrect! The panel unlocks, and the Energy Core is retrieved.", true);

        simpleStatement("", true);

        delay(3);
        taskTitle("Task 2: Circuit Board Salvage");
        delay(3);
        simpleStatement("", true);

        System.out.println("\n-------------------------------------------------------------");
        System.out.println("|| The circuit board is trapped under tangled wires.       ||");
        System.out.println("|| You must untangle them. Arrange the sequence            ||");
        System.out.println("|| Wires: [Red, Green, Yellow, BlUE]                       ||");
        System.out.println("-------------------------------------------------------------");
        delay(3);

        String task2Ans;
        do {

            simpleStatement("", true);

            simpleStatement("FORMATE --> GRBY", true);
            simpleStatement("", true);

            simpleStatement("Condition:", true);
            simpleStatement("", true);

            simpleStatement("Red must be before Blue.", true);
            simpleStatement("Yellow must be last.", true);
            simpleStatement("Green must come before Blue.", true);
            simpleStatement("", true);

            simpleStatement("Enter Sequence: ", false);
            task2Ans = sc.nextLine();

            if (!task2Ans.equalsIgnoreCase("rgby")) {
                simpleStatement("\nWrong Answer Circuit board not Found!!!", true);
                simpleStatement("", true);
                waitForEnter("press Enter To Rewind");
            }
        } while (!task2Ans.equalsIgnoreCase("rgby"));

        simpleStatement("\nCorrect! The circuit board is freed.", true);
        simpleStatement("", true);

        delay(3);
        sceneTitle("Scene: Tyson joins the wires in circuit board, And Supply it Energy from Energy Core");
        delay(3);
        delay(3);

        simpleStatement("", true);

        simpleStatement("Professor: Thats the Spirit my BOY!, Tyson.", true);
        delay(3);
        simpleStatement("Everyone, see the feature in video call", true);
        delay(3);
        simpleStatement("Tyson lets test the Device ", true);
        simpleStatement("", true);

        delay(3);
        partTitle("Part 4: Testing the Device");
        delay(3);

        delay(3);
        simpleStatement("", true);

        sceneTitle(
                "Scene: The team gathers as Tyson demonstrates the wearable device a sleek bracelet with a glowing interface.");
        simpleStatement("", true);

        delay(3);
        delay(3);

        simpleStatement("", true);

        simpleStatement("Tyson: Alright, this beauty is ready. Here's how it works:", true);
        delay(3);
        simpleStatement("press the button, and a prompt will let you switch to any character.", true);
        delay(3);
        simpleStatement("Once you confirm, you'll transfer to their location instantly.", true);
        simpleStatement("", true);

        simpleStatement("", true);

        simpleStatement("Suhani: Impressive. Let's see if it works", true);
        simpleStatement("", true);
        delay(2);

        swichingCharacter("Alex");
        delay(3);
        delay(3);

        simpleStatement("", true);

        simpleStatement("", true);

        simpleStatement("\t\t\t[Gameplay Interaction: Testing the Role Switcher]", true);
        simpleStatement("", true);
        simpleStatement("\t\t\t[Alex uses the device]", true);
        delay(3);
        simpleStatement("", true);

        simpleStatement("", true);

        simpleStatement("> Switch on Device" , true);
        delay(3);
        simpleStatement("Prompt: Switch to: " , true);
        simpleStatement("1) Arjun" , true);
        simpleStatement("2) Suhani" , true);
        simpleStatement("3) Tyson" , true);
        simpleStatement("> Input: " , false);
        delay(3);
        simpleStatement("\n Alex Enters 1.", true);
        delay(3);
        simpleStatement("", true);

        simpleStatement("Transferring to Arjun... Successful!", true);
        simpleStatement("", true);

        delay(3);
        System.out.println("-----------------------------------");
        System.out.println("|| Ending Scene OF Chapter 3     ||");
        System.out.println("-----------------------------------");
        delay(3);

        simpleStatement("", true);

        simpleStatement("The group stands together, testing the device and preparing for the journey ahead.", true);
        simpleStatement("", true);
        delay(3);

        simpleStatement("", true);

        simpleStatement("Professor: ", true);
        simpleStatement("Good. Now that you're all connected and equipped.", true);
        delay(3);
        simpleStatement("the real mission begins. Stay sharp, and remember:", true);
        delay(3);
        simpleStatement("Together we escape, divided we fall!", true);
        delay(3);
        simpleStatement("", true);

        delay(3);
        delay(3);

        System.out.println("\t\t\t#==========================================================#");
        System.out.println("\t\t\t<>                                                        <>");
        System.out.println("\t\t\t<>      \"Episode 3 Complete: The Network Established\"     <>");
        System.out.println("\t\t\t<>                                                        <>");
        System.out.println("\t\t\t#==========================================================#");
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
    void episodeTitle(String title) {

        int stars = 54;
        int spacecount = (stars - title.length() - 2) / 2;
        System.out.println("\n\t\t\t" + "*".repeat(stars));
        System.out.println("\t\t\t*" + " ".repeat(spacecount) + title + " ".repeat(spacecount) + "*");
        System.out.println("\t\t\t" + "*".repeat(stars));
    }

    // Method To Display part Name
    void partTitle(String title) {

        int stars = 54;
        int spacecount = (stars - title.length() - 2) / 2;
        System.out.println("\n\t\t\t" + "*".repeat(stars));
        System.out.println("\t\t\t*" + " ".repeat(spacecount) + title + " ".repeat(spacecount) + "*");
        System.out.println("\t\t\t" + "*".repeat(stars));
    }

    // Method To Display Path Name
    void taskTitle(String title) {

        int stars = 54;
        int spacecount = (stars - title.length() - 2) / 2;
        System.out.println("\n\t\t\t" + "*".repeat(stars));
        System.out.println("\t\t\t*" + " ".repeat(spacecount) + title + " ".repeat(spacecount) + "*");
        System.out.println("\t\t\t" + "*".repeat(stars));
    }

    // Method To Display Scene Statement
    void sceneTitle(String statement) {

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

    // Method To Display Character introduction
    void characterIntroduction(String title) {

        int stars = 40;
        int spacecount = (stars - title.length() - 2) / 2;
        System.out.println("\n\t\t\t" + "*".repeat(stars));
        System.out.println("\t\t\t*" + " ".repeat(spacecount) + title + " ".repeat(spacecount) + "*");
        System.out.println("\t\t\t" + "*".repeat(stars));
    }

    // Method to display swiching Statement
    void swichingCharacter(String title) {
        simpleStatement("", true);

        System.out.println("\n<----- Switching role To " + title + " may take upto 5 sec ----->");
        simpleStatement("", true);

    }

    // Method To display simple sout statements
    void simpleStatement(String statement, boolean newline) {

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