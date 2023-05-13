package LLD.VendingMachine_Design.states;

import LLD.VendingMachine_Design.VendingMachine;
import LLD.VendingMachine_Design.Coin;


public class HasCoinState extends VMState{
    public HasCoinState(){
        System.out.println("Ready to accept coin");
    }
    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin){
        vendingMachine.insertCoin(coin);
    }

    
}
