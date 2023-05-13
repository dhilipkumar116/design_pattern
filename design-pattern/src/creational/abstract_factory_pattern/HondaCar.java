package creational.abstract_factory_pattern;

public class HondaCar implements CarBrand{
    @Override
    public void getCar(){
        System.out.println("German brand - HondaCar");
    }
}
