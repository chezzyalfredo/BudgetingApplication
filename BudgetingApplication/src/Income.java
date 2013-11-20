import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Income {

	protected double annualIncome;
	protected ArrayList<Wages> incomes = new ArrayList<Wages>();
	protected DecimalFormat currency = new DecimalFormat("0.00");
	
	public Income()
	{
		annualIncome = 0;
	}
	
	public void setIncome(Scanner scan)
	{
		//TODO see notes at bottom for multiple income
		
		int choice = 0;
		do{
			System.out.println("Budgeting Application 0.0.3"); //TODO update version every time
			System.out.println("Running on: " + System.getProperty("os.name") + "\n");
			
			System.out.print( //TODO change choices
					"==    ADD INCOME    ==\n" +
					"Choice........Function\n" +
					"1........Annual Income\n" +
					"2........Hourly Income\n" + /* 
					"3.............CHOICE 3\n" +
					"4.............CHOICE 4\n" + */
					"0.................Exit\n" + 
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
	            	setAnnualIncome(scan);
	            	break;
	            case 2:  
	            	//TODO choice 2
	            	setHourlyIncome(scan);
	            	break; /*
	            case 3:  
	            	//TODO choice 3
	            	break;
	            case 4:
	            	//TODO choice 4
	            	break; */
	            case 0:  
	        		System.out.println("==INCOME END==\n");
	            	break;
	            default: 
	            	System.out.println("[ERROR] " + choice + " is not a valid choice.\n" + 
	            					   "Please input a correct value.");
	            	break;
	        }
			
		}while(!(choice == 0));
	}
	
	public void setAnnualIncome(Scanner scan){
		System.out.print("Annual Income (Format $$.$$): ");
        double i = scan.nextDouble();
		annualIncome = i;
	}
	
	public void setHourlyIncome(Scanner scan){
		System.out.print("Hourly Income (Format $$.$$): ");
		double i = scan.nextDouble();
		System.out.print("Hours per week: ");
		double h = scan.nextDouble();
		System.out.println("Wages per paycheck (2 weeks): " + currency.format(h*i*2));
	}
	
	//TODO figure out what other logic to place here
	/* - payment schedule (eg. 15th and EOM, bimonthly, monthly, weekly)
	 * - maybe make options to input by hourly wages
	 *   - hours/week or hour/daily
	 *   - need to insert settings for overtime as well.
	 * - multiple incomes?
	 *   - job titles to go with income
	 *   - array for list of incomes and different ways to calculate each.
	 */
}
