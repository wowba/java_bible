package ch5;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		// int[] arr3 = new int[] {100, 95, 80, 70, 60};
		int[] arr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd', 'e'};

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i + 1;
		}

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (int)(Math.random() * 10) + 1;
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + ",");
		}

		System.out.println(arr3); // 참조 주소를 반환한다. 값을 출력하려면 toString 메서드를 사용해야 한다.
		System.out.println(chArr);

	}
}
