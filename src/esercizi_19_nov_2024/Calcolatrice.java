package esercizi_19_nov_2024;

import java.util.Scanner;

public class Calcolatrice {

    private static void addizione(double a, double b) {
        System.out.println(a + b);
    }

    private static void sottrazione(double a, double b) {
        System.out.println(a - b);
    }

    private static void moltiplicazione(double a, double b) {
        System.out.println(a * b);
    }

    private static void divisione(double a, double b) {
        if (b != 0){
            System.out.println(a / b);
        } else {
            System.out.println("indefinito");
        }
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleziona un'operazione:\n\n>> Addizione\n>> Sottrazione\n>> Moltiplicazione\n>> Divisione\n");
        String operazione = scanner.next();

        System.out.print("\nPrimo numero: ");
        double a = scanner.nextDouble();

        System.out.print("Secondo numero: ");
        double b = scanner.nextDouble();

        switch (operazione.toLowerCase()) {
            case "addizione":
                System.out.print("\nLa somma tra questi due numeri è: ");
                addizione(a, b);
                break;
            case "sottrazione":
                System.out.print("\nLa differenza tra questi due numeri è: ");
                sottrazione(a, b);
                break;
            case "divisione":
                System.out.print("\nIl rapporto tra questi due numeri è: ");
                divisione(a, b);
                break;
            case "moltiplicazione":
                System.out.print("\nIl prodotto tra questi due numeri è: ");
                moltiplicazione(a, b);
                break;
            default:
                System.out.println("\nOperazione non valida\n");
                menu();
                break;
        }

        scanner.close();
    }

}
