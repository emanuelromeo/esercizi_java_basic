////Classe base: Forma
////Attributo: nome (String)
////Metodo: area() che ritorna l'area della forma (valore di tipo double).
////Sottoclasse Rettangolo (estende Forma)
////Attributi: base (double), altezza (double)
////Metodo: Sovrascrive area() per calcolare l'area del rettangolo (base * altezza).
////Sottoclasse Cerchio (estende Forma)
////Attributo: raggio (double)
////Metodo: Sovrascrive area() per calcolare l'area del cerchio (π * raggio^2).

package lezione_25_nov_2024;

public class Cerchio extends Forma {
    private double raggio;

    public Cerchio(String nome, double raggio) {
        super(nome);
        this.raggio = raggio;
    }

    @Override
    public double area() {
        return Math.PI * raggio * raggio;
    }
}
