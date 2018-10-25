
public class Bread {
	String breadType;
	final static String MOTTO = "\"The staff of life\"";
	int calories;
	
	public Bread()
	{
		 this("rye", 65, "The staff of life");
	}
	
	public Bread(String breadType, int calories, String MOTTO)
	{
		this.breadType = breadType;
		this.calories = calories;
	}
	
	public String getbreadType()
	{
		return breadType;
	}
	
	public final String getMOTTO()
	{
		return MOTTO;
	}
	
	public int getCalories()
	{
		return calories;
	}
	
}
