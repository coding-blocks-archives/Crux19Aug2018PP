package L4_Sep2;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Sep-2018
 */

public class FunctionDemo {

	static int val = 100;

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("----------- Part-1 -----------");
		System.out.println("hello");
		addition();
		System.out.println("bye");
		subtraction();

		// int a = scn.nextInt();
		// int b = scn.nextInt();

		System.out.println("----------- Part-2 -----------");
		additionParams(6, 7);

		System.out.println("----------- Part-3 -----------");
		int c = additionParamsReturn(4, 5);
		System.out.println(c);

		System.out.println("----------- Part-4 -----------");
		System.out.println(val);
		int val = 200;
		System.out.println(val);
		System.out.println(FunctionDemo.val);

		additionParams(FunctionDemo.val, 10);
		System.out.println(FunctionDemo.val);

		System.out.println("----------- Part-5 -----------");
		int one = 10, two = 20;		
		System.out.println(one + ", " + two);
		Swap(one, two);
		System.out.println(one + ", " + two);
	}

	public static void Swap(int one, int two) {
		System.out.println(one + ", " + two);

		int temp = one;
		one = two;
		two = temp;

		System.out.println(one + ", " + two);
	}

	public static int additionParamsReturn(int a, int b) {

		int sum = a + b;
		return sum;
	}

	public static void additionParams(int a, int b) {

		int val = 500;
		FunctionDemo.val = 600;

		a = FunctionDemo.val;
		b = val;
		int sum = a + b;
		System.out.println(sum);
	}

	public static void addition() {

		int a = 2;
		int b = 3;

		int sum = a + b;

		subtraction();

		System.out.println(sum);

	}

	public static void subtraction() {

		int a = 8;
		int b = 2;

		int sub = a - b;

		System.out.println(sub);

	}

}
