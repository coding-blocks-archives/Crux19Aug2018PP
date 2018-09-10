package L7_Sep9;

/**
 * @author Garima Chhikara
 * @date Sep 9, 2018
 */

public class StringDemo {

	public static void main(String[] args) {

		String str = "hello";
		System.out.println(str.length());
		System.out.println(str);

		// charAt
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(1));

		System.out.println(str.charAt(str.length() - 1));

		// substring
		str = "coding";
		System.out.println(str.substring(1, 4)); // odi
		System.out.println(str.substring(0, 5)); // codin
		System.out.println(str.substring(0, 6)); // coding
		System.out.println(str.substring(2, 2)); // blank string
		// System.out.println(str.substring(3, 2)); // error

		System.out.println(str.substring(1)); // 1 to end

		// concatenate
		String s1 = "hi";
		String s2 = "bye";
		String s3 = s1 + s2;
		System.out.println(s1 + ", " + s2 + ", " + s3);
		String s4 = s1.concat(s2);
		System.out.println(s1 + ", " + s2 + ", " + s4);

		// indexOf
		str = "hello";
		System.out.println(str.indexOf("lo"));
		System.out.println(str.indexOf("eL"));

		// startsWith
		System.out.println(str.startsWith("He"));
		System.out.println(str.startsWith("he"));

		// equals and ==
		s1 = "Hello";
		s2 = s1;
		s3 = "Hello";
		s4 = new String("Hello");

		System.out.println((s1 == s2) + ", " + s1.equals(s2)); // true true
		System.out.println((s1 == s3) + ", " + s1.equals(s3)); // true true
		System.out.println((s1 == s4) + ", " + s1.equals(s4)); // false true

		str = str.replace("l", "g");
		System.out.println(str);

	}

}
