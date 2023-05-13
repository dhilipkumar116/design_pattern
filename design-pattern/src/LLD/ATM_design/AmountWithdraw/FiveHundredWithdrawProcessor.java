package LLD.ATM_design.AmountWithdraw;

import LLD.ATM_design.*;
public class FiveHundredWithdrawProcessor extends CashWithdrawProcessor{
    public FiveHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor){
        super(nextCashWithdrawProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount){

        int required =  remainingAmount/500;
        int balance = remainingAmount%500;

        if(required <= atm.getNoOfFiveHunderdNote()) {
            atm.deductNoOfFiveHunderedNote(required);
        }
        else if(required > atm.getNoOfFiveHunderdNote()) {
            balance = balance + (required-atm.getNoOfFiveHunderdNote()) * 500;
            atm.deductNoOfFiveHunderedNote(atm.getNoOfFiveHunderdNote());
        }

        if(balance != 0){
            super.withdraw(atm, balance);
        }
    }

}
