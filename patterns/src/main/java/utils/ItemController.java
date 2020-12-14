package utils;

import entities.Item;
import repositories.ItemRepository;

public class ItemController {
    private ItemView view;
    private ItemRepository itemRepository;

    public ItemController(ItemView view){
        this.itemRepository = ItemRepository.getInstance();
        this.view = view;
    }

    public Item getItemInfoById(Long id){
        return itemRepository.getById(id);
    }

    public void updateView(Long id){
        view.showFullItemInfo(getItemInfoById(id));
    }
}
