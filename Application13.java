/*
 * A class is a template for creating objects.
 * Classes can contain:
 * 
 * 1. Data
 * Data is information that defines that certain object.
 * For example: height, weight, age etc..
 * 
 * 2. Subroutines (methods)
 * A member of the class that performs a function.
 * The subroutine may (method) or may not (function) return a value.
 */
class Person{
	// Instance variables - must be declared in a class, but outside
	// a method, constructor or any block.
	String name;
	int age;
}


public class Application13 {
		public static void main(String[] args){
			
			// "Person" defines the type of variable being created.
			// "person1" is the name for the created variable.
			// "new Person()" indicates that a new person object will be created.
			Person person1 = new Person();
			person1.name = "Kevin";
			person1.age = 12;
			
			Person person2 = new Person();
			person2.name = "Chris";
			person2.age = 20;
		}
}
