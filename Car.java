/*
 * Here we create the new class Car. Car is it's own class but it also inherits all fields
 * and methods from it's parents. The parent class here is Machine, indicated by the "extends"
 * keywords as Car "extends" from Machine - it inherits from it's parent class.
 * 
 * We also look at overriding methods here.
 * We can call a public/protected method/field from the parent class through Car but we can also
 * override and change what that method does.
 * Here we see that we have altered the inherited "start()" method my making it output "Car is
 * starting" instead of "Machine is starting.".
 * However, when the "stop" method is from car1 in the main() method in class Application22, the
 * output is "machine is stopping." because that method has not been overrode and the output is
 * therefore that of the parent (Machine) class.
 */
public class Car extends Machine {
	
	//The "@" followed by the class "Override" ensure that any code underneath is a overriding
	//method, if not, an error/warning will occur. Treat this as a security measure so you know
	//that what you code is an overriding method as you could easily misspell the method name.
	@Override
	public void start(){
		System.out.println("Car is starting.");
	}
	
	public void brake(){
		System.out.println("Car is braking");
	}
	
	public void showInfo(){
		System.out.println(info);
	}
}
