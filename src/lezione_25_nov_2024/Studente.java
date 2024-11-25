//Crea una classe chiamata Studente.
//Aggiungi i seguenti attributi:
//matricola (String)
//nome (String)
//cognome (String)
//voti (un array o una lista di interi)
//Crea un costruttore per inizializzare matricola, nome e cognome.
//Aggiungi un metodo aggiungiVoto(int voto) per aggiungere un voto alla lista.
//Aggiungi un metodo calcolaMedia() che calcola la media dei voti.
//Nel main, crea uno studente, aggiungi alcuni voti e calcola la media.

package lezione_25_nov_2024;

public class Studente {

    private String matricola, nome, cognome;
    private int[] voti = new int[10];
    private int numeroVoti = 0;

    public Studente(String matricola, String nome, String cognome) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
    }

    public void aggiungiVoto(int voto) {
        if (numeroVoti > 9) {
            return;
        }

        this.voti[this.numeroVoti++] = voto;
    }

    public double calcolaMedia() {
        int somma = 0;
        for (int i = 0; i < this.numeroVoti; i++) {
            somma += this.voti[i];
        }
        return (double) somma/this.numeroVoti;
    }
}
