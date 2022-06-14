package ch6;

public class CardTest {
	public static void main(String[] args) {
		System.out.println("card.width = " + Card.width);
		System.out.println("card.height = " + Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1 kind : " + c1.kind + " c1 number : " + c1.number + " c1 height : " + c1.height + " c1 width : " + c1.width);
		System.out.println("c2 kind : " + c2.kind + " c2 number : " + c2.number + " c2 height : " + c2.height + " c2 width : " + c2.width);

		c1.width = 50;
		c1.height = 80;

		System.out.println("c2 kind : " + c2.kind + " c2 number : " + c2.number + " c2 height : " + c2.height + " c2 width : " + c2.width);
	}
}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
