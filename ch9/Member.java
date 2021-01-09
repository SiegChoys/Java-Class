package ch9;

public class Member {
	String name;
	String tel;
	String address;
	
	Member() { // 생성자
		name = "no name";
		tel = "no tel";
		address = "no address";
	}
	
	void setMemberData(String _name, String _tel, String _address) {
		name = _name;
		tel = _tel;
		address = _address;
	}
	
	// 일반 메서드로 파라메터로 전달받은 값으로 멤버변수에 값을 할당.
	void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
	
}
