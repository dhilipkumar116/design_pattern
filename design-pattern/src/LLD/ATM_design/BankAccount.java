package LLD.ATM_design;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private Card card;

    public BankAccount(String accountHolder, String accountNumber, Card card) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.card =  card;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
    public Card getCard() {
        return this.card;
    }

}
