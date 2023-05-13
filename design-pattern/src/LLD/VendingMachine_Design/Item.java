package LLD.VendingMachine_Design;

public class Item {
    private ItemType itemType;
    private int price;
    public Item(ItemType itemType, int price) {
        this.itemType = itemType;
        this.price = price;
    }

    public ItemType getItemType() {
        return itemType;
    }
    public int getPrice() {
        return price;
    }
    public void updatePrice(int amount) {
        this.price = amount;
    }
}
