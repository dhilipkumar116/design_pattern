package LLD.ATM_design.AmountWithdraw;

import LLD.ATM_design.*;
public class OneHundredWithdrawProcessor extends CashWithdrawProcessor{
    public OneHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor){
        super(nextCashWithdrawProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount){

        int required =  remainingAmount/100;
        int balance = remainingAmount%100;

        if(required <= atm.getNoOfOneHunderedNote()) {
            atm.deductNoOfOneHunderedNote(required);
        }
        else if(required > atm.getNoOfOneHunderedNote()) {
            balance = balance + (required-atm.getNoOfOneHunderedNote()) * 100;
            atm.deductNoOfOneHunderedNote(atm.getNoOfOneHunderedNote());
        }

        if(balance != 0){
           System.out.println("Something went wrong");
        }
    }
}
