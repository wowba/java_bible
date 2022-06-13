package ch5;

public class ArrayEx7 {
	public static void main(String[] args) {
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = i;
			System.out.println(num[i]);
		}
		for (int i = 0; i < 100; i++) {
			int n = (int)(Math.random() * 10);
			int tmp = num[0];
			num[0] = num[n];
			num[n] = tmp;
		}

		for (int key : num) {
			System.out.print(key);
		}
	}
}
