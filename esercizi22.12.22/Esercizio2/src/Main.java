import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//dati rettangolo
        System.out.println("inserisci base");
        int base = input.nextInt();
        System.out.println("inserisci altezza");
        int altezza = input.nextInt();

        //calcolo perimetro rettangolo
        int perimetro = base * 2 + altezza * 2;
        System.out.println("il perimetro è:" + perimetro);
        //calcolo area rettangolo
        int area = base * altezza;
        System.out.println("l'area è:" + area);

            //dati cerchio
            System.out.println("inserisci raggio");
            int raggio = input.nextInt();

            //calcolo perimetro cerchio
            double perimetro1 = raggio * 3.14 * 2;
            System.out.println("il perimetro è:" + perimetro1);
            //calcolo area cerchio
            double area1 = 3.14*raggio*raggio;
            System.out.println("l'area è:" + area1);



                //dati quadrato
                System.out.println("inserisci lato");
                int lato = input.nextInt();

                //calcolo perimetro quadrato
                int perimetro2 = lato*4;
                System.out.println("il perimetro è:" + perimetro);
                //calcolo area quadrato
                int area2 = lato*lato;
                System.out.println("l'area è:" + area);

        //dati triangolo
        System.out.println("inserisci lato");
        int lato1 = input.nextInt();
        System.out.println("inserisci base");
        int base3 =input.nextInt();
        input.close();
        //calcolo perimetro triangolo
        int perimetro3 = lato*4;
        System.out.println("il perimetro è:" + perimetro);
        //calcolo area triangolo
        int area3 = lato*lato;
        System.out.println("l'area è:" + area);
    }

}