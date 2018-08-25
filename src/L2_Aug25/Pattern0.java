package L2_Aug25;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 25-Aug-2018
 */

public class Pattern0 {

	public static void main(String[] args) {

		int n = 6;
		int row = 1;

		// no of rows
		while (row <= n) {

			// work to be done in every row
			int col = 1;

			while (col <= n) {
				System.out.print("*");
				col = col + 1;
			}

			// prep
			System.out.println();
			row = row + 1;
		}
	}

}
