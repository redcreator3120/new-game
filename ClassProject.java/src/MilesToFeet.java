import javax.swing.JOptionPane;
/*
 * Miles to feet computing
 * Written by Devin Tyler on 9/7/2018
*/
public class MilesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog(null, "Enter the amount of miles");
		int feet = 5280;
		double miles = Double.parseDouble(input);
		double feetFromMiles = feet*miles;
		JOptionPane.showMessageDialog(null, "Distance to uncles house \nMiles: " + input+"\nFeet: "+feetFromMiles);
	}

}
