import javax.swing.JOptionPane;
import java.text.NumberFormat;

/* Computing tip amount
 * written by Devin Tyler on 9/6/2018 */


public class TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input = JOptionPane.showInputDialog(null, "Enter the total bill");
double bill = Double.parseDouble(input);
input = JOptionPane.showInputDialog(null,"Enter the tip percentage as a decimal" +"(Example: 10% would be 0.1)");
double percentage = Double.parseDouble(input);
double tipAmount = bill*percentage;
NumberFormat dollars = NumberFormat.getCurrencyInstance();
JOptionPane.showMessageDialog(null, "Bill amount:" + dollars.format(bill) + "\nTip percentage:"+percentage+"\nTip:"+ dollars.format(tipAmount));


	}

}
