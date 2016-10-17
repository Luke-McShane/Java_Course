import ocean.creatures.Fish;
import ocean.creatures.Shark;
import ocean.plants.Seaweed;
/*
 * Import statements must always go at the beginning of a class.
 * Here we can see we import, for example, the "Fish" class from the "creatures"
 * sub-package which is imported from the "ocean" package.
 * We don't need to import the "Tutorial23" class as it is part of the default class.
 * To further understand importing, check the source folders for these packages in on
 * your computer, you will see that packages are simply folders that store other folders
 * (packages) and java files (classes).
 */

/*
 * Packages allow clearer program organisation and also prevent conflict between
 * class names (you cannot have 2 identical class names in the same package).
 */
 
public class Tutorial23 {
	public static void main(String[] args){
		Shark shark1 = new Shark();
		Fish fish1 = new Fish();
		Seaweed weed1 = new Seaweed();
		
		System.out.println(shark1);
		System.out.println(fish1);
		System.out.println(weed1);
	}
}
