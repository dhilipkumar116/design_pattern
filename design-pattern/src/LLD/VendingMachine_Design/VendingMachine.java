package LLD.VendingMachine_Design;
import java.util.*;
import LLD.VendingMachine_Design.states.IdleState;
import LLD.VendingMachine_Design.states.VMState;

public class VendingMachine {

    // eager initialization
    public static VendingMachine vendingMachine = new VendingMachine();
    private VMState currenVmState;
    private List<Coin> coinList;
    
    private VendingMachine(){
        coinList = new ArrayList<>();   
    }
    
    
    
    public static VendingMachine getVendingMachineObj() {
        return vendingMachine;
    }

    public Inventory getInventory(){
        return Inventory.getInventory();
    }

    public VMState getCurrentVMState(){
        if(currenVmState == null) {
            currenVmState = new IdleState();
        }
        return this.currenVmState;
    }

    public void setCurrentVMState(VMState vmState){
        this.currenVmState = vmState;
    }

    public List<Coin> getCoinList() {
        return this.coinList;
    }
    public void insertCoin(Coin coin) {
        this.coinList.add(coin);
    }

    public void printInsertedCoin(){
        if(this.coinList.size() == 0) {
            System.out.println("no coins inserted");
            vendingMachine.setCurrentVMState(new IdleState());
            return;
        }
        int five=0,ten=0,twenty=0;
        for(Coin coin : coinList) {
            if(coin.toString() == "FIVE") {
                five +=1; 
            }else if(coin.toString() == "TEN") {
                ten +=1;
            }else{
                twenty +=1;
            }
            
        }
        System.out.println("---------------------------------------------------");
        System.out.println("printing coins:-");
        System.out.println("five : "+five);
        System.out.println("ten : "+ten);
        System.out.println("twenty : "+twenty);
        System.out.println("total money : "+(five*5+ten*10+twenty*20));
        System.out.println("---------------------------------------------------");
    }


}
