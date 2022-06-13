package ch5;

import java.util.Arrays;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] score = new int[5];
		int k = 1;

		score[0] = 50;
		score[1] = 60;
		score[2] = 70;
		score[3] = 80;
		score[4] = 90;

		for (int key : score) {
			System.out.printf("score[%d]\n" , key);
		}

		int[] arr = {1, 2, 3, 4, 5};
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(arr));
	}
}
