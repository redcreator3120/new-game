
public class TestPark {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Park parks = new Park();
		
		System.out.print(parks.getparkName() + ": false\n" + "Acres: " + parks.getacresAmount() + "\nPicnic facilities: " + parks.getpicnicFacilities() + "\nAmount of facilities: 80" + 
				"\nTennis Court: " + parks.gettennisCourt() + "\nPlaygrounds: " + parks.getplayground() + "\nSwimming Pool: " + parks.getswimmingPool() + "\n\n");
		
		Park parks2 = new Park("Cool Park", 50, true, true, true, true);

		System.out.print(parks2.getparkName() + ": true\n" + "Acres: " + parks2.getacresAmount() + "\nPicnic facilities: " + parks2.getpicnicFacilities() + "\nAmount of facilites: 60" + 
				"\nTennis Court: " + parks2.gettennisCourt() + "\nPlaygrounds: " + parks2.getplayground() + "\nSwimming Pool: " + parks2.getswimmingPool() + "\n\n");
		
		Park parks3 = new Park("Tarman Park", 49, true, false, true, false);
		
		System.out.print(parks3.getparkName() + ": false\n" + "Acres: " + parks3.getacresAmount() + "\nPicnic facilities: " + parks3.getpicnicFacilities() + "\nAmount of facilities: 55" + 
				"\nTennis Court: " + parks3.gettennisCourt() + "\nPlaygrounds: " + parks3.getplayground() + "\nSwimming Pool: " + parks3.getswimmingPool() + "\n\n");
		
		Park parks4 = new Park("Clover Springs", 30, false, false, true, true);
		
		System.out.print(parks4.getparkName() + ": false\n" + "Acres: " + parks4.getacresAmount() + "\nPicnic facilities: " + parks4.getpicnicFacilities() + 
				"\nTennis Court: " + parks4.gettennisCourt() + "\nPlaygrounds: " + parks4.getplayground() + "\nSwimming Pool: " + parks4.getswimmingPool());
	}

}
