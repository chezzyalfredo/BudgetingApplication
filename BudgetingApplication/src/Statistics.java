import java.text.DecimalFormat;


public class Statistics {
	double income;
	double expenses;
	double misc;
	DecimalFormat currency;
	
	public Statistics()
	{
		income = 0.0;
		expenses = 0.0;
		misc = 0.0;
		currency = new DecimalFormat("##.##");
	}
	
	public void inputIncome(int i)
	{
		income = (double) i;
	}
	
	public void inputExpenses(double e)
	{
		expenses = e;
	}
	
	public void inputMiscellaneous(double m)
	{
		misc = m;
	}
	
	public void calculate()
	{
		
	}
	
	public void printStats()
	{
		
	}
}
