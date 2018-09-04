package L4_Sep2;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Sep-2018
 */

public class ArrayOps {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// int[] arr = takeInput();
		// int[] arr = { 10, 20, 30, 40, 50, 60 };
		// int[] arr = { 2, 3, 0, 4, 1 };
		// display(arr);

		// System.out.println(max(arr));
		// System.out.println(linearSearch(arr, 50));
		// System.out.println(binarySearch(arr, 50));

		// reverse(arr);
		// display(arr);

		// int[] inv = inverse(arr);
		// int[] rotated = rotate(arr, -7);
		// display(rotated);

		int[] arr = { 50, 30, 40, 20, 60 };

		// bubbleSort(arr);
		// selectionSort(arr);
		insertionSort(arr);

		display(arr);
	}

	public static int[] takeInput() {

		System.out.println("Size ?");
		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;

	}

	public static void display(int[] arr) {

		System.out.println("-------------");
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
		System.out.println("-------------");

	}

	public static int max(int[] array) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}
		}

		// for (int val : arr) {
		// if (val > max) {
		// max = val;
		// }
		// }

		return max;
	}

	public static int linearSearch(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == item) {
				return i;
			}
		}

		return -1;
	}

	public static int binarySearch(int[] arr, int item) {

		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (arr[mid] > item) { // lower half
				hi = mid - 1;
			} else if (arr[mid] < item) { // upper half
				lo = mid + 1;
			} else {
				return mid;
			}

		}

		return -1;

	}

	public static void reverse(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			// update
			left++;
			right--;

		}

	}

	public static int[] inverse(int[] arr) {

		int[] inv = new int[arr.length];

		for (int i = 0; i < inv.length; i++) {

			inv[arr[i]] = i;
		}

		return inv;

	}

	public static int[] rotate(int[] arr, int r) {

		r = r % arr.length;

		if (r < 0) {
			r = r + arr.length;
		}

		int[] ans = new int[arr.length];

		for (int i = 0; i < ans.length; i++) {

			if (i < r) {
				ans[i] = arr[i + arr.length - r];
			} else {
				ans[i] = arr[i - r];
			}

		}

		return ans;

	}

	public static void bubbleSort(int[] arr) {

		int n = arr.length;

		for (int counter = 0; counter < n - 1; counter++) {

			System.out.println("Counter " + counter);
			for (int j = 0; j < n - counter - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

				System.out.println("J : " + j);
				display(arr);
			}

			System.out.println();

		}

	}

	public static void selectionSort(int[] arr) {

		int n = arr.length;
		for (int counter = 0; counter < n - 1; counter++) {

			int min = counter;

			for (int j = counter + 1; j < n; j++) {

				if (arr[j] < arr[min]) {
					min = j;
				}

			}

			// swap
			int temp = arr[min];
			arr[min] = arr[counter];
			arr[counter] = temp;

		}

	}

	public static void insertionSort(int[] arr) {

		int n = arr.length;
		for (int counter = 1; counter < n; counter++) {

			int item = arr[counter];

			int j = counter - 1;

			while (j >= 0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = item;
		}

	}

}
