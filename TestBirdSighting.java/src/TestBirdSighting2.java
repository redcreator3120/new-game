
public class TestBirdSighting2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		BirdSighting2 sighting = new BirdSighting2();
		
		System.out.println(sighting.getNumber() + " "+ sighting.getSpecies() + "(s) sighted on day " + sighting.getDay() + " of the year");
	
	
	//code to test constructor added for exercise 3b
	
	BirdSighting2 sighting2 = new BirdSighting2("cardinal", 3, 75);
	
	System.out.println(sighting2.getNumber() + " " + sighting2.getSpecies() + "(s) sighted on day " + sighting2.getDay() + " of the year");
	
	
	BirdSighting2 sighting3 = new BirdSighting2("tucan", 10, 5);
	
	System.out.println(sighting3.getNumber() + " "+ sighting3.getSpecies() + "(s) sighted on day " + sighting3.getDay() + " of the year");
		
	}

}
