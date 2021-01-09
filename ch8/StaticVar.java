package ch8;

public class StaticVar {
	static int a=1;
	int b=1;
	
	void staticTest() {
		a++;
		b++;
		System.out.println("static var a = " + a);
		System.out.println("non static var b = " + b);
	}
}
