//Crea una classe chiamata Giocatore dove tutti i giocatori condividono un unico punteggio totale.
//
//Consegna:
//
//Aggiungi un campo statico punteggioTotale.
//Ogni volta che un giocatore segna, incrementa il punteggio totale.
//Mostra il punteggio totale senza creare oggetti aggiuntivi.

package lezione_22_nov_2024;

public class Giocatore {
    private static int punteggioTotale = 0;
    private int punteggio = 0;

    public void goal() {
        punteggio++;
        punteggioTotale++;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public static int getPunteggioTotale() {
        return punteggioTotale;
    }
}
