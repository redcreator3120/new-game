import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double overtimePay;
		double weeklySalary;
		double weeklySalary2;
		double payRate, regularHours, overtimeHours;
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter hourly pay rate >> ");
		payRate = kb.nextDouble();
		System.out.print("Enter regular hours >> ");
		regularHours = kb.nextDouble();
		System.out.print("Enter overtime hours >> ");
		overtimeHours = kb.nextDouble();
		overtimePay = computeOvertime(regularHours, overtimeHours, payRate);
		weeklySalary = payRate * regularHours * 7;
		weeklySalary2 = weeklySalary + overtimePay;
		System.out.println("Your weekly salary with overtime is: $" + weeklySalary2);
		System.out.println("Your weekly salary without overtime is: $" + weeklySalary);
		System.out.println("Your overtime pay is: $" + overtimePay);
		
		
		
	}
	public static double computeOvertime(double regularHours, double overtimeHours, double payRate)
	{
		final double overtimePay;
		overtimePay = regularHours * payRate + overtimeHours * 1.5 * payRate;
		return overtimePay;
		
		
		
	}

}
