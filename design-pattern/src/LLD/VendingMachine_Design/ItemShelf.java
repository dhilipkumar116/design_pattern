package LLD.VendingMachine_Design;

public class ItemShelf {
    private Item item;
    private int shelfLoc;
    private int noOfItemAvailable;
    ItemShelf(Item item, int shelfLoc, int noOfItemAvailable) {
        this.item = item;
        this.shelfLoc = shelfLoc;
        this.noOfItemAvailable = noOfItemAvailable;
    }

    public Item getItem() {
        return this.item;
    }
    public int getShelfLocation() {
        return this.shelfLoc;
    }
    public int getNoOfItemAvailable() {
        return this.noOfItemAvailable;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public void setShelfLocation(int shelfLoc) {
        this.shelfLoc = shelfLoc;
    }
    public void setNoOfItemAvailable(int noOfItemAvailable) {
        this.noOfItemAvailable = noOfItemAvailable;
    }

    public boolean isAvailable() {
        return this.noOfItemAvailable != 0;
    }

    public void deductAbailabity(int count) {
        this.noOfItemAvailable = this.noOfItemAvailable-count;
    }

}
