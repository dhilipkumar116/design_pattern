package LLD.ATM_design.ATM_states;

import LLD.ATM_design.*;;

public class CheckBalanceState extends ATMstate{
    public CheckBalanceState() {
        System.out.println("operation choosen : BALANCE CHECK");
    }

    @Override 
    public void showBalance(User user){
        user.printUserBalance();
    }
}
