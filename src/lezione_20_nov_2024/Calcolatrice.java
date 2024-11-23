// Crea una classe Calcolatrice che supporta operazioni aritmetiche di base
// (somma, sottrazione, moltiplicazione, divisione) e avanzate (potenza, radice quadrata).
// Ogni operazione deve essere un metodo separato.

package lezione_20_nov_2024;

public class Calcolatrice {

    public double somma(double numeroUno, double numeroDue) {
        return numeroUno + numeroDue;
    }

    public double sottrazione(double numeroUno, double numeroDue) {
        return numeroUno - numeroDue;
    }

    public double divisione(double numeroUno, double numeroDue) {
        if (numeroDue == 0) {
            System.out.println("Non puoi dividere per zero");
            return -1;
        }
        return numeroUno / numeroDue;
    }

    public double moltiplicazione(double numeroUno, double numeroDue) {
        return numeroUno * numeroDue;
    }


}
