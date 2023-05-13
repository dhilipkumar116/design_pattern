package LLD.ATM_design;

public class User {
    
    private String name;
    private Card card;
    private BankAccount bankAccount;
    private int userBalance;

    public User(String name, Card card, BankAccount bankAccount, int userBalance) {
        this.name = name;
        this.card = card;
        this.bankAccount = bankAccount;
        this.userBalance = userBalance;
    }

    public String getName() {
        return this.name;
    }

    public Card getCard() {
        return this.card;
    }

    public int getUserBalance() {
        return this.userBalance;
    }

    public BankAccount geBankAccount() {
        return this.bankAccount;
    }

    public void setUserBalance(int amount) {
        this.userBalance = amount;
    } 

    public void printUserDetails() {
        System.out.println("user name : "+name);
        card.printCardDetails();
    }

    public void printUserBalance() {
        System.out.println("-----------------------------------------");
        System.out.println("user name : "+name);
        System.out.println("bank account : "+bankAccount.getAccountNumber());
        System.out.println("balance : "+userBalance);
        System.out.println("------------------------------------------");
    }

}
