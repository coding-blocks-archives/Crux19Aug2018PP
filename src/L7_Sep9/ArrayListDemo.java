package L7_Sep9;

import java.util.ArrayList;

/**
 * @author Garima Chhikara
 * @date Sep 9, 2018
 */

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		System.out.println(list);
		System.out.println(list.size());

		// add at last
		list.add(10);
		System.out.println(list);
		list.add(20);
		System.out.println(list);
		list.add(30);
		list.add(40);
		System.out.println(list);

		System.out.println(list.size());

		// get
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// set (update)
		list.set(2, 100);
		System.out.println(list);

		// add at index
		list.add(list.size(), 500);
		System.out.println(list);
		list.add(0, 90);
		System.out.println(list);

		// remove
		list.remove(list.size() - 1);
		System.out.println(list);

		// print list using for loop
		System.out.println("-- For Loop --");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// print list using enhanced loop
		System.out.println("-- Enhanced Loop --");
		for (int val : list) {
			System.out.println(val);
		}
	}

}
