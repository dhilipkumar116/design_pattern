package creational.abstract_factory_pattern;

// A level of abstration added to factory design pattern
public abstract class CarLocationFactory {

    public static CarLocationFactory getCarLocationFactory(String location) {
        if(location=="INDIA"){
            return new IndianCarFactory();
        }else{
            return new GermanCarFactory();
        }
    }

    public abstract CarBrand getCarBrandBasedOnBudget(int amount);
    
}
