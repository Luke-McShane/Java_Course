/*
 * Polymorphism is the ability of an object to take many forms.
 * Below we see "tree2" taking the form of the Tree() object even though the reference type
 * is Plant.
 */
public class Application26 {
	public static void main(String[] args){
		
		Plant plant1 = new Plant();
		plant1.grow();
		
		Tree tree1 = new Tree();
		tree1.grow();
		tree1.shedLeaves();
		
		//Here the reference type is Plant so it only has access to methods contained within the
		//Plant class. The type however is tree, so any methods call will be done so through the Tree class.
		Plant tree2 = new Tree();
		tree2.grow();
		
		//Here we pass two different objects through a method, this works because tree2 is a subclass of
		//the Plant super-class and the output is different for these two statements because the Tree class
		//contains a grow() method that overrides the grow() method in the Plant class.
		growPlant(plant1);
		growPlant(tree2);
		
	}
	
	public static void growPlant(Plant plant){
		plant.grow();
	}
}
