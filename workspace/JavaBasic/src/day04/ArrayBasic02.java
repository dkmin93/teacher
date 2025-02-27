package day04;

import java.util.Arrays;

public class ArrayBasic02 {

	public static void main(String[] args) {
		
		//크기가 100인 배열에 1~100
		int[] arr = new int[100];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
	}
}
