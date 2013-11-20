
public class Wages {
	
	public enum WageType {
	    ANNUAL, HOURLY //more to come if necessary  
	}
	
	protected double wages;
	protected WageType type;
	
	public Wages(double w)
	{
		wages = w;
	}
	
	public void setHourly()
	{
		type = WageType.HOURLY;
	}
	
	public void setAnnual()
	{
		type = WageType.ANNUAL;
	}
}