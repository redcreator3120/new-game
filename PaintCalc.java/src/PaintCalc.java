import java.util.Scanner;
public class PaintCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//declare variables
			double price;
			double length, width, height;
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter the room's length >> ");
			length = keyboard.nextDouble();
			System.out.print("Enter the room's width >> ");
			width = keyboard.nextDouble();
			System.out.print("Enter the room's height >> ");
			height = keyboard.nextDouble();
			price = computeArea(length, width, height);
			System.out.println("The price to paint the room is $" + price);
			
			
	}


		public static double computeArea(double length, double width, double height) 
		{
			final double PRICE_GALLON = 32;
			double area = length * height * 2 + width * height * 2;
			double gallons;
			double price;
			gallons = computeGallons(area);
			System.out.println("You will need " + gallons + " gallons");
			price = gallons *  PRICE_GALLON;
			return price;
			
		}
		
		public static double computeGallons(double area) 
		{
			final int SQFT_PER_GAL = 350;
			double gallons = area / SQFT_PER_GAL;
			return gallons;
			
			
		}
}
