package repositories;

import entities.Address;
import entities.Entity;

import java.util.List;

public class AddressRepository implements Repository {
    private static AddressRepository addressRepository = new AddressRepository();
    private List<Address> addresses;

    private AddressRepository() {}

    public static AddressRepository getInstance(){
        return addressRepository;
    }

    public Entity getById(Long id) {
        for (Address address : addresses) {
            if (address.getId().equals(id)) return address;
        }
        return null;
    }

    public void editById(Long id) {

    }

    public void deleteById(Long id) {

    }
}
