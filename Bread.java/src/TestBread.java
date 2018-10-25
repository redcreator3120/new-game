
public class TestBread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bread type = new Bread();
		System.out.println( "Type of bread: " + type.getbreadType() + " \nCalories: " + type.getCalories()+ " \nMotto: " + type.getMOTTO());
		
		
		Bread type2 = new Bread("wheat", 69, "The staff of life");
		System.out.println("\nType of bread: " + type2.getbreadType() + " \nCalories: " + type2.getCalories() + " \nMotto: " + type2.getMOTTO());
		
		
		Bread type3 = new Bread("white", 79, "The staff of life");
		System.out.println("\nType of bread: " + type3.getbreadType() + " \nCalories: " + type3.getCalories() + " \nMotto: " + type3.getMOTTO());
	}

}
