
public class Person implements Info {
	
	private String name;
	
	public Person(String name){
		this.name = name;
	}
	
	
	
	public void jump(){
		System.out.println("Wow I'm jumping.");
	}
	
	

	@Override
	public void greetUser() {
		System.out.println("Hello user, I am a person.");
		
	}

	@Override
	public void showInfo() {
		System.out.println("My name: " + name + ".\n");
	}
}
