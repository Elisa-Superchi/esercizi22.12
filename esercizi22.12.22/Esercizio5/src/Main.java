import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("inserisci primo valore");
        Scanner input = new Scanner(System.in);
int valore1 = input.nextInt();

        System.out.println("inserisci secondo valore");
        int valore2 = input.nextInt();

        int somma = valore1+ valore2;

        System.out.println("il risultato è:"+ somma);
    }
}