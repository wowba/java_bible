package ch6test;

public class Exercise6_6 {
	// 두 점간 거리 구하기
	static double getDistance(int x, int y, int x1, int y1) {

		double row = Math.pow((x1 - x), 2);
		double col = Math.pow((y1 - y), 2);

		return Math.sqrt(row + col);
	}

	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}
}
