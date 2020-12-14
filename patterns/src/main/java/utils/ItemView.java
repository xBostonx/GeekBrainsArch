package utils;

import entities.Item;

public class ItemView {
        public void showFullItemInfo(Item item){
            System.out.println("Item info: ");
            System.out.println("ID: " + item.getId());
            System.out.println("Title: " + item.getTitle());
            System.out.println("Price: " + item.getPrice());
            System.out.println("Description: " + item.getDescription());
        }
}
