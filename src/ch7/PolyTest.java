package ch7;

public class PolyTest {
	boolean power; // 전원상태
	int channel; // 채널

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

class Son extends PolyTest {
	String text;

	void caption() {

	}
}
