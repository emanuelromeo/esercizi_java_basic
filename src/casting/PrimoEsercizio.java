package casting;

public class PrimoEsercizio {
    public static void main(String[] args) {

        System.out.println("Scrivere uno snippet di codice che dati 2 numeri con la virgola (double) li sommi e li stampi senza virgola (int).");

        double a = 182.6;
        double b = 23.4;

        int sum = (int) (a + b);
        System.out.println(sum);
    }
}
