package behavioral.strategy_pattern;
import java.util.*;

public class ShoppingCart{

    List<Item> products;
    ShoppingCart() {
        products = new ArrayList<Item>();
    }

    public void addProduct(Item item){
        this.products.add(item);
    }

    public int getTotalAmount(){
        int amount = 0;
        for(Item item : this.products){
            amount += item.getAmount();
        }
        return amount;
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(this.getTotalAmount());
    }

}