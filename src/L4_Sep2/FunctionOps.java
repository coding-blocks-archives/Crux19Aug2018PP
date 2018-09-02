package L4_Sep2;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Sep-2018
 */

public class FunctionOps {

	public static void main(String[] args) {

		printAllArmstrong(0, 1000);
	}

	public static void printAllArmstrong(int ll, int ul) {

		for (int i = ll; i <= ul; i++) {

			int digits = numberOfDigits(i);
			if (isArmstrong(i, digits) == true) {
				System.out.println(i);
			}
		}
	}

	public static int numberOfDigits(int num) {

		int count = 0;

		while (num != 0) {
			count++;
			num = num / 10;
		}

		return count;

	}

	public static boolean isArmstrong(int num, int nod) {

		int ans = 0;

		int onum = num;

		while (num != 0) {

			int rem = num % 10;
			ans = ans + (int) Math.pow(rem, nod);
			num = num / 10;
		}

		if (ans == onum) {
			return true;
		} else {
			return false;
		}
	}

}
