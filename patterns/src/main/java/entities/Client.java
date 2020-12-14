package entities;

import lombok.Data;

import java.util.List;

@Data
public class Client extends Entity{
    private Long id;

    private String clientName;

    private List<Order> orders;

    private int telephoneNum;

    private Address address;
}
