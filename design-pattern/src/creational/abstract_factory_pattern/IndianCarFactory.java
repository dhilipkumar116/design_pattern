package creational.abstract_factory_pattern;

public class IndianCarFactory extends CarLocationFactory{

    public CarBrand getCarBrandBasedOnBudget(int amount) {
        if(amount < 500000) {
            return new MaruthiCar();
        }else{
            return new TataCar();
        }
    }

}
