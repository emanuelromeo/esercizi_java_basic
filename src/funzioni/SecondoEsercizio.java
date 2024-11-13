package funzioni;

public class SecondoEsercizio {

    public static void main(String[] args) {
        System.out.println("Definire una funzione che accetti in ingresso una stringa e ne restituisca la lunghezza");

        String string = "Hello World!";
        System.out.println("La stringa \"" + string + "\" ha lunghezza: " + stringLength(string));
    }

    public static int stringLength(String string) {
        return string.length();
    }
}
