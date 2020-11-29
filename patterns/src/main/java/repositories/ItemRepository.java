package repositories;

import entities.Entity;
import entities.Item;

import java.util.List;

public class ItemRepository implements Repository {
    private static ItemRepository itemRepository = new ItemRepository();
    private List<Item> items;

    private ItemRepository() {}

    public static ItemRepository getInstance() {
        return itemRepository;
    }

    public Entity getById(Long id) {
        for (Item item : items) {
            if (item.getId().equals(id)) return item;
        }
        return null;

    }

    public void editById(Long id) {

    }

    public void deleteById(Long id) {

    }
}
