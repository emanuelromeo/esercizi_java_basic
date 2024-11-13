//Definisci un metodo per la divisione di 2 numeri interi che restituisca il risultato che dovrà essere stampato.

package operatoriAritmetici;

public class SecondoEsercizio {

    public static void main(String[] args) {

        System.out.println("DDefinisci un metodo per la divisione di 2 numeri interi che restituisca il risultato che dovrà essere stampato.");

        int numeratore = 20;
        int denominatore = 6;

        System.out.println("Il quoziente della divisione tra " + numeratore + " e " + denominatore + " è: " + quoziente(numeratore, denominatore));

    }

    /** Restituisce il quoziente della divisione tra il numeratore e il denominatore **/
    public static double quoziente(int numeratore, int denominatore) {
        return (double) numeratore / denominatore;
    }

}
