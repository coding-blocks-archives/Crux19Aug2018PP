package L3_Sep1;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Sep-2018
 */

public class DataTypeDemo {

	public static void main(String[] args) {

		byte by = 10;
		short sh = 10;
		int in = 10;
		long lo = 10;

		// case 1
		// by = sh ;
		// by = in;
		// by = lo ;

		sh = by;
		// sh = in;
		// sh = lo ;

		in = by;
		in = sh;
		// in = lo ;

		lo = by;
		lo = sh;
		lo = in;

		// case 2
		by = 10;
		by = (byte) 576;

		System.out.println(by);

		by = (byte) 128;
		System.out.println(by);

		// case 3
		in = (int) 10000000000L;
		System.out.println(in);

		// case 4
		float fl = 5.5f;
		fl = (float) 5.5;

		double db = 4.5;

		// fl = db ;
		db = fl;

		// case 5
		in = (int) fl;
		System.out.println(in);

		fl = in;
		System.out.println(fl);

		// case 6

		boolean bl = true;

		// if(1) {
		//
		// }
		if (in > 4) {

		}

		if (bl == true) {

		}

		if (bl) {

		}
		// case 7
		char ch = 'a';
		// ch = 98;
		System.out.println((int) ch);

		// System.out.println(Math.pow(2, 16));
		// ch = 65535;

		ch = (char) (ch + 1);
		System.out.println(ch);

		in = ch + 1;

		System.out.println(in);

		// case 8
		System.out.println(10 + 20 + "Hello" + 10 + 20);
		System.out.println(2 + ' ' + 5);
		System.out.println(2 + " " + 5);
		System.out.println("Hello" + '\t' + "World");
		System.out.println("Hello" + "\t" + "World");

	}

}
