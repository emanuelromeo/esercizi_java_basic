package esercizi_19_nov_2024;

public class Cerchio {

    private double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public double calcolaArea() {
        return raggio * raggio * 3.14;
    }

    public  double calcolaCirconferenza() {
        return raggio * 6.28;
    }

}
