package repositories;

import entities.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ItemRepository implements Repository {
    private static ItemRepository itemRepository = new ItemRepository();
    private static List<Item> items;

    private ItemRepository() {
        items = new ArrayList<>();
        items.add(new Item(1L, "Cheese", "Fresh", new BigDecimal(4)));
    }

    public static ItemRepository getInstance() {
        return itemRepository;
    }

    public Item getById(Long id) {
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
