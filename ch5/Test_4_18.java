package ch5;

import java.util.Scanner;

public class Test_4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
				System.out.print("������: ");
				int n = stdIn.nextInt();
				int count = 0; // ����� ����
				for (int i = 1; i <= n;i++)
					if (n % i == 0) { // ������ ��������
						count++;
					}
				System.out.println("\n�� ����� " + count + "���Դϴ�"); // ������ ǥ��
	}

}
