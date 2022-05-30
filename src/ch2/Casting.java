package ch2;

public class Casting {
	public static void main(String[] args) {

		double d = 85.4;
		int score = (int)d; // (타입)피연산자

		/*
		형변환의 대상이 되는 원본은 영향받지 않는다.
		 */

		System.out.println(score); // 85
		System.out.println(d); // 85.4
	}
}
