package ch4;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		for (;;) {
			System.out.print((i++)+"\t");
			if (i == 11) {
				break;
			}
		}
	}

}
