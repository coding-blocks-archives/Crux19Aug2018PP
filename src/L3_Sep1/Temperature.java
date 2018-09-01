package L3_Sep1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Sep-2018
 */

public class Temperature {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int minF = scn.nextInt();
		int maxF = scn.nextInt();
		int step = scn.nextInt();

		for (int i = minF; i <= maxF; i = i + step) {

			int c = (int) ((5.0 / 9) * (i - 32));

			System.out.println(i + "\t" + c);

		}

		char ch = scn.next().charAt(0);

		System.out.println(ch);
	}

}









