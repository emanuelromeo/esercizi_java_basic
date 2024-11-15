package forEach;

import java.util.Scanner;

public class ContaStringa {
    public static void main(String[] args) {

        String[] stringhe = {"ciao", "parola", "boh", "Develhope", "ciao", "boh", "ciao"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Scrivi una stringa: ");
        String inputString = scanner.next();

        int count = 0;

        for (String stringa : stringhe) {
            if (stringa.equals(inputString)) {
                count++;
            }
        }

        System.out.println("La stringa inserita è presente nell'array " + count + " volte");

        scanner.close();

    }
}
