package ch4;

import java.time.LocalDateTime;

public class Test {

	public static void main(String[] args) {
		test4_1();

		test4_2();

		test4_3();

		test4_4();

		test4_5();

		test4_6();

		test4_7();

		test4_8();

		test4_9();

		test4_10();

		test4_11();

		test4_12();

		test4_13();

		test4_14();
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
		System.out.println("4 - 4 / 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100 이상이 되는지 구하시오");
		int sum = 0;
		int currentNum = 1;
		while (sum < 99) {
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
		System.out.println("4 - 5 / 다음의 for 문을 while 문으로 변경하세요");
		/*
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			System.out.println();
		}
		*/
		int i = 0;
		int j = 0;
		while (i <= 10) {
			while (j <= i) {
				System.out.println("*");
				j++;
			}
			i++;
			j = 0;
		}
		System.out.println();
	}
	public static void test4_6() {
		System.out.println("4 - 6 / 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.");
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				if (i + j == 6) {
					System.out.println("i, j = " + i + ", " + j);
				}
			}
		}
		System.out.println();

	}
	public static void test4_7() {
		System.out.println("4 - 7 / Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라.");

		int value = (int)(Math.random()*6);

		System.out.println("value:"+value + "\n");

	}
	public static void test4_8() {
		System.out.println("4 - 8 / 2x + 4y = 10의 모든 해를 구하시오. 0 <= x, y <= 10이다.");
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <=10; y++) {
				if (2 * x + 4 * y == 10) {
					System.out.println("x, y = " + x + ", " + y);
				}
			}
		}
		System.out.println();
	}
	public static void test4_9() {
		System.out.println("4 - 9 / str의 각자리의 합을 더한 결과를 출력하시오.");
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
			sum += Character.getNumericValue(str.charAt(i));
		}
		System.out.println("sum = "+ sum + "\n");
	}
	public static void test4_10() {
		System.out.println("4 - 10 / int타입의 변수 num이 있을때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라");
		int num = 12345;

		String str = String.valueOf(num);
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			sum += Character.getNumericValue(str.charAt(i));
		}
		System.out.println("sum = "+ sum + "\n");

	}
	public static void test4_11() {
		System.out.println("4 - 11 / 피보나치 수 10번째 구하기");

		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		System.out.print(num1 + "," + num2);
		for (int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			System.out.print("," + num3);
			num1 = num2;
			num2 = num3;
			
		}
		System.out.println("\n");
	}
	public static void test4_12() {
		System.out.println("4 - 12 / 구구단의 일부분을 다음과 같이 출력하시오");
		for (int a = 2; a <= 9; a++) {
			for (int b = 1; b <= 3; b++) {
				System.out.println(a + "*" + b + "=" + a*b);
			}
		}
		System.out.println();

	}
	public static void test4_13() {
		System.out.println("4 - 13 / 문자열이 숫자인지 판별하는 프로그램을 작성하시오");
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		// charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다
		for(int i=0; i < value.length() ;i++) {
			ch = value.charAt(i);
			if (Character.isDigit(ch)) {
				isNumber = false;
			}
		}
		if (isNumber) {
			System.out.println(value+"는 숫자입니다.");
		} else {
			System.out.println(value+"는 숫자가 아닙니다.");
		}

	}
	public static void test4_14() {
		System.out.println("숫자맞추기 게임 작성하기");
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다
		int answer = (int)(Math.random() * 100);
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요 :");
			input = s.nextInt(); // input . 입력받은 값을 변수 에 저장한다

			if (answer == input) {
				System.out.println("정답. 시도 횟수 : " + count + "번");
				break;
			} else if (answer > input) {
				System.out.println("더 큰 수를 입력하세요");
			} else {
				System.out.println("더 작은 수를 입력하세요");
			}
		} while(true); // 무한반복문
	}

	public static void test4_15() {
		System.out.println("회문수 구하는 프로그램 작성하기");
		int number = 12321;
		int tmp = number;
		int result =0; // number 변수 를 거꾸로 변환해서 담을 변수
		while(tmp !=0) {

		}
		if (number == result) {
			System.out.println(number + " 는 회문수 입니다.");
		} else {
			System.out.println(number + " 는 회문수가 아닙니다.");
		}
	}
}
