package entities;

import lombok.Data;
import utils.OrderUtilWrapper;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Order extends Entity implements OrderUtilWrapper {
    private Long id;

    private List<OrderItem> orderItems;

    private Long clientId;

    private BigDecimal totalSum;

    private OrderStatus status;

    public void printOrder() {
        System.out.println("Just one order!");
    }
}
