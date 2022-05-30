package ch2;

public class Unicode {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 65;
		char ch3 = '가';

		int code1 = (int)ch1;
		int code2 = (int)ch2;
		int code3 = (int)ch3;

		System.out.printf("ch1 : %c code1 : %d%n", ch1, code1);
		System.out.printf("ch2 : %c code2 : %d%n", ch2, code2);
		System.out.printf("ch3 : %c code3 : %d%n", ch3, code3);
	}
}
