package LLD.ATM_design;

public class Card {
    private String number;
    private String cvv;
    private String expireDate;
    private int pin = 123;
    Card(String number, String cvv, String expireDate) {
        this.number = number;
        this.cvv = cvv;
        this.expireDate = expireDate;
    }

    public String getNumber(){
        return this.number;
    }
    public String getCvv(){
        return this.cvv;
    }
    public String getExpireDate(){
        return this.expireDate;
    }
    public int getPin(){
        return this.pin;
    }

    public void printCardDetails() {
        System.out.println("cardNo : "+number);
        System.out.println("cvv : "+cvv);
        System.out.println("expireDate : "+expireDate);
        System.out.println("pin : "+pin);
    }

}
