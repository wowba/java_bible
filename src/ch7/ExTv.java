package ch7;

public class ExTv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}
}

class CaptionTv extends ExTv {
	boolean caption;

	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv tv = new CaptionTv();
		tv.channel = 10;
		tv.channelUp();
		System.out.println(tv.channel);
		tv.displayCaption("hello world");
		tv.caption = true;
		tv.displayCaption("hello world");
	}
}
