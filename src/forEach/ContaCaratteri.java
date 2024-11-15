package forEach;

import java.util.Scanner;

public class ContaCaratteri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Scrivi qualcosa: ");
        String stringa = scanner.next();

        System.out.print("Hai scritto i seguenti caratteri:");
        for (char c : stringa.toCharArray()) {
            System.out.print(" " + c);
        }

        scanner.close();

    }
}
