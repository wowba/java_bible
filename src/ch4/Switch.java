package ch4;

import java.time.LocalDateTime;

public class Switch {
	public static void main(String[] args) {
		int currentMonth = LocalDateTime.now().getMonthValue();

		System.out.println(currentMonth);

		switch (currentMonth) { // 스위치 문의 조건식 결과는 무조건 정수 아니면 문자열
			case 1: case 2: case 3: // case 문의 값은 정수 상수만 가능하며 중복은 불가능하다.
				System.out.println("1분기");
				break; // break가 없다면 강제로 다음 case 문으로 이동한다.
			case 4: case 5: case 6:
				System.out.println("2분기");
				break;
			case 7: case 8: case 9:
				System.out.println("3분기");
				break;
			case 10: case 11: case 12:
				System.out.println("4분기");
				break;
		}
	}
}
