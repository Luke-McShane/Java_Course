import world.Plant;
import world.Rose;


//A "public" class can be accessed anywhere and there can only be one per file. Furthermore, the name
//of the public class must be the same of the file.
public class Application25 {
	public static void main(String[] args){
		Rose rose1 = new Rose();
		System.out.println(rose1.name);
		System.out.println(rose1.size);
		System.out.println(rose1.type);
		
		Plant willow = new Plant();
		System.out.println(willow.name);
		//Here this "size" variable is not accessible. This is because Application25 is not a subclass
		//of Plant nor is it in the same package
		System.out.println(willow.size);
		System.out.println(willow.type);
	}
}
