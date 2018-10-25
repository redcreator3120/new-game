import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/*
 * This is a program to change Fahrenheit to Celsius
 * Devin Tyler
 * 9/5/2018
 */
public class Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog(null, "Enter Fahrenheit");
		double fahrenheit = Double.parseDouble(input);
		double celsius;
		celsius= 5.0/9.0 *(fahrenheit -32);
		DecimalFormat pattern = new DecimalFormat("##0.00");
		JOptionPane.showMessageDialog(null, "Fahrenheit: "+ fahrenheit + "\nCelsius:" + pattern.format(celsius));
	}

}
