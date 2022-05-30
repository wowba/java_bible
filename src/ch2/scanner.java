package ch2;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		System.out.print("두자리 정수를 입력하세요.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);

		System.out.println("입력내용 : " + input);
		System.out.printf("num=%d%n", num);
	}
}
