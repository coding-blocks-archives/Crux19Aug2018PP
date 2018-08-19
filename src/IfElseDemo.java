
/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 19-Aug-2018
 */

public class IfElseDemo {

	public static void main(String[] args) {

		int marks = 20;

		if (marks > 80) {
			System.out.println("very good");
		} else if (marks > 50 || marks <= 80) {
			System.out.println("avg");
		} else {
			System.out.println("bad");
		}
		
		if(marks > 100 || marks <= 80) {
			System.out.println("hi");
		}

	}

}
