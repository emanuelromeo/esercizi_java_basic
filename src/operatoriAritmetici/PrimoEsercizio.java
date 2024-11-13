package operatoriAritmetici;

public class PrimoEsercizio {

    public static void main(String[] args) {
        System.out.println("Definisci un metodo che restituisca il resto della divisione di due numeri interi e stampalo a schermo.");
        System.out.println("Il resto della divisione tra 20 e 3 è: " + resto(20, 3));
    }

    /** Restituisce il resto della divisione tra il numeratore e il denominatore **/
    public static int resto(int numeratore, int denominatore) {
        return numeratore % denominatore;
    }

}
