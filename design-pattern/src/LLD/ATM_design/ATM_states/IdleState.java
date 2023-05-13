package LLD.ATM_design.ATM_states;

import LLD.ATM_design.*;

public class IdleState extends ATMstate{
    
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is Inserted");
        atm.setCurrentATMState(new HasCardState());
    }

}
