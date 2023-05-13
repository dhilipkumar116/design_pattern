package LLD.VendingMachine_Design.states;

import LLD.VendingMachine_Design.*;

public class IdleState extends VMState{
    public IdleState() {
        System.out.println("vending machine is ready!!!");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        vendingMachine.setCurrentVMState(new HasCoinState());
    }

}
