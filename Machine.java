
public class Machine implements Info {
	
	private int id;
	
	public Machine(int id){
		this.id = id;
	}
	
	
	
	public void mechanicalAwakening(){
		System.out.println("Oh God, I'm all metal.");
	}

	
	@Override
	public void greetUser() {
		System.out.println("Hello user, I am a machine.");
		
	}

	@Override
	public void showInfo() {
		System.out.println("My Id: " + id + ".\n");
		
	}
}
