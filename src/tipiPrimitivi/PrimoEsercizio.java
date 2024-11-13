package tipiPrimitivi;
import java.util.Scanner;

public class PrimoEsercizio {
    public static void main(String[] args) {

        System.out.println("Scrivere uno snippet di codice che, dato un triangolo identificato da base ed altezza, restituisca l'area.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserire la base: ");
        double b = scanner.nextDouble();

        System.out.print("Inserire l'altezza: ");
        double h = scanner.nextDouble();

        System.out.println("L'area è: "+ (b * h) / 2);

        scanner.close();
    }
}
