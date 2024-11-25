//Classe base: Forma
//Attributo: nome (String)
//Metodo: area() che ritorna l'area della forma (valore di tipo double).
//Sottoclasse Rettangolo (estende Forma)
//Attributi: base (double), altezza (double)
//Metodo: Sovrascrive area() per calcolare l'area del rettangolo (base * altezza).
//Sottoclasse Cerchio (estende Forma)
//Attributo: raggio (double)
//Metodo: Sovrascrive area() per calcolare l'area del cerchio (π * raggio^2).

package lezione_25_nov_2024;

public class Rettangolo extends Forma {
    private double base, altezza;

    public Rettangolo(String nome, double base, double altezza) {
        super(nome);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double area() {
        return base * altezza;
    }
}
