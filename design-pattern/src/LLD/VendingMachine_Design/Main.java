package LLD.VendingMachine_Design;

import LLD.VendingMachine_Design.states.IdleState;
import LLD.VendingMachine_Design.states.SelectProductState;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = VendingMachine.getVendingMachineObj();
        Inventory inventory = vendingMachine.getInventory();
        inventory.createInventory();
        inventory.printInventory();
        vendingMachine.setCurrentVMState(new IdleState());
        vendingMachine.getCurrentVMState().clickOnInsertCoinButton(vendingMachine);
        vendingMachine.getCurrentVMState().insertCoin(vendingMachine,Coin.FIVE);
        vendingMachine.getCurrentVMState().insertCoin(vendingMachine,Coin.FIVE);
        vendingMachine.getCurrentVMState().insertCoin(vendingMachine,Coin.TEN);
        vendingMachine.getCurrentVMState().insertCoin(vendingMachine,Coin.TEN);
        vendingMachine.getCurrentVMState().insertCoin(vendingMachine,Coin.TWENTY);
        vendingMachine.printInsertedCoin();
        vendingMachine.setCurrentVMState(new SelectProductState());
        // need to implement select product and dispense product 


    }
}
