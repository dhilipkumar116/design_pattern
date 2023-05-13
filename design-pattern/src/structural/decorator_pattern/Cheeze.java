package structural.decorator_pattern;

public class Cheeze extends ToppingDecorator {
    public Cheeze(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription() {
        return super.getDescription() + ", cheeze";
    }
    public int getAmount() {
        return super.getAmount() + 10;
    }
}
