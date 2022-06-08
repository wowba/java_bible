package ch4;

import java.time.LocalDateTime;

public class Test {

	public static void main(String[] args) {
		test4_1();

		test4_2();

		test4_3();

		test4_4();
	}

	public static void test4_1() {
		System.out.println("4 - 1 / 다음 문장 조건식으로 표현하기" + "\n");
		int x = 15;
		boolean result1 = 10 < x && x < 20;

		char ch = 'x';
		boolean result2 = ch != ' ' || ch != '	';

		boolean result3 = ch == 'x' || ch == 'X';

		boolean result4 = '0' <= ch && ch <= '9';

		boolean result5 = 'a' <= ch && ch <= 'Z';

		int year = LocalDateTime.now().getYear();
		boolean result6 = year / 400 == 0 || year / 4 == 0 && year / 100 != 0;

		boolean powerOn = true;
		boolean result7 = !powerOn;

		String str = "yes";
		boolean result8 = str.equals("yes");
	}

	public static void test4_2() {
		System.out.println("4 - 2 / 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오");
		int answer = 0;

		for(int i = 1; i < 21; i++ ) {
			if (i % 2 == 0 || i % 3 == 0)
			{
				continue;
			}
			answer += i;
		}
		System.out.println(answer + "\n");
	}

	public static void test4_3() {
		System.out.println("4 - 3 / 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오 ");

		int answer = 0;
		for(int i = 1; i < 11 ; i++) {
			for(int j = 1; j <= i ; j++) {
				answer += j;
			}
		}
		System.out.println(answer + "\n");

	}
	public static void test4_4() {
		System.out.println("1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100 이상이 되는지 구하시오");
		int sum = 0;
		int currentNum = 1;
		while (sum < 100) {
			if (currentNum % 2 == 0) {
				sum += currentNum;
			} else {
				sum -= currentNum;
			}
			currentNum++;
		}
		System.out.println(sum);
		System.out.println(currentNum + "\n");
	}
	public static void test4_5() {

	}
	public static void test4_6() {

	}
	public static void test4_7() {

	}
	public static void test4_8() {

	}
	public static void test4_9() {

	}
	public static void test4_10() {

	}
	public static void test4_11() {

	}
	public static void test4_12() {

	}
	public static void test4_13() {

	}
	public static void test4_14() {

	}
	public static void test4_15() {

	}
}
