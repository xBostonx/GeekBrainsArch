package entities;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Order extends Entity {
    private Long id;

    private List<OrderItem> orderItems;

    private Long clientId;

    private BigDecimal totalSum;

    private OrderStatus status;
}
