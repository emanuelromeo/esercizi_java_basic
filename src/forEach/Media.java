package forEach;

public class Media {
    public static void main(String[] args) {

        int[] interi = {127, 3, 748, 87, 9, 26};
        int somma = 0;

        for (int intero : interi) {
            somma += intero;
        }

        System.out.println("La media degli elementi dell'array è: " + (double) somma/interi.length);
    }
}
