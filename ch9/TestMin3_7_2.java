package ch9;

import java.util.Scanner;

public class TestMin3_7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, min;
		int[] arr = new int[3];
		System.out.println("정수 3개를 입력하라");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// min에 배열 첫 값으로 초기화
		min = arr[0];
		// 입력받은 3개의 숫자 중 가장 큰 값을 구한다.
		for (i = 0; i < arr.length; i++ ) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최소 = " + min);
	}
}