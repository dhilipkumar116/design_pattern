package LLD.ATM_design.ATM_states;

import LLD.ATM_design.*;
public class SelectActionState extends ATMstate{
    public SelectActionState() {
        showOperation();
    }

    @Override
    public void selectOperation(ATM atm, Card card, OperationType type) {
        switch (type) {
            case CASH_WITHDRAWAL:
                atm.setCurrentATMState(new CashWithdrawState());
                break;
            case BALANCE_CHECK:
                atm.setCurrentATMState(new CheckBalanceState());
                break;
            default:
                System.out.println("Invalid Option");
                atm.setCurrentATMState(new FinalState());
                atm.getCurrentATMState().exitAll(atm);
                break;
        }
    }

    public void showOperation() {
        System.out.println("please select the operation:");
        OperationType.showAllTypeOfOperation();
    }
}
