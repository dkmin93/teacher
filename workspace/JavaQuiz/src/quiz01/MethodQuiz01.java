package quiz01;

import java.util.Arrays;

public class MethodQuiz01 {

	public static void main(String[] args) {
		//char배열을 만들어서 줘야함
		char[] arr = {'a', 'b', 'c'};
		String result = method06(arr);
		System.out.println(result);
		
		int[] arr2 = {1,2,3,4,5};
		int result2 = method07(arr2);
		System.out.println(result2);
		
		
		//
		String[] arr3 = method08("홍길동", "이순신");
		System.out.println( Arrays.toString(arr3)  );
		
		
	}
	
	
	//method04
	static String method04(int a) {
	
		if(a % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	//method05
	static int method05(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	//abs
	static int abs(int a) {
		return a < 0 ? -a : a;
	}
	
	//6
	static String method06(char[] arr) {
		
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
		
		return str;
	}
	//7
	static int method07(int[] arr) {
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	//8
	static String[] method08(String s1, String s2) {
		String[] arr = {s1, s2};
		return arr;
	}
	
	
	
	
}
