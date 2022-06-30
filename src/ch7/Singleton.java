package ch7;

final class Singleton {
	// 인스턴스가 미리 생성되어야 사용할 수 있으므로 static 이여야 한다.
	private static Singleton s = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}
}

class SingletonTest {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		// 두 인스턴스의 주소가 동일하다!
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
	}
}
