package model;

import model.classes.Mechanic;
import model.classes.Car;
import model.classes.CarServis;
import model.classes.Order;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mechanic mechanik1 = new Mechanic("Heniek", "Zbyrad", "Drobne usterki.");

        Car samochod1 = new Car("Fiat", "Punto", "RT73251", LocalDate.of(2014, 1, 8));

        Order zlecenie1 = new Order(samochod1, "Wymiana oleju", LocalDate.of(2025, 8, 10));


        ArrayList<Order> zlecenia = new ArrayList<>();
        ArrayList<Car> samochody = new ArrayList<>();

        zlecenia.add(zlecenie1);
        samochody.add(samochod1);

        CarServis serwis1 = new CarServis(zlecenia, samochody);

        serwis1.showOrders();
    }
}
