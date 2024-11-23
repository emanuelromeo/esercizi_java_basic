// Crea una classe Prodotto con le seguenti caratteristiche:
//Un attributo statico totaleVendite che tiene traccia del totale delle vendite di tutti i prodotti venduti nel negozio.
//Un attributo non statico nome e prezzo per ogni singolo prodotto.
//Un metodo vendi() che simula la vendita di un prodotto, incrementando totaleVendite e stampando i dettagli della vendita.
//Un metodo statico getTotaleVendite() che restituisce il totale delle vendite.

package lezione_20_nov_2024;

public class Prodotto {

    private static double totaleVendite = 0;
    private String nome;
    private double prezzo;

    public Prodotto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public void vendi() {
        totaleVendite += prezzo;
        System.out.println("Venduto\nProdotto: " + nome + "\nPrezzo: " + prezzo);
    }

    public static double getTotaleVendite() {
        return totaleVendite;
    }

}
