package model.classes;

import java.util.List;

public class CarServis {
    private List<Order> orders;
    private List<Car> cars;

    public CarServis(List<Order> orders, List<Car> cars) {
        this.orders = orders;
        this.cars = cars;
    }

    public void showOrders(){
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
