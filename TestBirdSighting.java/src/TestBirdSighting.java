public class TestBirdSighting
{
	
	public static void main(String[] args) 
	{
		BirdSighting sighting = new BirdSighting();
		
		System.out.println(sighting.getNumber() + " "+ sighting.getSpecies() + "(s) sighted on day " + sighting.getDay() + " of the year");
	
	
	//code to test constructor added for exercise 3b
	
	BirdSighting sighting2 = new BirdSighting("cardinal", 3, 75);
	
	System.out.println(sighting2.getNumber() + " " + sighting2.getSpecies() + "(s) sighted on day " + sighting2.getDay() + " of the year");
	
	
	BirdSighting sighting3 = new BirdSighting("Kiwi", 57, 5);
	
	System.out.println(sighting3.getNumber() + " "+ sighting3.getSpecies() + "(s) sighted on day " + sighting3.getDay() + " of the year");
	}
	
	
	
	
}