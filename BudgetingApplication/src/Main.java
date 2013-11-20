import java.io.Console;
import java.io.IOException;
import java.io.PrintStream;
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
		Budget budget = new Budget();
		//Expense expense = new Expense();
		Statistics stats = new Statistics();
		
		
		do{
			clearConsole();
			System.out.println("Budgeting Application 0.0.3"); //TODO update version every time
    		System.out.println("Running on: " + System.getProperty("os.name") + "\n");
    		
    		
			System.out.print(
					"== PROGRAM STARTED ==\n" +
					"Choice.......Function\n" +
					"1..............Income\n" + 
					"2..............Budget\n" + /*
					"3.............Expense\n" + */
					"4..........Statistics\n" +
					"0................Exit\n" + 
					"Please input choice: ");
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
	            	income.setIncome(scan);
	            	break;
	            case 2:  
	            	//TODO
	            	budget.setBudget(scan);
	            	break; /*
	            case 3:  
	            	//TODO
	            	break; */
	            case 4:
	            	//TODO
	            	stats.calculate(scan, income, budget);
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
	


	static void clearConsole()
	{
	    try
	    {
	        String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	        	System.out.println(os);
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (Exception exception)
	    {
	        //  Handle exception.
	    }
	}
	
}
