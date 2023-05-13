package creational.abstract_factory_pattern;

public class GermanCarFactory extends CarLocationFactory{
    public CarBrand getCarBrandBasedOnBudget(int amount) {
        if(amount < 800000){
            return new HondaCar();
        }else{
            return new VWCar();
        }
    }
}
