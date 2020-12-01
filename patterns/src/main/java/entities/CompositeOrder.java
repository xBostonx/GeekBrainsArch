package entities;

import lombok.Data;
import utils.OrderUtilWrapper;

import java.util.ArrayList;
import java.util.List;

@Data
public class CompositeOrder implements OrderUtilWrapper {
    private List<OrderUtilWrapper> multiOrder = new ArrayList<OrderUtilWrapper>();

    public void add(OrderUtilWrapper order) {
        multiOrder.add(order);
    }

    public void printOrder() {
        System.out.println("Its multiorder!");
    }
}
