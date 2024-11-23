//Classe Car con final e variabili statiche
//Crea una classe Car con:
//
//Un campo final chiamato carId che rappresenta l'ID unico della macchina.
//Un campo statico chiamato totalCars che tiene traccia del numero totale di auto create.
//Un costruttore che imposta carId e incrementa totalCars ogni volta che viene creata una nuova macchina.
//Un metodo getTotalCars() che restituisce il numero totale di auto create.
//Un metodo getCarId() che restituisce l'ID dell'auto.

package lezione_21_nov_2024;

public class Car {
    private final int carId;
    private static int totalCars = 0;

    public Car() {
        carId = ++totalCars;
    }
}

