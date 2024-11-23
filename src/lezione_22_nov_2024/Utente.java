//Esercizio 5: Controllo di accesso
//Crea una classe chiamata Utente con un campo statico che memorizza il numero massimo di utenti consentiti.
//
//Consegna:
//
//Definisci un campo statico MAX_UTENTI.
//Usa questo campo per limitare la creazione di oggetti Utente.

package lezione_22_nov_2024;

public class Utente {
    private final static int MAX_UTENTI = 3;
    private static int totalUsers;

    private Utente() {
        totalUsers++;
    }

     public static int getTotalUsers() {
        return totalUsers;
     }

     public static Utente newUser() {
        if (totalUsers < MAX_UTENTI) {
            return new Utente();
        }
         System.out.println("Limite massimo di utenti raggiunto");
        return null;
     }

}
