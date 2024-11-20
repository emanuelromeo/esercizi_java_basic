package esercizi_19_nov_2024;

public class Esame {

    private String nomeCorso;
    private int punteggio;

    public Esame(String nomeCorso, int punteggio) {
        this.nomeCorso = nomeCorso;
        this.punteggio = punteggio;
    }

    public String getNomeCorso() {
        return nomeCorso;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public boolean isSuperato() {
        if (punteggio >= 18) {
            return true;
        }
        return false;
    }
}
