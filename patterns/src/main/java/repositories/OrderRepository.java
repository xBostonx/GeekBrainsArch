package repositories;

import entities.Entity;
import entities.Order;

import java.util.List;

public class OrderRepository implements Repository {
    private static OrderRepository orderRepository = new OrderRepository();
    private List<Order> orders;

    private OrderRepository(){}

    public static OrderRepository getInstance() {
        return orderRepository;
    }

    public Entity getById(Long id) {
        for (Order order : orders) {
            if (order.getId().equals(id)) return order;
        }
        return null;

    }

    public void editById(Long id) {

    }

    public void deleteById(Long id) {

    }
}
