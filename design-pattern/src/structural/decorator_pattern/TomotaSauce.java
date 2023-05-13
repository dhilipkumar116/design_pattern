package structural.decorator_pattern;

public class TomotaSauce extends ToppingDecorator{

    public TomotaSauce(Pizza newPizza) {
        super(newPizza);
    }
    public String getDescription() {
        return super.getDescription() + ", tomota sauce";
    }
    public int getAmount() {
        return super.getAmount() + 10;
    }
    
}
