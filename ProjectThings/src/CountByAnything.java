import javax.swing.JOptionPane;
public class CountByAnything {

	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog(null, "Enter the amount you wish to count by: ");
		@SuppressWarnings("unused")
		final int START = 5;
		double COUNT = Double.parseDouble(input);
		final int STOP = 200;
		final double NUMBER_PER_LINE = COUNT * 10;
		for(double i = COUNT; i <= STOP; i += COUNT)
		{
			System.out.print(i + "  ");
			if(i % NUMBER_PER_LINE == 0)
				System.out.println();
		}
	}

}
