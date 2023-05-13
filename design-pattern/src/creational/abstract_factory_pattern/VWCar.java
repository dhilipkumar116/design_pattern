package creational.abstract_factory_pattern;

public class VWCar implements CarBrand{
    @Override
    public void getCar(){
        System.out.println("German brand - VWCar");
    }
}
