package entities;

import lombok.Data;

@Data
public class OrderItem extends Entity {
    private Long id;

    private Item item;

    private int count;
}
