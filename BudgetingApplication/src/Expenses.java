import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Expenses {

	ArrayList<String> reason;
	ArrayList<Integer> percentage;
	
	
	public Expenses()
	{
		reason = new ArrayList<String>();
		percentage = new ArrayList<Integer>();
	}
	
	public void setExpenses(Scanner scan)
	{
		boolean exit = false;
		System.out.println("");
		do{
			System.out.print("Stop Inputting Expenses? (Y/N): ");
			String input = scan.next();
			if(input.equals("Y"))
			{
				exit = true;
			}
			else if(input.equals("N"))
			{
				System.out.print("Input reason: ");
				String r = scan.next();
				System.out.println("Note: percentage = percentage allotted from income for this expense.");
				System.out.print("Input percentage (whole number): ");
				boolean x = true;
				int p = 0;
				do{
					try{
						Scanner s = new Scanner(scan.next());
						p = s.nextInt();
					}
					catch(InputMismatchException e)
					{
						x = false;
						System.out.print("INCORRECT INPUT" + "\n" + "Input percentage (whole number): ");
					}
				}while(x!=true);
				
				reason.add(r);
				percentage.add(p);
			}
			else
			{
				System.out.println("INCORRECT INPUT");
			}
		}while(exit == false);
	}
}
