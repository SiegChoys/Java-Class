package phone_book;

public class PhoneBookVer01
{
	public static void main(String[] args)
	{
		PhoneInfo pInfo1=new PhoneInfo("������", "323-1111", "92, 09, 12");
		PhoneInfo pInfo2=new PhoneInfo("��ȿ��", "321-2222");
		pInfo1.showPhoneInfo();
		pInfo2.showPhoneInfo();
	}
}