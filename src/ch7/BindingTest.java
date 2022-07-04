package ch7;

public class BindingTest {
	public static void main(String[] args) {
		Parent1 p = new Child1();
		Child1 c = new Child1();

		System.out.println("p.x = " + p.x); // Child1 이라는 인스턴스를 생성하지만 조상타입의 참조변수 p의 멤버변수 x를 참조한다.
		p.method();

		System.out.println("c.x = " + c.x); // Child1의 멤버변수 x를 참조한다.
		c.method();
	}
}

class Parent1 {
	int x = 100;

	void method() {
		System.out.println("Parent method");
	}
}

class Child1 extends Parent1 {
	int x = 200;

	@Override
	void method() {
		System.out.println("Child Method");
	}
}
