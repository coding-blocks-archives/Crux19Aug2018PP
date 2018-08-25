package L2_Aug25;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 25-Aug-2018
 */

public class Pattern14 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		while (row <= 2 * n - 1) {

			// spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			// stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			// prep
			System.out.println();
			if (row <= n - 1) {
				nst = nst + 1;
				nsp = nsp - 1;
			} else {
				nst = nst - 1;
				nsp = nsp + 1;
			}
			row = row + 1;
		}

	}

}
