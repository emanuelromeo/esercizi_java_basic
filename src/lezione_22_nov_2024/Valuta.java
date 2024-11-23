//Crea una classe chiamata Valuta che converte una certa somma di denaro da una valuta a un’altra,
//tenendo traccia della quantità di denaro convertito nel totale.
//
//Consegna:
//
//Crea un campo static per memorizzare il totale convertito.
//Ogni volta che viene eseguita una conversione, aggiorna il totale convertito.
//Fornisci un metodo statico per ottenere il totale convertito.

package lezione_22_nov_2024;

public class Valuta {

    private static double totaleConvertito;
    private double valore;

    public Valuta(double valore) {
        this.valore = valore;
    }

    public double converti(double quantità) {
        double quantitàConvertita = this.valore * quantità;
        this.totaleConvertito += quantitàConvertita;
        return quantitàConvertita;
    }

    public static double getTotale() {
        return totaleConvertito;
    }

}
