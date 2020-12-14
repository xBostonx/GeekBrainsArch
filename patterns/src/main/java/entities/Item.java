package entities;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Item extends Entity {
    private Long id;

    private String title;

    private String description;

    private BigDecimal price;

    public Item(Long id, String title, String description, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
    }
}
