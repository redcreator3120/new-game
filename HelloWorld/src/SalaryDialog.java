import javax.swing.JOptionPane;
public class SalaryDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wageString, dependentsString;
		double wage, weeklyPay;
		int dependents;
		final double HOURS_IN_WEEK = 37.5;
		wageString = JOptionPane.showInputDialog(null,"Enter emplyoee's hourly wage", "Salary dialog 1", JOptionPane.INFORMATION_MESSAGE);
		weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
		dependentsString = JOptionPane.showInputDialog(null, "How may dependents?", "Salary dialog 2", JOptionPane.QUESTION_MESSAGE);
		dependents = Integer.parseInt(dependentsString);
		JOptionPane.showMessageDialog(null,  "weekly salary is $" + weeklyPay + "\nDeductions will be made for " + dependents + " dependents");
	}

}
