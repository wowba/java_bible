package ch5;

public class ArrayEx12 {
	public static void main(String[] args) {
		String[] names = {"kim", "Park", "Yi"};

		for (int i = 0; i < names.length; i++) {
			System.out.println("naems["+i+"]: " + names[i]);
		}

		String tmp = names[2];
		System.out.println("tmp: " + tmp);
		names[0] = "Yu";

		for (String str : names) {
			System.out.println(str);
		}
	}
}
