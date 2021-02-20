package phone_book;

import java.util.Scanner;

public class PhoneBookVer02 {
	static Scanner keyboard=new Scanner(System.in);
	
	public static void showMenu()
	{
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ���α׷� ����");
		System.out.println("���� : ");
	}
	
	public static void readData()
	{
		System.out.println("�̸� : ");
		String name =keyboard.nextLine();
		System.out.println("��ȭ��ȣ : ");
		String phone =keyboard.nextLine();
		System.out.println("������� : ");
		String birth =keyboard.nextLine();
		
		PhoneInfo info=new PhoneInfo(name, phone, birth);
		System.out.println("\n�Էµ� ���� ���...");
		info.showPhoneInfo();
	}
	
	public static void main(String[] args)
	{
		int choice;
		while(true)
		{
			showMenu();
			choice=keyboard.nextInt();
			keyboard.nextLine();	// �Ʒ����� ����!
			
			switch(choice)
			{
			case 1:
				readData();
				break;
			case 2:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
	
}
