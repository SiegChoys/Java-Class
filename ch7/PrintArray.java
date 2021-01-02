package ch7;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdln = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int n = stdln.nextInt(); // 요소 수 입력
		int[] a = new int[n]; // 배열 생성
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]= ");
			a[i] = stdln.nextInt();
		}
		System.out.print("a= {");
		if (n >= 2)
			for (int i = 0; i < n-1; i++) // 앞에서부터
				System.out.print(a[i] + ", ");
		if (n >= 1)
				System.out.print(a[n-1]);
		System.out.print("}");
		
	}

}
