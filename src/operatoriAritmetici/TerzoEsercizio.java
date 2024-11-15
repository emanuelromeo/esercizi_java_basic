//Definisci un metodo che calcoli la media tra 3 numeri e restituisca il risultato che dovrà essere stampato.

package operatoriAritmetici;

public class TerzoEsercizio {

    public static void main(String[] args) {

        System.out.println("Definisci un metodo che calcoli la media tra 3 numeri e restituisca il risultato che dovrà essere stampato.");
        System.out.println("La media tra 5, 7 e 11 è: " + media(5, 7, 11));
    }

    public static double media(double primo, double secondo, double terzo) {
        return (primo + secondo + terzo) / 3;
    }

}
