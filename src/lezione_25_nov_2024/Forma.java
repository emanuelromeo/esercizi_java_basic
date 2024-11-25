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

public abstract class Forma {
    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public abstract double area();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
