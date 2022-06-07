package ch3;

public class Test {
	public static void main(String[] args) {
		test3_3();

		test3_4();

		test3_5();

		test3_6();

		test3_7();

		test3_8();

		test3_9();

		test3_10();
	}

	public static void test3_3() {
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
		int divide = numOfApples / sizeOfBucket;
		int numOfBucket = (divide > 0) ? divide + 1 : divide; // 모든 사과를 담는데 필요한 바구니의 수
		System.out.println("필요한 바구니 개수 구하기");
		System.out.println(numOfBucket + "\n"); // 필요한 바구니의 수
	}

	public static void test3_4() {
		int num = 456;
		System.out.println("3 - 4 백의 자리 이하를 버리는 코드");
		System.out.println( 100 * (num / 100) +  "\n");
	}

	public static void test3_5() {
		int num = 333;
		System.out.println("3 - 5 일의 자리를 1로 바꾸는 코드");
		System.out.println( num - (num % 10) + 1 + "\n" );
	}

	public static void test3_6() {
		System.out.println("변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드");
		int num = 24;
		System.out.println(((num / 10) + 1) * 10 - num  + "\n");

	}

	public static void test3_7() {
		System.out.println("화씨를 섭씨로 변환하는 코드이다 변환공식이. 'C = 5/9 ×(F - 32)' 일때, 알맞은 코드를 작성하시오. 단 변환 결과값은 소수점 셋째자리에서 반올림해야한다");
		int fahrenheit = 100;
		float celcius = 5/9f * (fahrenheit - 32);
		System.out.println("Fahrenheit: " + fahrenheit);
		System.out.println("Celcius: " + celcius + "\n");
	}

	public static void test3_8() {
		System.out.println(" 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오");

		/*
		실행 결과
		c=30
		ch=C
		f=1.5
		l=27000000000
		result=true
		*/

		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		char ch = 'A';
		ch = (char)(ch + 2);
		float f = 3 / 2f;
		long l = 3000L * 3000 * 3000;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d==f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result + "\n");
	}

	public static void test3_9() {
		System.out.println("다음은 문자형 변수 ch가 영문자 (대문자 또는 소문자) 이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드이다.");
		char ch = 'z';
		boolean b = ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');
		System.out.println(b + "\n");
	}

	public static void test3_10() {
		System.out.println("문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다");
		char ch = 'A';
		char lowerCase = ( 'A' <= ch && ch <= 'z' ) ? (char)(ch + 32) : ch;
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase + "\n");
	}

}
