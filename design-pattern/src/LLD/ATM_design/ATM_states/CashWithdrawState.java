package LLD.ATM_design.ATM_states;

import LLD.ATM_design.*;
import LLD.ATM_design.AmountWithdraw.CashWithdrawProcessor;
import LLD.ATM_design.AmountWithdraw.*;


public class CashWithdrawState extends ATMstate{
    public CashWithdrawState() {
        System.out.println("operation choosen : CASH WITHDRAW");
    }

    @Override 
    public void cashWithdraw(ATM atm, User user, int requestedAmount) {
        System.out.println("requested amount :"+requestedAmount);

        if(atm.getATMBalance() < requestedAmount) {
            System.out.print("insufficient balance in ATM!.");
            atm.setCurrentATMState(new FinalState());
            atm.getCurrentATMState().exitAll(atm);
        }else if(user.getUserBalance() < requestedAmount) {
            System.out.print("insufficient balance in your account!.");
            atm.setCurrentATMState(new FinalState());
            atm.getCurrentATMState().exitAll(atm);
        }else {
            CashWithdrawProcessor withdrawProcessor =
                    new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));
            withdrawProcessor.withdraw(atm, requestedAmount);
            user.setUserBalance(user.getUserBalance()-requestedAmount);
            atm.deductATMBalance(requestedAmount);
        }

    }

}
