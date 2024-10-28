package Medium;

public class Medium {
	
	double balance;
	double amountToWithdraw;
	
	public double withdraw(double balance, double amountToWithdraw) {
		
		 if (balance > amountToWithdraw) {
			 System.out.println("Withdrawal successful!");
			 System.out.println("Current Balance is:");
			 return balance - amountToWithdraw;
	     }else {
	    	 System.out.println("Insufficient Balance!");
			 System.out.println("Current Balance is:");
	    	 return balance;
	     }
	}

	public static void main(String[] args) {
		
		Medium test = new Medium();
		
		System.out.println(test.withdraw(1000, 5000));
	}

}
