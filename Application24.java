/*
 * An interface acts as a formal contract between the class and the methods it must provide. 
 * An interface contains all the methods the class MUST have so the program is able to compile.
 * You can create a variable to be of interface type while still pointing to an object, however
 * this variable will only have access to methods contained within the interface, but of course
 * they will be in the class as well since this is the interfaces purpose.
 * 
 * A class can extend another (only one) class but can implement any amount of interfaces.
 * An interface can only extend another interface, not implement one.
 * Interfaces allow polymorphism/type substitution to occur. This means that we can pass different
 * objects through the same method as long as they both implement the same interface. The method
 * must therefore only use methods from that interface, as we know for sure that the objects being
 * passed through will use these methods.
 * 
 * Variables can also be used in an interface; they are automatically assigned to be public, static
 * and final and must always be initialised.
 */
public class Application24 {
	public static void main(String[] args){
		
		Person person1 = new Person("Roger");
		person1.jump();
		person1.greetUser();
		person1.showInfo();
		
		Machine mach1 = new Machine(12);
		mach1.mechanicalAwakening();
		mach1.greetUser();
		mach1.showInfo();
		
		outputInfoMethods(person1);
		outputInfoMethods(mach1);
		
		outputInfoMethods(new Person("Bill"));
		outputInfoMethods(new Machine(29));
		}
	
	private static void outputInfoMethods(Info info){
		info.greetUser();
		info.showInfo();
	}
}
