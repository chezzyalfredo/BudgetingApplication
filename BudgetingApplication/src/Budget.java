import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Budget {

	protected ArrayList<String> budgets;
	protected ArrayList<Double> percentages;
	
	
	public Budget()
	{
		budgets = new ArrayList<String>();
		percentages = new ArrayList<Double>();
	}
	
	// PLAN
	/*  - implement choices here
	 * 
	 */
	
	public void setBudget(Scanner scan)
	{
		
		boolean exit = false;
		do{
			System.out.println("Budgeting Application 0.0.3"); //TODO update version every time
			System.out.println("Running on: " + System.getProperty("os.name") + "\n");
			System.out.println("== BUDGETS ==");
			if(budgets.size() > 0)
			{
				System.out.println("BUDGET NAME | PERCENTAGE OF INCOME%");
				for(int i = 0; i < budgets.size(); i++)
				{
					System.out.println(budgets.get(i) + " | " + percentages.get(i));
				}
				System.out.print("\n");
			}
			else
			{
				System.out.println("No Set Budgets\n");
			}
			System.out.print("Stop Inputting Budgets? (Y/N): ");
			String input = scan.next();
			if(input.equals("Y"))
			{
				exit = true;
			}
			else if(input.equals("N"))
			{
				System.out.print("Input budget name: ");
				String r = scan.next();
				System.out.println("Note: percentage = percentage allotted from income for this budget.");
				System.out.print("Input percentage %%.%%: ");
				boolean x = true;
				double p = 0.0;
				do{
					try{
						Scanner s = new Scanner(scan.next());
						p = s.nextDouble();
					}
					catch(InputMismatchException e)
					{
						x = false;
						System.out.print("INCORRECT INPUT" + "\n" + "Input percentage (%%.%%): ");
					}
				}while(x!=true);
				
				budgets.add(r);
				percentages.add(p);
			}
			else
			{
				System.out.println("INCORRECT INPUT\n");
			}
		}while(exit == false);
	}
}
