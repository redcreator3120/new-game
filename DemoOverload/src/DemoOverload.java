
public class DemoOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 6, day = 24, year = 2015;
		displayDate(month);
		displayDate(month, day);
		displayDate(month, day, year);
	}
	public static void displayDate(int mm) 
	{
		System.out.println("Event date " + mm + "/1/2014");
	}
	
	public static void displayDate(int mm, int dd) 
	{
		System.out.println("\nEvent date " + mm + "/" + dd + "/2014");
	}
	public static void displayDate(int mm, int dd, int yy)
	{
		System.out.println("\nEvent date " + mm + "/" + dd + "/" + yy);
	}
	
	
	
	
}
