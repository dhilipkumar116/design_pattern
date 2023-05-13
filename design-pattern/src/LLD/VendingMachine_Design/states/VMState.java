package LLD.VendingMachine_Design.states;

import LLD.VendingMachine_Design.Coin;
import LLD.VendingMachine_Design.VendingMachine;

public abstract class VMState {
    
    public void clickOnInsertCoinButton(VendingMachine vendingMachine){}
    public void insertCoin(VendingMachine vendingMachine, Coin coin){}

}
