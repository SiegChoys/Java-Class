package ch4;

import java.util.Scanner;

public class Test_address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
				
		System.out.print("주소:");
		String address = stdIn.nextLine();
		
		System.out.println("주소는 " + address +"입니다.");

	}

}
