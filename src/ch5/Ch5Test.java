package ch5;

import java.util.Scanner;

public class Ch5Test {
	public static void main(String[] args) {
		test5_3();
		test5_4();
		test5_5();
		test5_6();
		test5_8();
		test5_9();
		test5_10();
		test5_11();
		// test5_12();
		test5_13();
	}

	public static void test5_3() {
		System.out.println("배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.");
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;

		for (int num : arr) {
			sum += num;
		}

		System.out.println("sum="+sum+"\n");
	}

	public static void test5_4() {
		System.out.println("2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.");

		int[][] arr = {
			{ 5, 5, 5, 5, 5},
			{10,10,10,10,10},
			{20,20,20,20,20},
			{30,30,30,30,30}
		};
		int total = 0;
		float average = 0;
		int cnt = 0;
		
		// 총합 구하기
		for (int[] ints : arr) {
			for (int score : ints) {
				total += score;
				cnt++;
			}
		}
		
		// 평균 구하기
		average = total / (float)cnt;
		
		System.out.println("total="+total);
		System.out.println("average="+average + "\n");
	}

	public static void test5_5() {
		System.out.println("1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자 만들기");
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		// ballArr . 배열 의 임의의 요소를 골라서 위치를 바꾼다
		for(int i=0; i< ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			/* (1) . 알맞은 코드를 넣어 완성하시오 */
			tmp = ballArr[j];
			ballArr[j] = ballArr[i];
			ballArr[i] = tmp;

		}
		// ballArr 배열의 앞에서 3개의 수를 배열 ball3 로 복사한다
		/* (2) */
		System.arraycopy(ballArr, 0,ball3 , 0, ball3.length);
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}
		System.out.println("\n");
	}

	public static void test5_6() {
		System.out.println("최대한 적은 동전의 수로 거슬러주기");
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			int cnt = money / coinUnit[i];
			money -= cnt * coinUnit[i];
			System.out.printf("%d원: " + cnt, coinUnit[i]);
			System.out.println("\n");
		}
	}

	public static void test5_8() {
		System.out.println("배열의 숫자를 읽고 그 수만큼 * 출력하기");
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		for(int i=0; i < answer.length;i++) {
			System.out.print(answer[i]);
			for (int j = 0; j < answer[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void test5_9() {
		System.out.println("주어진 배열을 시계방향으로 90도 회전시키는 프로그램 만들기");
		char[][] star = {
			{'*','*',' ',' ',' '},
			{'*','*',' ',' ',' '},
			{'*','*','*','*','*'},
			{'*','*','*','*','*'}
		};
		char[][] result = new char[star[0].length][star.length];
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i < star.length;i++) {
			for(int j=0; j < star[i].length;j++) {
				/* (1) . 알맞은 코드를 넣어 완성하시오 */
				int x = j;
				int y = star.length-1-i;
				result[x][y]=star[i][j]; // (i,j) (x,y)
			}
		}
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void test5_10() {
		System.out.println("주어진 src를 암호화하기");
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
				'(',')','-','_','+','=','|','[',']','{',
				'}',';',':',',','.','/'};
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String src = "abc123";
		String result = "";
		// 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			/* (1) . 알맞은 코드를 넣어 완성하시오. */

			if (Character.isAlphabetic(ch)) {
				result += abcCode[ch - 'a'];
			}

			if (Character.isDigit(ch)) {
				result += numCode[ch - '0'];
			}
		}
		System.out.println("src:"+src);
		System.out.println("result:"+result);
		System.out.println();
	}

	public static void test5_11() {
		System.out.println("주어진 배열보다 가로세로 1씩 더 큰 배열을 생성하고, 행 및 열의 총합을 추가하기.");
		int[][] score = {
			{100, 100, 100}
			, {20, 20, 20}
			, {30, 30, 30}
			, {40, 40, 40}
			, {50, 50, 50}
		};
		int[][] result = new int[score.length+1][score[0].length+1];
		for(int i=0; i < score.length;i++) {
			for(int j=0; j < score[i].length;j++) {
				/* (1) . 알맞은 코드를 넣어 완성하시오 */
				result[i][j] = score[i][j];
				result[i][result[i].length - 1] += score[i][j];
				result[result.length - 1][j] += score[i][j];

				if (i == score.length - 1 && j == score[i].length - 1) {
					for (int k = 0; k < result[i + 1].length - 1; k++) {
						result[i + 1][j + 1] += result[i + 1][k];
					}
				}
			}
		}
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.printf("%4d",result[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void test5_12() {
		System.out.println("단어를 섞고 원래 단어를 맞추는 프로그램 만들기");
		
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // String을 char[]로 변환
			/*
			(1) 알맞은 코드를 넣어 완성하시오
			char배열 question에 담긴 문자의 위치를 임의로 바꾼다
			*/
			for (int j = 0; j < question.length; j++) {
				int ranNum = (int)(Math.random() * question.length);
				char tmp = ' ';
				tmp = question[ranNum];
				question[ranNum] = question[j];
				question[j] = tmp;
			}

			System.out.printf("Q%d. %s의 정답을 입력하세요 .>",
				i + 1, new String(question));
			String answer = scanner.nextLine();
			// trim() answer , equals word[i] 으로 의 좌우 공백을 제거한 후 로 와 비교
			if (words[i].equals(answer.trim()))
				System.out.printf("맞았습니다 .%n%n");
			else
				System.out.printf("틀렸습니다 .%n%n");
		}
	}

	public static void test5_13() {
		System.out.println("12번 문제 변화주기");

		String[] words = { "chair", "computer", "integer"};
		String[] answers = { "의자", "컴퓨터", "정수" };
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?>",
				i + 1, words[i]);
			String answer = scanner.nextLine();
			// trim() answer , equals word[i] 으로 의 좌우 공백을 제거한 후 로 와 비교
			if (answers[i].equals(answer.trim()))
				System.out.printf("맞았습니다.%n%n");
			else
				System.out.printf("틀렸습니다. 정답은 %s 입니다.%n%n", answers[i]);
		}
	}
}
