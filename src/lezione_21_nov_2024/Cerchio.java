//Crea una classe Cerchio con:
//
//Una variabile statica PI per memorizzare il valore di pi greco.
//Un metodo di istanza calcolaArea(double raggio) che calcola l'area del cerchio.
//Un metodo statico getPi() che restituisce il valore di pi greco.

package lezione_21_nov_2024;

public class Cerchio {

    private static double PI = 3.14;

    public double calcolaArea(double raggio) {
        return PI * raggio * raggio;
    }

    public static double getPi() {
        return PI;
    }

}
