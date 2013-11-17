import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Statistics {
	
	protected DecimalFormat currency;
	
	public Statistics()
	{
		currency = new DecimalFormat("0.00");
	}
	
	public void calculate(Scanner scan, Income income, Budget budget)
	{
		int choice = 0;
		do{
			System.out.println("Budgeting Application 0.0.3"); //TODO update version every time
			System.out.println("Running on: " + System.getProperty("os.name") + "\n");
			
			System.out.print( //TODO change choices
					"== CALCULATE STATISTICS ==\n" +
					"Choice............Function\n" +
					"1........Allocated Budgets\n" + /* 
					"2.................CHOICE 2\n" + 
					"3.................CHOICE 3\n" +
					"4.................CHOICE 4\n" + */
					"0.....................Exit\n" + 
					"Please input choice: ");

			scan = new Scanner(System.in); // necessary to prevent loops
			
			try{
				choice = scan.nextInt();
			}
			catch(InputMismatchException e)
			{
				choice = -1;
			}
			
			switch (choice) {
	            case 1:
	            	//TODO choice 1
	            	calculateBudgets(income, budget);
	            	break;/*
	            case 2:  
	            	//TODO choice 2
	            	break;
	            case 3:  
	            	//TODO choice 3
	            	break;
	            case 4:
	            	//TODO choice 4
	            	break;*/
	            case 0:  
	        		System.out.println("==STATISTICS END==\n");
	            	break;
	            default: 
	            	System.out.println("[ERROR] " + choice + " is not a valid choice.\n" + 
	            					   "Please input a correct value.\n");
	            	break;
	        }
			
		}while(!(choice == 0));
	}
	
	public void calculateBudgets(Income income, Budget budget)
	{
		System.out.println("These are your expected budgets: \n" +
						   "ANNUAL INCOME: " + income.annualIncome + "\n"+
						   "NAME  |  PERCENTAGE OF INCOME% | $ESTIMATED AMOUNT");
		for(int i = 0; i < budget.budgets.size(); i++){
			String estAmount = currency.format(income.annualIncome*((double)budget.percentages.get(i)/100.00));
			System.out.println(budget.budgets.get(i) + " | " + budget.percentages.get(i) + "%  |  " +
		                     "$" + estAmount);
		}
	}
}
