package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		
		//백준 - 배열 x보다 작은수
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //입력받을 데이터 개수
		int x = scan.nextInt(); //보다 작은수를 찾음
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < x ) {
				System.out.print(arr[i] + " ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
