package structural.decorator_pattern;

public abstract class ToppingDecorator implements Pizza{
    
    protected Pizza tempPizza;
    ToppingDecorator(Pizza newPizza) {
        this.tempPizza = newPizza;
    }

    public String getDescription() {
        return tempPizza.getDescription();
    }
    public int getAmount() {
        return tempPizza.getAmount();
    }
}
