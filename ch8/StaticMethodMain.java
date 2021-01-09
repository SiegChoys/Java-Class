package ch8;

public class StaticMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod sm= new StaticMethod();
		StaticMethod.a = 10;
		sm.b = 20;
		StaticMethod.test(30);
	}

}
