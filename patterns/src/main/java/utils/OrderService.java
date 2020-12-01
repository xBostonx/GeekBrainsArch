package utils;

import java.util.List;

public class OrderService {
    public static void printAllOrders(List<OrderUtilWrapper> list) {
        for (OrderUtilWrapper wrapper : list) {
        wrapper.printOrder();
        }
    }
}
