
public class Park 
{
	String parkName;
	int acresAmount;
	boolean picnicFacilities;
	boolean tennisCourt;
	boolean playground;
	boolean swimmingPool;
	
	public Park()
	{
		parkName = "River Park";
		acresAmount = 68;
		picnicFacilities = true;
		tennisCourt = false;
		playground = true;
		swimmingPool = true;
	}
	public Park(String parkName, int acresAmount, boolean picnicFacilities, boolean tennisCourt, boolean playground, boolean swimmingPool)
	{
		this.parkName = parkName;
		this.acresAmount = acresAmount;
		this.picnicFacilities = picnicFacilities;
		this.tennisCourt = tennisCourt;
		this.playground = playground;
		this.swimmingPool = swimmingPool;
	}
	
	public String getparkName()
	{
		return parkName;
	}
	
	public int getacresAmount()
	{
		return acresAmount;
	}
	
	public boolean getpicnicFacilities()
	{
		return picnicFacilities;
	}
	
	public boolean gettennisCourt()
	{
		return tennisCourt;
	}
	
	public boolean getplayground()
	{
		return playground;
	}
	
	public boolean getswimmingPool()
	{
		return swimmingPool;
	}
	
}
