package structural.decorator_pattern;

public class PizzaMakerMain {
    
    // used to modify the functionality of an object at runtime. 
    // At the same time other instances of the same class will not be 
    // affected by this, so individual object gets the modified behavior.
    public static void main(String[] args) {
        Pizza pizza = new TomotaSauce(new Sausage(new PlainPizza()));
        System.out.println("description : "+pizza.getDescription());
        System.out.println("amount : "+pizza.getAmount());
    }

}
