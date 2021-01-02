package ch4;

import java.util.Scanner;

public class Test_P0N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
			Scanner sc=new Scanner(System.in);
					System.out.println("정수를 입력하라");
			number=sc.nextInt();
			if(number>0)
				System.out.println("양수");
			else if(number==0) 
				System.out.println("0");
			else if(number<0) 
				System.out.println("음수");
		}
	}

