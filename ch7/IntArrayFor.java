package ch7;

	// �迭�� �� ��ҿ� 5, 4, 3, 2, 1�� �����ؼ� ǥ��
	public class IntArrayFor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
				
		for (int i = 0; i < a.length; i++)
			a[i] = 5 - i;
		
		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "]= "+a[i]);
		
		
	}

}
