package ch8;

import java.util.Scanner;

public class SignOf1 {
	//-- n�� ��ȣ ���� --//
	static int signOf(int n) {
		int sign = 0;
		
		if (n > 0)
			sign = 1;
		else if (n < 0)
			sign = -1;
			
		return sign; // sign �� ��ȯ
	}
	
	public static void main(String[]args) {
		Scanner stdln = new Scanner(System.in);

		System.out.print("���� x: ");
		int x = stdln.nextInt();
		
		int s = signOf(x);
		System.out.println("signOf(x)�� " + s + "�Դϴ�.");
		
		
	}
	
}
