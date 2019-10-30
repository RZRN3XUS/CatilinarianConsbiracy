package com.company;
import java.util.*;
public class Main {
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println(ANSI_GREEN + "Catilinarian Conspiracy Simulator: Fate of the Conspirators");
        System.out.println(ANSI_CYAN + "Created by Christopher and Xander\n");
        System.out.println(ANSI_YELLOW + "You are the Senate in ancient Rome.");
        System.out.println(ANSI_YELLOW + "Your objective is to choose which speaker's side to agree with.");
        System.out.println(ANSI_YELLOW + "The fate of Rome is in your hands.\n");
        System.out.println("\033[3mType any key and enter to continue\033[0m");
        String input = sc.next();
        System.out.print("Loading.");
        for (int i = 0; i < 5; i++) {
            Thread.sleep(500);
            System.out.print(".");
        }
        System.out.println();
        System.out.println(ANSI_PURPLE + "The day is December 5, 62 BC. Cicero has called the senate to the Temple of Concord to decide the fate of the 5 captured conspirators.");
        Thread.sleep(2000);
        System.out.println(ANSI_BLACK + "       Cicero proposes that all conspirators in custody be executed, along with the four currently being sought.");
        System.out.println(ANSI_BLACK + "       Julius Caesar: I do not fear that M. Tullius [would do] these things or that [they will happen] at this time; but in a great state there are many and varied characters. Perhaps at another time, when another consul had command ofthe army, a false [accusation] will be believed as true. If some future consul, using our ded as an example,\r       draws his sword in accordance with the Senate’s decree, who will impose a limit or restrain him?\n");
    }
}

