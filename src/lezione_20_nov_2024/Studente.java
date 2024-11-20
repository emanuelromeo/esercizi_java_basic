package lezione_20_nov_2024;// Crea una classe lezione_20_nov_2024.Studente con:
//
//Attributi: nome, cognome, matricola e mediaVoti.
//Costruttore per inizializzare il nome, il cognome e la matricola. La mediaVoti inizia da 0.
//Metodi:
//aggiornaMedia(double nuovoVoto): Aggiorna la media in base al nuovo voto.
//toString(): Restituisce una rappresentazione testuale dello studente.
//Nel metodo main, crea uno studente, aggiorna la media e stampa i suoi dettagli.

public class Studente {

    private String nome, cognome;
    private int matricola;
    private double mediaVoti;
    private int numeroVoti;

    public Studente(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.mediaVoti = 0;
        this.numeroVoti = 0;
    }

    public void aggiornaMedia(double nuovoVoto) {
        mediaVoti = (mediaVoti * numeroVoti + nuovoVoto) / (numeroVoti + 1);
        numeroVoti++;
    }

    @Override
    public String toString() {
        return "lezione_20_nov_2024.Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", matricola='" + matricola + '\'' +
                ", mediaVoti=" + mediaVoti +
                '}';
    }

}
