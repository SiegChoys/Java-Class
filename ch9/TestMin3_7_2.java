package ch9;

import java.util.Scanner;

public class TestMin3_7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, min;
		int[] arr = new int[3];
		System.out.println("���� 3���� �Է��϶�");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// min�� �迭 ù ������ �ʱ�ȭ
		min = arr[0];
		// �Է¹��� 3���� ���� �� ���� ū ���� ���Ѵ�.
		for (i = 0; i < arr.length; i++ ) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("�ּ� = " + min);
	}
}