package ch7;

public class CastingTest2 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;

		car.drive();
		// fe = (FireEngine)car; 조상 타입의 인스턴스를 자손 타입의 참조변수로 참조하는것은 불가능하다. 참조변수가 가르키는 인스턴스의 타입이 무엇인지 항상 확인하자.
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}
