package lezione_21_nov_2024;

public class Main {

    public static void main(String[] args) {

        /*
        Car car = new Car();
        car.setModello("Audi");
        car.accelera(10);

        Cerchio cerchio = new Cerchio();
        double area = cerchio.calcolaArea(15);
        */

        staticTest o1=new staticTest();
        o1.show();
        staticTest o2=new staticTest();
        o2.b=100;
        staticTest.a=200;
        o2.show();
        o1.show();
    }
}
