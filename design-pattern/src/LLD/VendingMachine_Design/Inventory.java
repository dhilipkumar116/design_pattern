package LLD.VendingMachine_Design;
import java.util.*;

public class Inventory {
    
    private Inventory() {
        inventoryMap = new HashMap<>();
    }

    private static Inventory inventory = new Inventory();
    private static final int INVENTORY_SIZE = 9;
    Map<Integer,ItemShelf> inventoryMap;
    
    public static Inventory getInventory() {
        return inventory;
    }

    public void createInventory() {
        addItemToInventory(new ItemShelf(new Item(ItemType.BOVONTO, 10), 101, 3));
        addItemToInventory(new ItemShelf(new Item(ItemType.CHEESE_BALL, 5), 102, 45));
        addItemToInventory(new ItemShelf(new Item(ItemType.GEMS, 15), 103, 24));
        addItemToInventory(new ItemShelf(new Item(ItemType.SEVEN_UP, 5), 104, 30));
        addItemToInventory(new ItemShelf(new Item(ItemType.SODA, 20), 105, 23));
        addItemToInventory(new ItemShelf(new Item(ItemType.MAGI, 10), 106, 12));
        addItemToInventory(new ItemShelf(new Item(ItemType.PEPSI, 15), 107, 54));
        addItemToInventory(new ItemShelf(new Item(ItemType.SLICE, 5), 108, 34));
        addItemToInventory(new ItemShelf(new Item(ItemType.THUMBS_UP, 5), 109, 65));
    }

    public void addItemToInventory(ItemShelf itemShelf) {
        if(inventoryMap.size() == INVENTORY_SIZE) {
            System.out.println("inventory is already full. you cannot add items");
            return;
        }
        inventoryMap.put(itemShelf.getShelfLocation(), itemShelf);
    }

    public ItemShelf getItemShelf(int location) {
        if(!inventoryMap.containsKey(location)) {
            return null;
        }
        return inventoryMap.get(location);
    }

    public void printInventory() {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("INVENTORY ITEMS :-");
        for(int location = ShelfLocation.INITIAL_LOCATION; 
                    location < ShelfLocation.INITIAL_LOCATION+INVENTORY_SIZE; 
                        location++) {
            ItemShelf temp = inventoryMap.get(location);
            System.out.println("location : "+location+" => name : "+temp.getItem().getItemType()+" => availability : "+temp.getNoOfItemAvailable()+".");
        }
        System.out.println("------------------------------------------------------------------------------------");
    }

}
