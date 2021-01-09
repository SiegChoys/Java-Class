package ch8;

public class ArrParam {
		int max;
		int sum;
		float avg;
		
		void makeMax(int[] arr) {
			int i;
			max = arr[0];
			for (i = 1; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}
	}

		void makeSum(int[] arr) {
			int i;
			sum = 0;
			for (i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
		}
		
		void makeAvg(int[] arr) {
			makeSum(arr); // 메서드 내에서 다른 메서드를 호출하는 것은 가능
			avg = (float) sum / arr.length;
		}
		
}
