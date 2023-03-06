import java.util.Scanner;
public class berechnungKalorien {
    public static void main(String [] args) {
        // final Kalorienangaben
        final int MILCHSCHOKOLADE = 535;
        final int TRAUBEN = 69;
        final int POMMES_FRITTES = 291;
        int gesamtkalorien;
        int kalorienMilchschokolade;
        int kalorienPommes;
        int kalorienTrauben;
        // Scanner
        Scanner scanner = new Scanner(System.in);
        // Gramm der Zutaten mit Scanner einlesen
        int input = 0;
        for (int e = 0; e < 3 ; e++) {
            System.out.println("Grammzahlen der Zutaten eingeben: ");
            input = scanner.nextInt();
        }
        int milchschokoladeGramm = 0;
        int pommesGramm = 0;
        int traubenGramm = 0;
        boolean checkNotNegativ;
        boolean exit = false;
        final int ENDE = 3;
        int a = 0;

        while (!exit && a < ENDE) {
            checkNotNegativ = berechnungKalorien.notNegativ(input);
            if (checkNotNegativ) {
                milchschokoladeGramm = input;
            }
            else {
                System.out.println("negativer Wert erfasst");
                scanner.close();
            }

            checkNotNegativ = berechnungKalorien.notNegativ(input);
            if (checkNotNegativ) {
                pommesGramm = input;
            }
            else {
                System.out.println("negativer Wert erfasst");
                scanner.close();
            }
            checkNotNegativ = berechnungKalorien.notNegativ(input);
            if (checkNotNegativ) {
                traubenGramm = input;
            }
            else {
                System.out.println("negativer Wert erfasst");
                scanner.close();
            }
                a++;
        }
        kalorienMilchschokolade = MILCHSCHOKOLADE * milchschokoladeGramm;
        kalorienTrauben = TRAUBEN * traubenGramm;
        kalorienPommes = POMMES_FRITTES * pommesGramm;

        gesamtkalorien = kalorienTrauben + kalorienPommes + kalorienMilchschokolade;
        berechnungKalorien.ausgeben(gesamtkalorien);
    }

    // Checks nicht negativ
    public static boolean notNegativ (int input) {
        return input > 0 && input < 1000;
    }
    public static void ausgeben (int gesamtkalorien) {
        System.out.println("Gesamtkalorien: " + gesamtkalorien);
    }
}
