import java.util.Scanner;
public class CharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		@SuppressWarnings("resource")
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter your name >> ");
		name = inputDevice.nextLine();
		System.out.print("Please enter your age >> ");
		age = inputDevice.nextInt();
		System.out.println("Your name is " + name + " and you are " + age + " years old.");
		
		
	}

}
