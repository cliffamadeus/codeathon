package Medium;

public class Medium {
	
	private double balance;

    public Medium(double initialBalance) {
        this.balance = initialBalance;
    }
	
    public double withdraw(double amountToWithdraw) {
        System.out.println("Current Balance: " + balance);
        System.out.println("Withdrawing: " + amountToWithdraw);

        if (amountToWithdraw > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amountToWithdraw;
            System.out.println("Withdrawal successful!");
        }

        System.out.println("New Balance: " + balance);
        return balance;
    }
	
	public static void main(String[] args) {
		
		Medium account = new Medium(1000);
		
		System.out.println("Case 1:");
        System.out.println(account.withdraw(500));
        System.out.println();
        
        System.out.println("Case 2:");
        System.out.println(account.withdraw(5000));
	}

}
