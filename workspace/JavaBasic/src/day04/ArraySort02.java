package day04;

import java.util.Arrays;

public class ArraySort02 {

	public static void main(String[] args) {
		
		//버블정렬 - 장점: 쉬움, 단점: 느림
		//가장 큰 수를 뒤로 보냄
		int[] arr = {5, 23, 1, 43, 200, 100, 40}; 
		
		//1회전 - 5, 1, 23, 43, 100, 40, 200
		//2회전 - 1, 5, 23, 43, 40, 100, 200
		//3회전 - 1, 5, 23, 40, 43, 100, 200
		//.............................
		
		//바깥반복문 회전수
		//안쪽반복문 비교할값
//		for(int i = 0; i < arr.length - 1; i++) {
//			
//			for(int j = 0; j < arr.length-i-1; j++) {
//				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr); //정렬을 해줘 (아주빠르게)
		
		
		System.out.println( Arrays.toString(arr) );
		
		
		
		
		
		
		
		
	}
}
