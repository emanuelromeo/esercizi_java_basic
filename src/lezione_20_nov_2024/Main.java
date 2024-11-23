package lezione_20_nov_2024;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto1 = new Prodotto("Mela", 2.5);
        Prodotto prodotto2 = new Prodotto("Banana", 3);

        System.out.println("Il totale delle vendite ancora è: " + Prodotto.getTotaleVendite());
        prodotto1.vendi();
        prodotto2.vendi();

        System.out.println("Il totale aggiornato è: " + Prodotto.getTotaleVendite());
    }
}
