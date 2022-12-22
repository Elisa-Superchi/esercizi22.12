import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci secondi totali");
        int secondit = input.nextInt();
        int giorni = secondit /86400;
        int giornir = secondit % 86400;
        System.out.println("i giorni sono"+ giorni);


        //ore
        int ore = secondit / 3600;
        int orer = secondit % 3600;
        System.out.println("in ore è:" + ore);

        //minuti

        int minuti = secondit / 60;
        int minutir =secondit % 60;
        System.out.println("in minuti è:" + minuti);
        //secondi

        int secondi=secondit/1;
        int secondir =secondit%1;
        System.out.println("in secondi è:" + minutir);
    }
}