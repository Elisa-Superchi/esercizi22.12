import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("inserisci secondi");


        Scanner input = new Scanner(System.in);
        //giorni
        int secondi = input.nextInt();
        float giorni = secondi * 86400;

        System.out.println("in secondi è:" + giorni);

        //ore
        float ore = secondi * 3600;
        System.out.println("in secondi è:" + ore);

        //minuti

        float minuti = secondi * 60;
        System.out.println("in secondi è:" + minuti);
    }
}