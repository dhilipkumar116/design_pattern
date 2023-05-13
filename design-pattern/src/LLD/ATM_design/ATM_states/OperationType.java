package LLD.ATM_design.ATM_states;

public enum OperationType {
 
    CASH_WITHDRAWAL, BALANCE_CHECK;

    public static void showAllTypeOfOperation(){
        int i = 0;
        for(OperationType type : OperationType.values()){
            System.out.println(++i+")"+type.name());
        }
    }
    
}
