package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		
		//백준 -10813번
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //배열의 크기
		int m = scan.nextInt(); //자리 바꾸는 횟수
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		//m번 자리를 바꾼다.
		for(int i = 1; i <= m; i++ ) {
			
			int a = scan.nextInt() - 1; //인덱스
			int b = scan.nextInt() - 1; //인덱스
			
			int temp = 0;
			temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		
		//출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		
	}
}
