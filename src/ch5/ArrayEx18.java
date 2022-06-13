package ch5;

public class ArrayEx18 {
	public static void main(String[] args) {
		int[][] score = {
			{100, 100, 100},
			{20, 40, 60},
			{60, 70, 80},
			{40, 60, 70}
		};

		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d] =%d%n", i, j, score[i][j]);
			}
		}

		for (int[] tmp : score) {
			for (int i : tmp) {
				sum += i;
			}
		}

		System.out.println("sum = " + sum);
	}
}
