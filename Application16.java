
public class Application16 {
	/*
	 * "static" means that there is only one instance of that variable/object/method that is shared
	 * among all instances of the class - this means the variable/object/method belongs to the class,
	 * not the instance of that class.
	 * 
	 * A static method can only access static data. It cannot access non-static data (instance variables).
	 * A static method call only other static methods, they cannot call non-static methods directly
	 * as these are unique to the instance of that class. However, a static method (class method) can
	 * access non-static data by referring to the instance of that class. E.g. ClassName.variableName
	 * or ClassName.methodName. Of course, an instance of that class must first be created.
	 * A non-static method can access static methods and static variables.
	 */
	
	String[] names = {"Ben", "Stacey", "Michael", "Jonathan", "Lucy", "Peter", "Michelle"};
	String[] directions = {"North", "South", "East", "West"};
	int[] speeds = {13, 21, 55, 3, 64};
	String[] People = new String[3];
	
	public static void main(String[] args){
		System.out.println("Creating 3 people..");
		Application16 run = new Application16();
		run.createPeople();
	}
	
	public void createPeople(){
		Person newPerson = new Person();
		for(int i=0; i<3; i++){
			People[i]= names[randomNum(0, 7)];
			newPerson.name(People[i]);
			newPerson.velocity(directions[randomNum(0, 4)], speeds[randomNum(0, 5)]);
		}
	}
	 public int randomNum(int lowerBound, int upperBound){
		return (int )(Math.random() * upperBound + lowerBound);
	}
	
	
}

class Person{
	
	public void name(String myName){
		System.out.println("Hello, my name is " + myName + ".");
	}
	
	public void velocity(String direction, double speed){
		System.out.printf("I am currently headed %s at %.2f mph (%.2f kmh).%n%n", direction, speed, kilometresPerHour(speed));
	}
	
	public double kilometresPerHour(double convertMe){
		return convertMe*1.61;
	}
}
