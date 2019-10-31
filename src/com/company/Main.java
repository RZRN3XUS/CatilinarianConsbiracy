package com.company;
import java.util.*;
import java.lang.*;
public class Main {
    public static int score = 7;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String space = "       ";

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println(ANSI_GREEN + "Catilinarian Conspiracy Simulator: Fate of the Conspirators");
        System.out.println(ANSI_CYAN + "Created by Christopher and Xander\n");
        System.out.println(ANSI_YELLOW + "You are the Senate in ancient Rome.");
        System.out.println(ANSI_YELLOW + "Your objective is to choose which speaker's side to agree with.");
        System.out.println(ANSI_CYAN + "To read about the actual debate, input 'info' then press enter. To reenact the debate, input 'sim' then press enter.");
        System.out.println(ANSI_YELLOW + "The fate of Rome is in your hands.");
        boolean val = false;
        int meme = 69;
        while (meme == 69)
        {
            do {
                String mode = sc.next();
                if (mode.equalsIgnoreCase("info")) {
                    info();
                    val = true;
                } else if (mode.equalsIgnoreCase("sim")) {
                    sim();
                    val = true;
                } else if (mode.equalsIgnoreCase("exit")) {
                    System.exit(1337);
                } else {
                    System.err.println("Invalid Input");
                }
            } while (val == false);
        }
    }

    private static void sim() throws InterruptedException {
        System.out.print("Loading.");
        for (int i = 0; i < 8; i++) {
            Thread.sleep(200);
            System.out.print(".");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println(ANSI_PURPLE + "The day is December 5, 62 BC. Cicero has called the senate to the Temple of Concord to decide the fate of the 5 captured conspirators.");
        a();
        System.out.println(ANSI_BLACK + space + "Cicero argues: ");
        System.out.println(space + "a. For the Death Penalty\n" + space + "b. Against the Death Penalty");
        boolean ez1 = false;
        do {
            String i1 = sc.next();
            if (i1.equalsIgnoreCase("a")) {
                ez1 = true;
                if (ez1 == true) {
                    a();
                    System.out.println(ANSI_GREEN + space + "Correct.");
                    System.out.println(ANSI_BLACK + space + "Julius Caesar argues: ");
                    System.out.println(space + "a. For the Death Penalty\n" + space + "b. Against the Death Penalty");
                    boolean ez2 = false;
                    do {
                        String i2 = sc.next();
                        if (i1.equalsIgnoreCase("b"))
                            ez2 = true;
                        if (ez2 == true) {

                        } else {
                            System.err.println("Incorrect");
                            score--;
                        }
                    } while (ez2 == false);
                }
            } else {
                System.err.println("Incorrect");
                score--;
            }
        } while (ez1 == false);
    }

    public static void info() throws InterruptedException {
        System.out.print("Loading.");
        for (int i = 0; i < 8; i++) {
            Thread.sleep(200);
            System.out.print(".");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println(ANSI_PURPLE + "The day is December 5, 62 BC. Cicero has called the senate to the Temple of Concord to decide the fate of the 5 captured conspirators.");
        b();
        System.out.println(ANSI_BLACK + "       Cicero proposes that all conspirators in custody be executed, along with the four currently being sought.");
        a();
        System.out.println(ANSI_BLACK + "       Cicero: By their treasonous actions, these conspirators have given up their right to be treated as citizens.");
        a();
        System.out.println(ANSI_BLACK + "       During his speech, Cicero implies that the " + ANSI_CYAN + "Senatum Consultum Ultimum" + ANSI_BLACK + " gives him the authority to impose the death penalty regardless.");
        a(); //Q1 - Cicero stance on death penalty
        System.out.println(ANSI_CYAN + "For more information about the Senatum Consultum Ultimum, input SCU then enter. Or, type any key then enter to continue.");
        String scu = sc.next();
        if (scu.equals("SCU")) {
            System.out.println(ANSI_YELLOW + "The Senatum Consultum Ultimum was a policy that was of questionable legal validity. The fact that Cicero didn’t bypass the Senate's vote from the start shows that even Cicero didn’t really believe in the power of the SCU");
            System.out.println("He was aware that if he took the decisive action that he thought was necessary, he would be making himself vulnerable to being charged with putting Roman citizens to death without a trial\n");
        }
        System.out.println();
        a();
        System.out.println(ANSI_BLACK + space + "Julius Caesar relates the abuse of power to enforce the death penalty to Sulla's Reign of Terror, where Sulla used the death penalty to kill innocent people.");
        a();
        System.out.println(ANSI_BLACK + space + "Julius Caesar: I do not fear that Cicero would do these things or that they will happen at this time; but in a great state there are many and varied characters. Perhaps at another time, when another consul had command of the army, \n       a false accusation will be believed as true. If some future consul, using our deed as an example, draws his sword in accordance with the Senate’s decree, who will impose a limit or restrain him?");
        a();
        System.out.println(space + "Julius Caesar continues to argue against the death penalty, suggesting that the conspirators be imprisoned for life, as well as confiscating all their property.");
        a(); //Q2 - Caesar stance on death penalty
        System.out.println(space + "Caesar agreed that they deserved harsh punishment, but that the laws protecting roman citizens must be respected.\n");
        a(); //Q3 - Caesar punishment idea
        System.out.println(space + "This punishment was regarded as unusual and highly impractical. Prisons were not designed for long term, let alone life time inmates.");
        a();
        System.out.println(space + "Respectable criminals were normally sent into exile. This was not a viable option because they would simply join the rebel army at Faesulae, as Catiline had done");
        a();
        System.out.println(space + "Caesar’s speech did convince many to question the death penalty, and lead to many new suggestions.\n");
        b();
        System.out.println(space + "Tiberius Claudius Nero follows Caesar's speech.");
        a();
        System.out.println(space + "Tiberius Claudius Nero: We must postpone a decision until Catiline and his army are beaten.");
        a();  //Q4 - Nero idea
        System.out.println(space + "This decision was supported by many.\n");
        b();
        System.out.println(space + "Marcus Porcius Cato rebuts Nero's argument and takes Cicero's side.");
        a(); //Q5 - Cato stance on death penalty
        System.out.println(space + "Because of Catiline and his army who are still at large, the conspirators in the city pose a massive risk. They are going to be held outside of Rome for fear that they would be freed if kept inside of Rome anyways.\n" + space + "They would be sought after be their friends no matter where they were held. They had admitted that they were going to commit crimes such as murder, arson, and other terrible crimes, they should be punished as if they had actually committed those crimes.");
        a();
        System.out.println(space + "Cato then suggests that they send a message to Catiline by punishing the conspirators swiftly and harshly.");
        a();
        System.out.println(space + "With this argument, the Senate agreed in overwhelming favor of the death penalty.\n");
        b();
        System.out.println(ANSI_PURPLE + "Cicero personally escorted them to the carcer, where they were handed off to the executioners in the Tullianum below.\nThe 5 conspirators were strangled to death, and Cicero went to the forum to announced that the conspirators lives were over: 'vixere'.");
        b(); //Q6 - who escorted conspirators to carcer
        System.out.println("Cicero was praised, and called the savior and founder of his country. Many prominent citizens accompanied Cicero home and placed lamps and/or torches at their doors and rooftops to show appreciation\n and to honor the man who saved rome from chaos and murder without any violence or bloodshed.");
        //Q7 - what was Cicero regarded as
        System.out.println(ANSI_GREEN + "The End.");
        a();
        System.out.println(ANSI_CYAN + "To play info again, input info then press enter. To play the debate, input sim then press enter. To exit the program, input exit then press enter.");
    }
    public static void a() throws InterruptedException {
        Thread.sleep(3000);
    }
    public static void b() throws InterruptedException {
        Thread.sleep(5000);
    }
}

