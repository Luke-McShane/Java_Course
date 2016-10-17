/*
 * Encapsulation is about protecting data and keeping it within the class.
 * It's about "encapsulating" it from the consumer as there is a lot of data within a program
 * that a user does not need access to.
 * It is best practise to make everything private or protected that doesn't need to be directly
 * accessed by a user, and making things protected only when necessary.
 * The API is the Application Programming Interface, and it is what the user has access to.
 * The only variables the user should have access to are constants. Remember these are "final".
 * Private methods are used by other methods to perform some function. For example the private
 * method "calculateData()" is used by "getData()" and would never have to be accessed by the user.
 */

public class Tutorial27 {
	public static void main(String[] args){
		Plant plant = new Plant();
		
		System.out.println(plant.getData());
		System.out.println(plant.ID);
	}
}

class Plant{
	public static final int ID = 2;
	private String name;
	
	public String getData(){
		int getNumber = calculateData();
		String data = "The data is: " + getNumber;
		return data;
	}
	
	private int calculateData(){
		return 2+12;
	}
	
	public void setName (String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
