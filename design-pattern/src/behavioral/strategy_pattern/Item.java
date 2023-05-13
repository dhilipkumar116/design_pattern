package behavioral.strategy_pattern;

public class Item {

    int uuid;
    int amount;
    Item(int uuid,int amount){
        this.uuid = uuid;
        this.amount = amount;
    }
    public int getUuid() {
        return this.uuid;
    }
    public int getAmount() {
        return this.amount;
    }
    
}
