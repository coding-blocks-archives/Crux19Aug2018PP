package L6_Sep8;

/**
 * @author Garima Chhikara
 * @date Sep 8, 2018
 */

public class Array2DDemo {

	public static void main(String[] args) {

		int[][] arr = new int[3][4];
		System.out.println(arr);

		// rows
		System.out.println(arr.length);
		// cols
		System.out.println(arr[0].length);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		// System.out.println(arr[3]);

		arr[1][3] = 20;
		System.out.println(arr[1][3]);

		// jagged array
		int[][] jarr = new int[3][];
		System.out.println(jarr);

		System.out.println(jarr[0]);
		System.out.println(jarr[1]);
		System.out.println(jarr[2]);
		
		System.out.println(jarr.length);
		
		jarr[0] = new int[5] ;
		jarr[1] = new int[2] ;
		jarr[2] = new int[4] ;
		
		System.out.println(jarr[0]);
		System.out.println(jarr[1]);
		System.out.println(jarr[2]);
		
		System.out.println(jarr[2].length);

		System.out.println(jarr[0][2]);
	}

}
