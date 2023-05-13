package LLD.ATM_design.AmountWithdraw;

import LLD.ATM_design.*;
public class TwoThousandWithdrawProcessor extends CashWithdrawProcessor{
    
    public TwoThousandWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount) {

       int required =  remainingAmount/2000;
       int balance = remainingAmount%2000;

       if(required <= atm.getNoOfTwoThousandNote()) {
           atm.deductNoOfTwoThousandNote(required);
       }
       else if(required > atm.getNoOfTwoThousandNote()) {
            balance = balance + (required-atm.getNoOfTwoThousandNote()) * 2000;
           atm.deductNoOfTwoThousandNote(atm.getNoOfTwoThousandNote());
        }

       if(balance != 0){
           super.withdraw(atm, balance);
       }
    }


}
