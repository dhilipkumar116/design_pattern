package behavioral.chain_of_responsibility_pattern;

public class Dollar20Dispenser implements DispenseChain {

    private DispenseChain nextChain;
    
    @Override
    public void setNextChain(DispenseChain nextChain){
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency){
        if(currency.getAmount() >= 20) {
            int count = currency.getAmount()/20;
            int reminder = currency.getAmount()%20;
            System.out.println("dispensing "+count+" - 20$ note");
            if(reminder != 0) {
                this.nextChain.dispense(new Currency(reminder));
            }
        }else{
            this.nextChain.dispense(currency);
        }
    }
    
}
