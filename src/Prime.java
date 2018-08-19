import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 19-Aug-2018
 */

public class Prime {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int div = 2;

		int flag = 0;

		while (div <= n - 1) {

			if (n % div == 0) {
				flag = 1;
			}

			div = div + 1;
		}

		if (flag == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}

}
