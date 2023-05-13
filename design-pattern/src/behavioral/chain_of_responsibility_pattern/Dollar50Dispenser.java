package behavioral.chain_of_responsibility_pattern;

public class Dollar50Dispenser implements DispenseChain{
    
    private DispenseChain nextChain;
    
    @Override
    public void setNextChain(DispenseChain nextChain){
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency){
        if(currency.getAmount() >= 50) {
            int count = currency.getAmount()/50;
            int reminder = currency.getAmount()%50;
            System.out.println("dispensing "+count+" - 50$ note");
            if(reminder != 0) {
                this.nextChain.dispense(new Currency(reminder));
            }
        }else{
            this.nextChain.dispense(currency);
        }
    }

}
