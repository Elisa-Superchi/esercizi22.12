import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("inserisci giorni");


        Scanner input = new Scanner(System.in);
        //giorni
        int giorni = input.nextInt();
        float secondi = giorni / 86400;

        System.out.println("in secondi è:" + secondi);

        //ore
        int ore = input.nextInt();
        float secondi2 = ore / 3600;
        System.out.println("in secondi è:" + secondi2);

        //minuti
        int minuti = input.nextInt();
        float secondi3 = minuti / 60;
        System.out.println("in secondi è:" + secondi3);
    }
}