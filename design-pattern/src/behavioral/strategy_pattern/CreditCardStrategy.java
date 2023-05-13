package behavioral.strategy_pattern;

public class CreditCardStrategy implements PaymentStrategy{
    
    private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
		this.name=nm;
		this.cardNumber=ccNum;
		this.cvv=cvv;
		this.dateOfExpiry=expiryDate;
	}

    public void pay(int amount) {
        System.out.println(amount+"rs, paid using credit card strategy");
    }
}
