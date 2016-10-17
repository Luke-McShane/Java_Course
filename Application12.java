
public class Application12 {
	public static void main(String[] args){
		
		int[][] grid = {
				{1},
				{2, 3},
				{4, 5, 6},
				{7, 8, 9, 10}
		};
		// First define the "row", then the "column".
		System.out.println(grid[2][1]);
		
		String[][] texts = new String[2][3];
		texts[1][0] = "Hello";
		
		// Here we iterate through the array. We iterate through each
		// row and within each row we iterate through each element in
		// the columns within that row.
		for(int row=0; row<texts.length; row++){
			for(int column=0; column<texts[row].length; column++){
				System.out.print(texts[row][column] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		// Here we set up a new string array without defining the amount of
		// columns for each row. This is helpful if you want to have a different
		// amount of columns for each row; the user is able to define the amount
		// of columns, as seen below. The first row may contain 2 elements and
		// the second row may contain 3 elements. Of course, without defining any
		// of the elements, all will be set to null.
		String[][] words = new String[2][];
		words[0] = new String[2];
		words[1] = new String[3];
		
		for(int k=0; k<words.length; k++){
			for(int l=0; l<words[k].length; l++){
				System.out.print(words[k][l] + "\t");
			}
			System.out.println();
		}
	}
}
