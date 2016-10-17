/*
 * A constructor is a method that is used upon object instantiation to set up initial values
 * for instance/field variables of that object.
 * Constructors have no return type and have the same name as the class.
 * 
 * Classes can have multiple constructors, however each constructor must have a unique argument
 * list or else the program will be unable to differentiate constructors when they are calls and
 * this will cause a compile-time error.
 * 
 * A constructor can call other constructors within the class by using the keyword "this" as this
 * indicates that a constructor within this instance is to be called.
 * Again, the program will be able to identify which constructor is being called due to the unique
 * parameters of that constructor.
 * 
 * If calling another constructor within a constructor, it must be called at the beginning of that
 * constructor.
 */

public class Application18 {
	
	public static void main(String[] args){
		Machine machine1 = new Machine();
	}
}

class Machine{
	private String name;
	private int code;
	
	//Here we see a constructor calling another constructor.
	public Machine(){
		this("Bertie", 4);
		System.out.println("Contstructor running.");
	}
	
	public Machine(String name){
		System.out.println("Constructor 2 running");
		this.name = name;
	}
	
	public Machine(String name, int code){
		System.out.println("Constructor 3 running");
		this.name = name;
		this.code = code;
	}
}