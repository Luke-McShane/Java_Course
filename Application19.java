/*
 * A static variable belongs to the class whereas an instance variable belongs to
 * the instance of that class. Note how we set each variable.
 * 
 * Static methods cannot access non-static fields (variables) or methods because they
 * belong to instances of the class and how can the class method know about a particular
 * object when no objects have yet been created? The static variables/methods are created
 * before any classes are, hence why a static variable/method cannot access anything non-static.
 * 
 * Of course the instance methods can access static data as they already exist.
 * 
 * A method could be made static if it only deals with static variables as you would only need
 * non-static methods if dealing with any instance variables.
 */

public class Application19 {
	public static void main(String[] args){
		
		//"Thing." indicates we are accessing a variable belonging to a class - a
		//static variable
		//Here we access a static method.
		
		//"thing1." indicates we are accessing a variable belonging to an object/
		//instance of the class - an instance/non-static variable
		System.out.println("Before creating objects: " + Thing.getCount());
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		System.out.println("After creating objects: " + Thing.getCount());
		//Note how the first time we print count we get 0, but the second time we print
		//it we get 2. This is because the constructor has been called twice as two instances
		//have been created.
		
		thing1.setName("Bob");
		thing2.setName("Sue");
		
		System.out.println(Thing.LUCKY_NUMBER);
		
		System.out.printf("Object ID: %d%nDescription: %s%nName: %s%nLucky Number: %d%n%n", thing1.objectID, Thing.getDescription(), thing1.getName(), Thing.LUCKY_NUMBER);
		System.out.printf("Object ID: %d%nDescription: %s%nName: %s%nLucky Number: %d%n%n", thing2.objectID, Thing.getDescription(), thing2.getName(), Thing.LUCKY_NUMBER);
	}
}

class Thing{
	//Here we have a "constant".
	//A constant is a static variable that cannot be changed.
	//This is indicated by "final" as it is the final time the variable may be reassigned.
	public final static int LUCKY_NUMBER = 8;
	
	private String name;
	private static String description = "I am a thing";
	private static int count = 0;
	
	//Here we create an object ID.
	//In the constructor this ID is set to count, meaning each object will have its own unique ID.
	public int objectID;
	
	//Here out constructor increments the class variable count by one.
	//This is useful because we can track how many instances of Thing since this constructor
	//is called at every instantiation of Thing.
	public Thing(){
		objectID = count;
		count++;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public static String getDescription(){
		 return description;
	}
	
	public String getName(){
		return name;	
	}
	
	public static int getCount(){
		return count;
	}
}