package Medium;

public class Medium {
	
	double balance,amountToWithdraw;
	
	public double withdraw(double balance,double amountToWithdraw) {
		return balance;
	}

	public static void main(String[] args) {
		
		Medium test = new Medium();
		
		System.out.println(test.withdraw(1000, 500));
	}

}
