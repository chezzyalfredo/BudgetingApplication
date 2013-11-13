import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		int choice = 0;
		
		Income income = new Income();
		Expenses expenses = new Expenses();
		//Miscellaneous miscellaneous = new Miscellaneous();
		Statistics stats = new Statistics();
		
		do{
			System.out.print(
					"== PROGRAM STARTED ==\n" +
					"1..............Income\n" + 
					"2............Expenses\n" + 
					"3.......Miscellaneous\n" +
					"4....Print Statistics\n" +
					"0................Exit\n" + 
					"Please input a value: ");
			Scanner scan = new Scanner(System.in);
			try{
				choice = scan.nextInt();
			}
			catch(InputMismatchException e)
			{
				choice = -1;
			}
			
			switch (choice) {
	            case 1:
	            	//TODO
	            	System.out.print("Annual Income: ");
	                income.setIncome(scan.nextDouble());
	            	break;
	            case 2:  
	            	//TODO
	            	expenses.setExpenses(scan);
	            	break;
	            case 3:  
	            	//TODO
	            	System.out.println("input miscellaneous");
	            	break;
	            case 4:
	            	//TODO
	            	/*stats.calculate();
	            	stats.printStats();*/
	            	System.out.println("print out statistics here");
	            	break;
	            case 0:  
	        		System.out.println("==TERMINATED==");
	            	break;
	            default: 
	            	System.out.println("[ERROR] " + choice + " is not a valid choice.\n" + 
	            					   "Please input a correct value.");
	            	break;
	        }
			
		}while(!(choice == 0));
		
	}
	
}
