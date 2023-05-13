package LLD.ATM_design.ATM_states;

import LLD.ATM_design.ATM;

public class FinalState extends ATMstate {
    
    @Override 
    public void returnCard(ATM atm) {
        System.out.println("returning your card...");
        System.out.println("please collect the card.");
        atm.setCurrentATMState(new IdleState());
    }

    @Override
    public void exitAll(ATM atm) {
        atm.getCurrentATMState().returnCard(atm);
        System.out.println("Thank you for visiting our ATM!.");
    }
}
