package lezione_20_nov_2024;

public class Banca {

    private double saldo;

    public Banca () {
        saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double quantità) {
        if (quantità >= 0) {
            saldo += quantità;
            return;
        }

        System.out.println("Quantità non valida");
    }

    public void preleva(double quantità) {
        if (quantità < 0 || quantità > saldo) {
            System.out.println("Quantità non valida");
            return;
        }
        saldo -= quantità;
    }
}
