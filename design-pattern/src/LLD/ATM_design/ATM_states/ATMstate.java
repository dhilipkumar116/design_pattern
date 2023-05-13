package LLD.ATM_design.ATM_states;

import LLD.ATM_design.ATM;
import LLD.ATM_design.Card;
import LLD.ATM_design.User;

public abstract class ATMstate {
    public void insertCard(ATM atm, Card card) {
        System.out.println("dummy insertCard implementation");
    }
    public void authenticateCard(ATM atm, Card card, int enteredPin) {
        System.out.println("dummy authenticateCard implementation");
    }

    public void selectOperation(ATM atm, Card card, OperationType operationType){
        System.out.println("dummy selectOperation implementation");
    }

    public void cashWithdraw(ATM atm, User user, int requestedAmount) {
        System.out.println("dummy cashWithdraw implementation");
    }

    public void showBalance(User user) {
        System.out.println("dummy showBalance implementation");
    }

    public void returnCard(ATM atm) {
        System.out.println("dummy returnCard implementation");
    }
    public void exitAll(ATM atm) {
        System.out.println("dummy exitAll implementation");
    }
}
