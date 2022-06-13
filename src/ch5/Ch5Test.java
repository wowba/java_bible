package ch5;

public class Ch5Test {
	public static void main(String[] args) {
		test5_3();
		test5_4();
		test5_5();
		test5_6();
		test5_7(args);
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

	public static void test5_7(String args[]) {
		System.out.println("보유한 동전의 개수로 거스름돈을 지불할 수 없으면, 지불 불가 출력하기." 
			+ "충분하다면 지불한 뒤 남은 동전의 개수 출력하기");

		if(args.length!=1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}

		// . . 문자열을 숫자로 변환한다 입력한 값이 숫자가 아닐 경우 예외가 발생한다
		int money = Integer.parseInt(args[0]);

		System.out.println("money="+money);

		int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
		int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수

		for(int i=0;i<coinUnit.length;i++) {
			int coinNum = 0;
			/* (1) 아래의 로직에 맞게 코드를 작성하시오
			1. 금액을 동전단위로 나눠서 필요한 동전의 개수 를 구한다
			2. 배열에서 동전을 뺀다
			(만일 충분한 동전이 없다면 배열에 있는 만큼만 뺀다)
			3. 금액에서 동전의 개수와 동전단위를 곱한 값을 뺀다
			*/
			int cnt = money / coinUnit[i];
			System.out.println(cnt);

			System.out.println(coinUnit[i]+"원 : "+coinNum);
		}
		if(money > 0) {
			System.out.println(" 거스름돈이 부족합니다.");
			System.exit(0); // . 프로그램을 종료한다
		}
		System.out.println("=남은 동전의 개수 =");

		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원 :"+coin[i]);
		}
	}
}
