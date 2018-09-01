package L3_Sep1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Sep-2018
 */

public class Inverse {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int count = 1;
		int ans = 0;

		while (num != 0) {

			int rem = num % 10;

			ans = ans + count * (int) Math.pow(10, rem - 1);
			count++;
			num = num / 10;
		}

		System.out.println(ans);
	}

}
