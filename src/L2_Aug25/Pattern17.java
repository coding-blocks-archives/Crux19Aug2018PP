package L2_Aug25;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 25-Aug-2018
 */

public class Pattern17 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = n / 2;
		int nsp = 1;
		int row = 1;
		while (row <= n) {

			// stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			// spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			// stars
			cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			// prep
			System.out.println();
			if (row <= n/2) {
				nst = nst - 1;
				nsp = nsp + 2;
			} else {
				nst = nst + 1;
				nsp = nsp - 2;
			}
			row = row + 1;
		}

	}

}
