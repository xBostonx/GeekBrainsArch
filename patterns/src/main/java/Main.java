import entities.CompositeOrder;
import entities.Order;
import utils.OrderService;
import utils.OrderUtilWrapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order12 = new Order();
        Order order13 = new Order();
        Order order14 = new Order();
        Order order5 = new Order();


        CompositeOrder compositeOrder = new CompositeOrder();
        compositeOrder.add(order12);
        compositeOrder.add(order13);
        compositeOrder.add(order14);

        List<OrderUtilWrapper> ordersAll = new ArrayList<OrderUtilWrapper>();
        ordersAll.add(order1);
        ordersAll.add(compositeOrder);
        ordersAll.add(order5);

        OrderService.printAllOrders(ordersAll);

    }
}
