package behavioral.chain_of_responsibility_pattern;

public class Dollar10Dispenser implements DispenseChain {

    private DispenseChain nextChain;
    
    @Override
    public void setNextChain(DispenseChain nextChain){
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency){
        if(currency.getAmount() >= 10) {
            int count = currency.getAmount()/10;
            int reminder = currency.getAmount()%10;
            System.out.println("dispensing "+count+" - 10$ note");
            if(reminder != 0) {
                this.nextChain.dispense(new Currency(reminder));
            }
        }else{
            this.nextChain.dispense(currency);
        }
    }
    
}
