package ch6test;

public class Exercise6_20 {

	public static int[] shuffle(int[] original) {

		int temp;

		for (int i = 0; i < original.length; i++) {
			int cnt = (int)(Math.random() * original.length);

			temp = original[i];

			original[i] = original[cnt];
			original[cnt] = temp;

		}


		return original;
	}

	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
