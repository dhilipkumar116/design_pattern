package LLD.ATM_design.ATM_states;

import LLD.ATM_design.*;

public class HasCardState extends ATMstate {
    public HasCardState() {
        System.out.println("enter your card pin number.");
    }

    @Override 
    public void authenticateCard(ATM atm, Card card, int enteredPin) {
        System.out.println("entered pin number : "+enteredPin+".");
        if(card.getPin()==enteredPin){
            System.out.println("authentication success.");
            atm.setCurrentATMState(new SelectActionState());
        }else{
            System.out.println("authentication failed.");
            atm.setCurrentATMState(new FinalState());
            atm.getCurrentATMState().exitAll(atm);
        }
    }
}
