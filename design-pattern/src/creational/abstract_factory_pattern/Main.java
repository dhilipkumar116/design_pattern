package creational.abstract_factory_pattern;


public class Main {
    public static void main(String[] args) {

        GPS gps = new GPS();
        String location = gps.getLocation();

        CarLocationFactory abstractcarlocationfactory1 = CarLocationFactory.getCarLocationFactory(location);
        CarBrand carbrand1 = abstractcarlocationfactory1.getCarBrandBasedOnBudget(100000);
        carbrand1.getCar();
        
        CarLocationFactory abstractcarlocationfactory2 = CarLocationFactory.getCarLocationFactory("GERMAN");
        CarBrand carbrand2 = abstractcarlocationfactory2.getCarBrandBasedOnBudget(100000);
        carbrand2.getCar();
        

    }
    
}
