import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();

        switch (eta >= 18 ? "maggiorenne" : "minorenne") {
            case "maggiorenne":
                System.out.println("Puoi votare");
                break;
            case "minorenne":
                System.out.println("Non puoi votare");
                break;
            default:
                System.out.println("Errore");
                break;
        }

        scanner.close();
    }
}
