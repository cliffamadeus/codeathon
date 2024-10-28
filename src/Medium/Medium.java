package Medium;

public class Medium {
	
	double balance;
	double amountToWithdraw;
	
	public double withdraw(double balance, double amountToWithdraw) {
		
		 if (balance > amountToWithdraw) {
			 return balance - amountToWithdraw;
	     }else {
	    	 return balance;
	     }
	}

	public static void main(String[] args) {
		
		Medium test = new Medium();
		
		System.out.println(test.withdraw(1000, 500));
	}

}
