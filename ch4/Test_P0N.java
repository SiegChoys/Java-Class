package ch4;

import java.util.Scanner;

public class Test_P0N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
			Scanner sc=new Scanner(System.in);
					System.out.println("������ �Է��϶�");
			number=sc.nextInt();
			if(number>0)
				System.out.println("���");
			else if(number==0) 
				System.out.println("0");
			else if(number<0) 
				System.out.println("����");
		}
	}

