package ch5;

public class ArrayEx14 {
	public static void main(String[] args) {
		String src = "ABDCE";

		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.chatAt("+i+"): " + ch);
		}

		char[] chArr = src.toCharArray();

		System.out.println(chArr);
	}
}
