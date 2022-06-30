package ch7;

public class StaticTest {
	static int width = 200;
	static int height = 120;

	static int max(int a, int b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		StaticTest s = new StaticTest();

		System.out.println(s.max(1, 2));
	}
}
