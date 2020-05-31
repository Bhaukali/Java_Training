
public class Multidimensional_Arrays {

	public static void main(String[] args) {
		int[] values = { 3, 5, 6 };

		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);

		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("\n" + grid[0][1]);
		System.out.println(grid[1][2]);
		System.out.println("\n");

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + "\t");
			}
			System.out.println("\n");

		}

		String[][] word = new String[1][];

		word[0] = new String[4];

		word[0][1] = "My name is Jhoni";

		System.out.println(word[0][1]);

	}

}
