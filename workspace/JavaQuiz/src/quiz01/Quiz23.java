package quiz01;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		
		//백준 2차원배열 - 2566번
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[9][9];
		
		
		//값을 저장하기
		int max = 0;
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {				
				arr[i][j] = scan.nextInt();
				
				//최대
				if(arr[i][j] > max) {
					max = arr[i][j];
					x = i;
					y = j;
				}
			}
		}
		
		
		System.out.println(max);
		System.out.println( (x+1) + " " + (y+1) );
		
		
		
		
		
		
		
		
		
	}
}
