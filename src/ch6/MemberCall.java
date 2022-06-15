package ch6;

import java.lang.reflect.Member;

public class MemberCall {

	int iv = 10;
	static int cv = 20;

	int iv2 = cv;
	// static int cv2 = iv; 클래스변수는 인스턴스 변수를 사용할 수 없다.
	static int cv2 = new MemberCall().iv2; // 객체를 생성하면 사용할 수 있다.

	static void staticMethod1() {
		System.out.println(cv);
		// System.out.println(iv); 클래스 메서드에서 인스턴스 변수 사용 불가
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // 객체 생성시 인스턴스 변수 사용 가능.
	}

	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // 인스턴스 메서드에서는 인스턴스 변수 바로 사용 가능
	}

	static void staticMethod2() {
		staticMethod1();
		// instanceMethd1(); 클래스 메서드는 인스턴스 메서드 호출 불가
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // 인스턴스 생성시 호출 가능.
	}

	void instanceMethod2() {
		staticMethod1(); // 인스턴스 메서드는 인스턴스메서드, 클래스메서드 둘다 호출 가능
		instanceMethod1();
	}
}
