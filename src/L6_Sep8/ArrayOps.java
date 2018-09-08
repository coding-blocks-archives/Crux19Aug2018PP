package L6_Sep8;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @date Sep 8, 2018
 */

public class ArrayOps {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// int[][] arr = takeInput();
		// int[][] array = { { 10, 20, 30, 40, 50 }, { 60, 70, 80, 90, 100 }, { 110,
		// 120, 130, 140, 150 },
		// { 160, 170, 180, 190, 200 } };
		// display(arr);
		// verticaldisplay(array);
		// wavedisplay(array);
		// spiralDisplay(array);
		int[][] one = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] two = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		display(matrixMultiplication(one, two));
	
	}

	public static int[][] takeInput() {

		System.out.println("Rows ?");
		int rows = scn.nextInt();

		int[][] arr = new int[rows][];

		for (int row = 0; row < arr.length; row++) {

			System.out.println("Cols for " + row + " ?");
			int cols = scn.nextInt();

			arr[row] = new int[cols];

			// update
			for (int col = 0; col < arr[row].length; col++) {

				System.out.println("[" + row + "-" + col + "]");
				arr[row][col] = scn.nextInt();
			}

		}

		return arr;

	}

	public static void display(int[][] arr) {

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {

				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

	}

	public static void verticaldisplay(int[][] arr) {

		for (int col = 0; col < arr[0].length; col++) {

			for (int row = 0; row < arr.length; row++) {

				System.out.print(arr[row][col] + " ");
			}

		}

		System.out.println();
	}

	public static void wavedisplay(int[][] arr) {

		for (int col = 0; col < arr[0].length; col++) {

			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}
			} else {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + " ");
				}
			}

		}

		System.out.println();
	}

	public static void spiralDisplay(int[][] arr) {

		int minRow = 0;
		int maxRow = arr.length - 1;
		int minCol = 0;
		int maxCol = arr[0].length - 1;
		int count = 0;
		int nel = arr.length * arr[0].length;

		while (count < nel) {
			for (int row = minRow; count < nel && row <= maxRow; row++) {
				System.out.print(arr[row][minCol] + " ");
				count++;
			}
			minCol++;

			for (int col = minCol; count < nel && col <= maxCol; col++) {
				System.out.print(arr[maxRow][col] + " ");
				count++;
			}
			maxRow--;

			for (int row = maxRow; count < nel && row >= minRow; row--) {
				System.out.print(arr[row][maxCol] + " ");
				count++;
			}
			maxCol--;

			for (int col = maxCol; count < nel && col >= minCol; col--) {
				System.out.print(arr[minRow][col] + " ");
				count++;
			}
			minRow++;
		}
	}

	public static int[][] matrixMultiplication(int[][] one, int[][] two) {

		int r1 = one.length;
		int c1 = one[0].length;

		int r2 = two.length;
		int c2 = two[0].length;

		if (c1 != r2) {
			return null;
		}

		int[][] res = new int[r1][c2];

		for (int row = 0; row < res.length; row++) {

			for (int col = 0; col < res[0].length; col++) {

				int sum = 0;
				for (int k = 0; k < c1; k++) {
					sum += one[row][k] * two[k][col];
				}

				res[row][col] = sum;
			}
		}

		return res;

	}

}
