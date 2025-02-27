package quiz01;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		//백준 - 10818번 - 최소, 최대
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int[] arr = new int[num]; //크기가 num인 배열
		
		
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			
			if(i == 0) { //초기에 한번만
				max = arr[i];
				min = arr[i];
			}
			
			if(arr[i] > max) { //최대값
				max = arr[i];
			}
			
			if(arr[i] < min) { //최소값
				min = arr[i];
			}
		}
		
		System.out.println(min + " " + max);
		

		
		
		
		
		
		
		
	}
}
