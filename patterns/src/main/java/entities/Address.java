package entities;

import lombok.Data;

@Data
public class Address extends Entity {
    private Long id;

    private String region;

    private String city;

    private String street;

    private short homeNumber;

    private short apartment;

}
