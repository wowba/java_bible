package ch6test;

public class Exercise6_7 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);

		System.out.println(p.getDistance(2,2));
	}
}

class MyPoint {

	int x;

	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 거리 구하는 코드 작성
	public double getDistance(int x1, int y1) {
		double row = Math.pow((x1 - x), 2);
		double col = Math.pow((y1 - y), 2);

		return Math.sqrt(row + col);
	}
}
