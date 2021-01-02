package ch5;

import java.util.Scanner;

public class Arr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1, 2, 3}, {4, 5, 6}};
		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");	
			}
			System.out.println();
		}
	}

}
