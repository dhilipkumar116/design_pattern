package behavioral.strategy_pattern;

public class PayPalStrategy implements PaymentStrategy{

    private String emailId;
	private String password;
	
	public PayPalStrategy(String email, String pwd){
		this.emailId=email;
		this.password=pwd;
	}
    public void pay(int amount) {
        System.out.println(amount+"rs, paid using paypal");
    }
}
