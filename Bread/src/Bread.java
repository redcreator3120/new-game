
public class Bread  {
	String breadType;
	final static String MOTTO = "\"The bread of God\"";
	int calories;

	public Bread() {
	this("Pumpernickle", 75, "The bread of God");}
	public Bread(String breadType, int calories, String MOTTO) {
		this.breadType = breadType;
		this.calories = calories;
}
	public String getbreadType() {
		return breadType;
}
	public final String getMOTTO() {
		return MOTTO;
	
}
		public int getCalories() {
			return calories;
		}
		}