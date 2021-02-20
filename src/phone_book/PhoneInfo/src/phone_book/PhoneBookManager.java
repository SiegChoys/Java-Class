package phone_book;

public class PhoneBookManager {
	final int MAX_CNT=100;
	PhoneInfo[] infoStorage=new PhoneInfo[MAX_CNT];
	int curCnt=0;
	
	private PhoneInfo readFriendInfo()
	{
		System.out.println("�̸�: ");
		String name=MenuViewer.keyboard.nextLine();
		System.out.println("��ȭ��ȣ: ");
		String phone=MenuViewer.keyboard.nextLine();
		System.out.println("�������: ");
		String birth=MenuViewer.keyboard.nextLine();
		return new PhoneInfo(name, phone, birth);
	}
	
	private PhoneInfo readUnivFriendInfo()
	{
		System.out.println("�̸�: ");
		String name=MenuViewer.keyboard.nextLine();
		System.out.println("��ȭ��ȣ: ");
		String phone=MenuViewer.keyboard.nextLine();
		System.out.println("����: ");
		String major=MenuViewer.keyboard.nextLine();
		System.out.println("�г�: ");
		int year=MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		return new PhoneUnivInfo(name, phone, major, year);
	}
	
	private PhoneInfo readCompanyFriendInfo()
	{
		System.out.println("�̸�: ");
		String name=MenuViewer.keyboard.nextLine();
		System.out.println("��ȭ��ȣ: ");
		String phone=MenuViewer.keyboard.nextLine();
		System.out.println("ȸ��: ");
		String company=MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name, phone, company);
	}
		
	public void inputData()
	{
		System.out.println("������ �Է��� �����մϴ�.");
		System.out.println("1. �Ϲ�, 2. ����, 3. ȸ��");
		System.out.print("����>>");
		
		int choice=MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		PhoneInfo info=null;
		
		switch(choice)
		{
		case 1:
			info=readFriendInfo();
			break;
		case 2:
			info=readUnivFriendInfo();
			break;
		case 3:
			info=readCompanyFriendInfo();
			break;
		}

		infoStorage[curCnt++]=info;
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�. \n");
	
		
//		System.out.print("�̸�: ");
//		String name=MenuViewer.keyboard.nextLine();
//		System.out.print("��ȭ��ȣ: ");
//		String phone=MenuViewer.keyboard.nextLine();
//		System.out.print("�������: ");
//		String birth=MenuViewer.keyboard.nextLine();
		
//		infoStorage[curCnt++]=new PhoneInfo(name, phone, birth);
//		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�. \n");
	}
	
	public void searchData()
	{
		System.out.println("������ �˻��� �����մϴ�.");
		
		System.out.print("�̸�: ");
		String name=MenuViewer.keyboard.nextLine();
		
		int dataIdx=search(name);
		if(dataIdx<0)
		{
			System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�. \n");
		}
		else
		{
			infoStorage[dataIdx].showPhoneInfo();
			System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�. \n");			
		}
	}
	
	public void deleteData()
	{
		System.out.println("������ ������ �����մϴ�.");
		
		System.out.print("�̸�: ");
		String name=MenuViewer.keyboard.nextLine();

		int dataIdx=search(name);
		if(dataIdx<0)
		{
			System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�. \n");
		}
		else
		{
			for(int idx=dataIdx; idx<(curCnt-1); idx++)
				infoStorage[idx]=infoStorage[idx+1];
			
			curCnt--;
			System.out.println("������ ������ �Ϸ�Ǿ����ϴ�. \n");
		}
	}
	
	private int search(String name)
	{
		for(int idx=0; idx<curCnt; idx++)
		{
			PhoneInfo curInfo=infoStorage[idx];
			if(name.compareTo(curInfo.name)==0)
				return idx;
		}
		return -1;
	}
}