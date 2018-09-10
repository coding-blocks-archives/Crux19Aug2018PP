package L7_Sep9;

import java.util.ArrayList;

/**
 * @author Garima Chhikara
 * @date Sep 9, 2018
 */

public class ArrayListOps {

	public static void main(String[] args) {
		// int[] one = { 10, 10, 10, 30, 40, 50, 60, 60 };
		// int[] two = { 10, 10, 60, 60, 60, 70, 80 };

		// System.out.println(intersection(one, two));

		// int[] one = { 30 };
		// int[] two = { 30, 30 };
		// System.out.println(intersectionTwoLoops(one, two));

		int[] one = { 9, 9, 3, 4, 6 };
		int[] two = { 9, 9, 9 };

		System.out.println(addition(one, two));
	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {

		ArrayList<Integer> ans = new ArrayList<>();

		int i = 0;
		int j = 0;

		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {
				i++;
			} else if (one[i] > two[j]) {
				j++;
			} else {
				ans.add(one[i]);
				i++;
				j++;
			}

		}

		return ans;
	}

	public static ArrayList<Integer> intersectionTwoLoops(int[] one, int[] two) {

		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < one.length; i++) {
			for (int j = 0; j < two.length; j++) {

				if (one[i] == two[j]) {
					ans.add(one[i]);
					two[j] = Integer.MAX_VALUE;
					break;
				}
			}
		}

		return ans;

	}

	public static ArrayList<Integer> addition(int[] one, int[] two) {

		ArrayList<Integer> ans = new ArrayList<>();

		int i = one.length - 1;
		int j = two.length - 1;

		int carry = 0;

		while (i >= 0 || j >= 0) {

			int sum = carry;

			if (i >= 0) {
				sum += one[i];
			}

			if (j >= 0) {
				sum += two[j];
			}

			int rem = sum % 10;
			carry = sum / 10;

			ans.add(0, rem);
			i--;
			j--;

		}

		if (carry != 0) {
			ans.add(0, carry);
		}

		return ans;
	}

}
