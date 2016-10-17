import world.Plant;
public class Willow extends Plant{
	public Willow(){
		
		//"name" is public -- accessible from anywhere
		this.name = "William";
		//"size" is protected -- even though "Willow" is in another package, because it is a subclass
		//of Plant ("extends Plant") we can access the protected variables from it
		this.size = "large";
		//"type" is private - only accessible from within the Plant class.
		this.type = "old plant";
	}
}