import java.util.Scanner;
public class Percentages 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the first number >> ");
		double num1 = keyboard.nextDouble();
		System.out.print("Enter the second number >> ");
		double num2 = keyboard.nextDouble();
		computePercent(num1, num2);
		computePercent(num2, num1);
	}
	public static void computePercent(double x, double y)
	{
		
		System.out.println(x + " is " + (x / y) * 100 + "% of " + y); 
	}
}
