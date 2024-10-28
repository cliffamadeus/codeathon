package Hard;
import java.util.Scanner;

public class Hard {
	private int[] myArray;
	
	public Hard(int size) {
        myArray = new int[size];
    }
	
	public void inputExpenses() {
        Scanner scanner = new Scanner(System.in);
      
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter expense for day " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }
    }
    
	public void totalExpenses() {
		int total = 0;
		
		for (int value: myArray) {
			total +=value;
		}
		
		System.out.println("The total of expenses is " + total );
	}
	
	public void avgExpenses() {
		int total = 0;
		
		for (int value: myArray) {
			total +=value;
		}
		
		System.out.println("The average of your expenses is " + total/myArray.length);
	}
	
	public static void main(String[] args) {
		Hard test = new Hard(5);
		
		test.inputExpenses();
		test.totalExpenses();
		test.avgExpenses();

	}

}