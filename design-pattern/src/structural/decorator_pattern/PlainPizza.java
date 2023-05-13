package structural.decorator_pattern;

public class PlainPizza implements Pizza{

    public String getDescription() {
        return "Thin dough";
    }

    public int getAmount() {
        // base price
         return 100;
    }
    
}
