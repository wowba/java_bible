package ch6;

public class MyMathTest {
	public static void main(String[] args) {

		MyMath mm = new MyMath();
		System.out.println(mm.add(3, 5));
		System.out.println(mm.subtract(3, 2));
		System.out.println(mm.multiply(4, 3));
		System.out.println(mm.divide(5, 3));
	}
}

class MyMath {
	long add(long a, long b) {
		return a + b;
	}

	long subtract(long a, long b) {
		return a - b;
	}

	long multiply(long a, long b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}
}
