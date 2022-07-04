package ch7;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null; // 참조변수 car 선언, null로 초기화
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe; // car = (Car)f2; 축약. 자손타입 -> 조상타입은 형변환 생략이 가능하다.
		// car.water(); 컴파일 에러.
		fe2 = (FireEngine)car; // 조상타입 -> 자손타입.
		fe.water();
	}
}

class Car{
	String color;
	int door;

	void drive() {
		System.out.println("drive");
	}

	void stop() {
		System.out.println("stop");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water");
	}
}