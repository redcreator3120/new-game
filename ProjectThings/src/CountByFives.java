
public class CountByFives {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final int START = 5;
		final int STOP = 200;
		final int NUMBER_PER_LINE = 50;
		for(int i = START; i <= STOP; i += START)
		{
			System.out.print(i + "  ");
			if(i % NUMBER_PER_LINE == 0)
				System.out.println();
		}
	}

}
