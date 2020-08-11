package Mastermind;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class css {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Guten Tag");
        System.out.println("Wie lautet dein Name?");
       String eingabe = sc.nextLine();
        System.out.println("Hallo " + eingabe + ", weisst du wie dieses Spiel geht?");
        String input = sc.nextLine();
        if (input.equals("Nein") || input.equals("nein")) {
            System.out.println("Das Spiel ist im Grunde sehr simpel. Der Computer wählt 4 zufällige Farben aus.");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Diese werden dir nicht mitgeteilt.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Das Ziel ist diese Farben herauszufinden");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Es wird dir jeweils gesagt, wie viele die richtige Farbe haben und an der richtigen Position sind");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Und wie viele die richtige Farbe haben, aber an der falschen Position sind");
            TimeUnit.SECONDS.sleep(3);
        }
        System.out.println("Im ganzen gibt es 8 Farben; Blau, Rot, Gelb, Grün, Schwarz, weiss, Lila, Orange.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Das Ziel ist die 4 Farben rauszufinden.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Du hast im ganzen 12 Versuche.");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("WARNUNG!!! Dieses Spiel hat ein hohes Suchtpotenzial!");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Noah und Yanic wünschen dir viel Spass und Erfolg.");

        boolean keepPlaying = true;
        while (keepPlaying == true) {

            String[] benutzerEingaben = new String[4];
            String[] farben = {"blau", "rot", "gelb", "grün", "schwarz", "weiss", "lila", "orange"};
            Random random = new Random();
            String[] generiertefarbe = new String[4];

            for (int x = 1; x <= 12; x++) {

                for (int index = 0; index <= 3; index++) {
                    generiertefarbe[index] = farben[random.nextInt(farben.length)];
                    System.out.println(generiertefarbe[index]);
                    // um lösung z zeigen
                }
                for (x = 1; x <= 12; x++) {
                    System.out.println("Versuch " + x);
                    System.out.println("");
                    for (int index = 0; index <= 3; index++) {
                        System.out.println("Farbe " + index);
                        benutzerEingaben[index] = sc.nextLine().toLowerCase();


                      while  (!benutzerEingaben[index].equals(generiertefarbe[index])) {
                          System.out.println("Bitte achte dich auf die Schreibweise.");
                          System.out.println("Eingabe des Versuches: ");
                          benutzerEingaben[index] = sc.nextLine().toLowerCase();
                      }
                    }

//        System.out.println("Analysieren");
//        TimeUnit.MILLISECONDS.sleep(90);
//        System.out.print(".");
//        TimeUnit.MILLISECONDS.sleep(90);
//        System.out.print(".");
//        TimeUnit.MILLISECONDS.sleep(90);
//        System.out.print(".");
//        TimeUnit.MILLISECONDS.sleep(90);
//        System.out.print(".");
//        TimeUnit.MILLISECONDS.sleep(90);
//        System.out.print(".");
//        TimeUnit.MILLISECONDS.sleep(90);
//        System.out.print(".");
//        TimeUnit.MILLISECONDS.sleep(90);
//        System.out.print(".");
//        TimeUnit.MILLISECONDS.sleep(90);
//        System.out.print(".");
//        TimeUnit.MILLISECONDS.sleep(90);
//        System.out.println(".");

                    int counterRot = 0;
                    for (int index = 0; index <= 3; index++) {

                        if (benutzerEingaben[index].equals(generiertefarbe[index])) {
                            counterRot += 1;
                        }
                    }
                    int counterWeiss = 0;
                    String[] generierteFarbenClone = generiertefarbe.clone();
                    for (int index = 0; index <= 3; index++) {
                        for (int y = 0; y <= 3; y++) {
                            if (generierteFarbenClone[index].equals(benutzerEingaben[y])) {
                                counterWeiss += 1;
                                generierteFarbenClone[index] = "p";
                                benutzerEingaben[y] = "";
                            }

                        }

                    }


                    counterWeiss = counterWeiss - counterRot;

                    System.out.println("Richtige Farbe " + counterRot);
                    System.out.println("Richtige Farbe, falsche Position " + counterWeiss);

                    if (counterRot == 4) {

                        System.out.println("Du hast Gewonnen.");
                        System.out.println("willst du nochmal spielen? Ja oder Nein");
                        String jaNein = sc.nextLine().toLowerCase();
                        if (!jaNein.equals("ja")) {
                            System.out.println("Danke fürs Spielen! Auf Wiedersehen :D");
                            System.exit(0);
                        }


                    }


                    if (x == 12) {
                        System.out.println("Du hast verloren ");
                        System.out.println("willst du nochmal spielen? Ja oder Nein");
                        String JaNein = sc.nextLine().toLowerCase();
                        if (JaNein.equals("ja")) {
                            keepPlaying = true;
                        } else if (JaNein.equals("nein")) {
                            System.out.println("Danke fürs Spielen! auf Wiedersehen");
                            // System.exit(0);
                            keepPlaying = false;
                        }
//            System.out.println("Versuch " + x);
//            x = x + 1;
//            System.out.println("Farbauswahl: Blau, Rot, Gelb, Grün, Schwarz, Weiss, Lila, Orange");
//            System.out.println("Füge hier deine Farben ein:");
//            System.out.println("Color 1:");
//            String guess1 = sc.nextLine();
//            System.out.println("Color 2:");
//            String guess2 = sc.nextLine();
//            System.out.println("Color 3:");
//            String guess3 = sc.nextLine();
//            System.out.println("Color 4:");
//            String guess4 = sc.nextLine();
//
//


                    }

                }
            }
        }
    }
}


// switch(number) {
// case 0:
// sout("richtig")
// break
// case  1:
// sout("falsch")
// break;
//










