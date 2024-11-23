//Crea una classe Libro con i seguenti attributi:
//
//titolo (String)
//autore (String)
//prezzo (double)
//numeroPagine (int)
//Aggiungi un costruttore che accetti tutti gli attributi come parametri.
//
//Implementa i metodi getter e setter per ogni attributo.

package lezione_21_nov_2024;

public class Libro {

    private String titolo, autore;
    private double prezzo;
    private int numeroPagine;


    public Libro(String titolo, String autore, double prezzo, int numeroPagine) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
        this.numeroPagine = numeroPagine;
    }


    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }


    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }
}

