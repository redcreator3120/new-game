import javax.swing.JOptionPane;
public class EvenEntryLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		String entry, message = null;
		final int QUIT = 999;
		entry = JOptionPane.showInputDialog(null,
				"Enter an even number or " + QUIT + " to quit");
		number = Integer.parseInt(entry);
		while(number != QUIT)
		{
			if(number % 2 == 0)
				message = "Good job!";
			else
				message = number + " is not an even number";
				JOptionPane.showMessageDialog(null, message);
				entry = JOptionPane.showInputDialog(null, "Enter an even number or " + QUIT + " to quit");
			number = Integer.parseInt(entry);
		}
	}

}
