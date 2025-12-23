package model;

import model.classes.Mechanic;
import model.classes.Car;
import model.classes.Order;
import model.enums.PaymentType;
import model.enums.RepairType;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Mechanic> mechanics = new LinkedList<>();
        LinkedList<Order> orders = new LinkedList<>();
        LinkedList<Car> cars = new LinkedList<>();

        Mechanic mechanik1 = new Mechanic("Heniek", "Zbyrad", 39, "Drobne usterki.");
        Mechanic mechanik2 = new Mechanic("Bartosz", "Stonoga", 21, "Elektryka.");
        Mechanic mechanik3 = new Mechanic("Adam", "Musztarda", 67, "Rozkładanie silnika.");
        Mechanic mechanik4 = new Mechanic("Kuba", "Lorek", 46, "Regulacja wycieraczek w samochodach bez szyb.");

        Car samochod1 = new Car("Fiat", "Punto", "RT73251");
        Car samochod2 = new Car("Ferrari", "911", "R1MANGO");
        Car samochod3 = new Car("Rolls Royce", "Phantom", "RT27216");
        Car samochod4 = new Car("Renault", "Clio", "KNS7251");
        Car samochod5 = new Car("RedbullRacing", "RB18", "M1MAX");
        Car samochod6 = new Car("Renault", "Megane", "RT84272");

        Order zlecenie1 = new Order(samochod1, "Wymiana oleju", mechanik1, RepairType.MECHANIC, PaymentType.MONEY, false);
        Order zlecenie2 = new Order(samochod2, "Wymiana ECU", mechanik1, RepairType.ELECTRONIC, PaymentType.CARD, false);

        mechanics.add(mechanik1);
        mechanics.add(mechanik2);
        mechanics.add(mechanik3);
        mechanics.add(mechanik4);

        cars.add(samochod3);
        cars.add(samochod4);
        cars.add(samochod5);
        cars.add(samochod6);

        orders.add(zlecenie1);
        orders.add(zlecenie2);

        showMenu(orders, mechanics, cars);
    }

    private static Order newOrder(LinkedList<Mechanic> mechanics, LinkedList<Car> cars){
        Scanner scanner = new Scanner(System.in);
        Mechanic[] mechanicsArray =  mechanics.toArray(new Mechanic[0]);
        Car[] carsArray =  cars.toArray(new Car[0]);

//        Mechanik
        System.out.println("Wybierz numer mechanika, który ma wykonać zlecenie:");
        for (int i = 0; i < mechanicsArray.length; i++) {
            System.out.println(i+1 + " --- " + mechanicsArray[i]);
        }
        int mechanicIndex = scanner.nextInt();
        Mechanic mechanic = mechanicsArray[mechanicIndex-1];

        scanner.nextLine();

//        Samochód
        System.out.println("Wybierz numer auta, na którym zlecenie ma zostać wykonane:");
        for (int i = 0; i < carsArray.length; i++) {
            System.out.println(i+1 + " --- " + carsArray[i]);
        }
        int carIndex = scanner.nextInt();
        Car car = carsArray[carIndex-1];

        scanner.nextLine();

//        Opis
        System.out.println("Wpisz opis zlecenia:");
        String description = scanner.nextLine();

//        Typ
        System.out.println("Wybierz rodzaj zlecenia:");
        System.out.println("1 - Mechaniczna");
        System.out.println("2 - Elektroniczna");
        System.out.println("3 - Lakierowanie");
        System.out.println("4 - Przegląd pojazdu");
        int userChoiceType = scanner.nextInt();
        RepairType repairType = null;
        switch (userChoiceType){
            case 1 -> repairType = RepairType.MECHANIC;
            case 2 -> repairType = RepairType.ELECTRONIC;
            case 3 -> repairType = RepairType.VARNISHING;
            case 4 -> repairType = RepairType.REVIEW;
        }


//        Płatność
        System.out.println("Wybierz rodzaj płatności:");
        System.out.println("1 - Gotówka");
        System.out.println("2 - Blik");
        System.out.println("3 - Karta Płatnicza");
        int userChoicePayment = scanner.nextInt();
        PaymentType paymentType = null;
        switch (userChoicePayment){
            case 1 -> paymentType = PaymentType.MONEY;
            case 2 -> paymentType = PaymentType.BLIK;
            case 3 -> paymentType = PaymentType.CARD;
        }

        scanner.nextLine();

        System.out.println();
        System.out.println();

        return new Order(car, description, mechanic, repairType, paymentType, false);
    }

    private static void executeOrder(LinkedList<Order> orders, LinkedList<Mechanic> mechanics, LinkedList<Car> cars) {
        Scanner scanner = new Scanner(System.in);
        Order[] ordersArray =  orders.toArray(new Order[0]);

        System.out.println("Wybierz numer zlecenia, które ma zostać wykonane:");
        for (int i = 0; i < ordersArray.length; i++) {
            System.out.println(i+1 + " --- " + ordersArray[i]);
        }
        int carIndex = scanner.nextInt();
        Order order = ordersArray[carIndex-1];
        order.executeOrder();

        System.out.println();
        System.out.println();
    }

    private static void showOrders(LinkedList<Order> orders, LinkedList<Mechanic> mechanics, LinkedList<Car> cars){
        for (Order order : orders){
            System.out.println(order);
        }

        System.out.println();
        System.out.println();
    }

    private static void orderPayment(LinkedList<Order> orders, LinkedList<Mechanic> mechanics, LinkedList<Car> cars){
        Scanner scanner = new Scanner(System.in);
        Order[] ordersArray =  orders.toArray(new Order[0]);

        System.out.println("Wybierz numer zlecenia, za które chcesz zapłacić:");
        for (int i = 0; i < ordersArray.length; i++) {
            System.out.println(i+1 + " --- " + ordersArray[i]);
        }
        int orderIndex = scanner.nextInt();
        Order order = ordersArray[orderIndex-1];

        if (!order.isDone()){
            order.orderPayment();
            order.setDone(true);
        } else System.out.println("Zlecenie jest już zapłacone.");

        System.out.println();
        System.out.println();
    }

    private static void showMenu(LinkedList<Order> orders, LinkedList<Mechanic> mechanics, LinkedList<Car> cars){
        Scanner scanner = new Scanner(System.in);
        int userChoice = 0;

        do {
            System.out.println("Wybierz opcję:");
            System.out.println("1 - Utwórz zlecenie");
            System.out.println("2 - Wykonaj zlecenie");
            System.out.println("3 - Sprawdź zlecenia/raporty");
            System.out.println("4 - Zapłać za zlecenie");
            System.out.println("5 - Wyjście");
            userChoice = scanner.nextInt();

            switch (userChoice){
                case 1 -> orders.add(newOrder(mechanics, cars));
                case 2 -> executeOrder(orders, mechanics, cars);
                case 3 -> showOrders(orders, mechanics, cars);
                case 4 -> orderPayment(orders, mechanics, cars);
                case 5 -> System.out.println("Zamykanie...");
                default -> System.out.println("Niepoprawny numer");
            }
        } while (userChoice != 5);
    }
}