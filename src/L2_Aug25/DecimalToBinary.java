package L2_Aug25;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 25-Aug-2018
 */

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int power = 1;
		int binary = 0;

		while (n != 0) {

			int rem = n % 2;

			binary = binary + rem * power;
			power = power * 10;
			n = n / 2;
		}

		System.out.println(binary);

	}

}
