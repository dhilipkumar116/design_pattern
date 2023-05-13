package LLD.VendingMachine_Design;

public enum Coin {

    FIVE(5),TEN(10),TWENTY(20);
    private int value;
    private Coin(int value){
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
}
