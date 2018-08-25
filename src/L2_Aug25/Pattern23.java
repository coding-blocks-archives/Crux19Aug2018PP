package L2_Aug25;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 25-Aug-2018
 */

public class Pattern23 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		// int val = scn.nextInt();
		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		int val = 1;
		while (row <= n) {

			val = row;
			// spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			// stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val);

				if (cst <= nst / 2)
					val++;
				else
					val--;

				cst++;
			}

			// prep

			System.out.println();
			nst += 2;
			nsp--;
			row = row + 1;
		}

	}

}
