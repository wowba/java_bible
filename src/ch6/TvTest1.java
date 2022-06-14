package ch6;

class TvTest1 {
	public static void main(String[] args) {
		Tv1 tv; // TV 인스턴스를 참조하기 위한 변수 tv 선언
		tv = new Tv1(); // TV 인스턴스 생성
		tv.channel = 7;
		tv.channelDown();
		System.out.println(tv.channel);
	}
}

class Tv1 {
	String color;

	boolean power;

	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}
