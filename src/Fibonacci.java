import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 19-Aug-2018
 */

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);

		int count = 1;

		while (count <= n - 1) {

			int sum = a + b;
			a = b;
			b = sum;

			System.out.println(sum);

			count = count + 1;
		}

	}

}
