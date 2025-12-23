package model.classes;

import java.util.List;

public class CarService {
    private List<Order> orders;
    private List<Car> cars;

    public CarService(List<Order> orders, List<Car> cars) {
        this.orders = orders;
        this.cars = cars;
    }

    public void showOrders(){
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public void showCars(){
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
