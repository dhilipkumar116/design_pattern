package structural.decorator_pattern;

public class Sausage extends ToppingDecorator{
    public Sausage(Pizza newPizza) {
        super(newPizza);
    }
    public String getDescription() {
        return super.getDescription() + ", Sausage";
    }
    public int getAmount() {
        // sausage price = 50
        return super.getAmount() + 50;
    }
}
