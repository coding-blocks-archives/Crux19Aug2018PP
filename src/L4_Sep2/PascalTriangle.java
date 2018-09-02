package L4_Sep2;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Sep-2018
 */

public class PascalTriangle {

	public static void main(String[] args) {

		int n = 5;

		int val;

		int row = 0;
		while (row <= n - 1) {

			val = 1;
			for (int col = 0; col <= row; col++) {
				System.out.print(val);
				val = (val * (row - col)) / (col + 1);
			}

			System.out.println();
			row++;
		}

	}

}
