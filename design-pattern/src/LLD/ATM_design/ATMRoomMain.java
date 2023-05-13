package LLD.ATM_design;

import LLD.ATM_design.ATM_states.OperationType;

public class ATMRoomMain {

    User user;
    ATM atm;

    public static void main(String[] args) {

        ATMRoomMain atmRoom = new ATMRoomMain();
        System.out.println("--------------------------------");
        atmRoom.user = atmRoom.creatUser();
        atmRoom.user.printUserDetails();
        System.out.println("--------------------------------");
        atmRoom.atm = ATM.getATMObject();
        atmRoom.atm.setATMBalance(3, 3, 5);
        atmRoom.atm.printATMCurrentStatus();
        System.out.println("--------------------------------");
        atmRoom.atm.getCurrentATMState().insertCard(atmRoom.atm, atmRoom.user.getCard());
        int enteredPin = 123;
        atmRoom.atm.getCurrentATMState().authenticateCard(atmRoom.atm, atmRoom.user.getCard(), enteredPin);
        // atmRoom.atm.getCurrentATMState().selectOperation(atmRoom.atm, atmRoom.user.getCard(), OperationType.BALANCE_CHECK);
        // atmRoom.atm.getCurrentATMState().showBalance(atmRoom.user);

        atmRoom.atm.getCurrentATMState().selectOperation(atmRoom.atm, atmRoom.user.getCard(), OperationType.CASH_WITHDRAWAL);
        atmRoom.atm.getCurrentATMState().cashWithdraw(atmRoom.atm, atmRoom.user, 1200);
        atmRoom.atm.printATMCurrentStatus();
        System.out.println("user balance : "+atmRoom.user.getUserBalance());





    }

    public User creatUser() {
        // create card
        Card card = new Card("1234 9845 4655", "451", "12/09");
        // create bankaccount
        BankAccount bankAccount = new BankAccount("dhilip kumar", "46165", card);
        User user = new User("dhilip", card, bankAccount,2300);
        return user;
    }
    
}
