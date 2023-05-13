package behavioral.chain_of_responsibility_pattern;

public class ATM {
    private DispenseChain c1;
    public ATM(){
        c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }
    public static void main(String[] args) {

        // Chain of responsibility pattern is used to achieve loose coupling 
        // in software design where a request from client is passed to a chain 
        // of objects to process them. Then the object in the chain will decide 
        // themselves who will be processing the request and whether the request 
        // is required to be sent to the next object in the chain or not.

        ATM atm = new ATM();
        int requestedAmount = 530;
        if(requestedAmount%10 != 0) {
            System.out.println("enter multiples of 10s");
            return;
        }
        atm.c1.dispense(new Currency(requestedAmount));
    }
    
}
