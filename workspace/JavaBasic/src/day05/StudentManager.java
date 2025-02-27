package day05;

import java.util.Scanner;

public class StudentManager {

	static Scanner scan = new Scanner(System.in);
	static String[] nameList = new String[100]; //배열을 늘리거나 줄이거나 x
	static int[] ageList = new int[100];
	static int count = 0; //고객수
	static int index = -1; //위에 있는 배열을 조회하는 위치(포인터)
	//예를 들어서 index = 0이면, 배열의 0번째 위치를 조회하고 있음
	
	public static void main(String[] args) {
		
		x:while(true) {
			
			System.out.println("[현재고객수]:" + count + "\n[조회위치]:" + index);
			System.out.println("[메뉴] 1.추가, 2.이전정보, 3.다음정보, 4.현재정보, 5.정보수정, 6.정보삭제, 7.프로그램종료");
			System.out.print("메뉴입력>");
			String menu = scan.next();
			
			switch (menu) {
			case "1":
				System.out.println("======회원 정보를 입력합니다======");
				add();
				System.out.println("회원정보 입력 성공!!");
				break;
			case "2":
				/*
				 * 이전정보출력
				 * index위치를 -1시키고 해당 위치정보를 출력.
				 * 
				 * 이전정보가 존재하지 않는 조건
				 * index <= 0
				 */
				System.out.println("======이전 회원 정보를 출력합니다======");	
				if(index <= 0) {
					System.out.println("<이전 정보는 없습니다>");
				} else {
					index--;
					printInfo();
				}
				
				
				break;
			case "3":
				System.out.println("======다음 회원 정보를 출력합니다======");				
				
				if(index >= count - 1) {
					System.out.println("<다음 정보는 없습니다>");
				} else {
					index++;
					printInfo();
					System.out.println("==============================");
				}
				
				break;
			case "4":
				/*
				 * 현재 index가 가르키고 있는 위치의 정보를 출력해주면 됩니다.
				 * 
				 * 출력이 가능한 조건
				 * index >= 0, index <= count - 1 작으면 출력가능
				 */
				if(index >= 0 && index <= count - 1) { 
					printInfo();
				} else {
					System.out.println("<현재 정보는 없습니다>");
				}
				break;
			case "5":
				/*
				 * 정보수정
				 * 새로운 이름, 나이를 입력받아서
				 * 현재위치를 수정해주면 됩니다.
				 * 
				 * 현재위치가 수정가능한 조건은 생각해 보세요.
				 */
				System.out.println("=======현재 정보를 수정 합니다======");
				if(index >= 0 && index <= count - 1) {
					modify();
					System.out.println("<수정이 완료 되었습니다>");
				} else {
					System.out.println("<현재 정보는 없습니다>");
				}
				
				break;
			case "6":
				/*
				 * 정보삭제
				 * 현재삭제하려는 index위치부터 ~뒤에 있는 배열 요소를 당겨와서 덮어 씌웁니다.
				 * count를 감소
				 * 
				 * 삭제가 가능한 조건은 위와 동일함
				 */
				if(index >= 0 && index <= count - 1) {
					delete();
					count--; //사람수 감소
					System.out.println("<삭제가 완료 되었습니다>");
				} else {
					System.out.println("<현재 삭제할 정보가 없습니다>");
				}
				break;
			case "7":
				/*
				 * 반복문을 탈출하고 프로그램 종료
				 */
				System.out.println("프로그램 종료");
				break x;
				//System.exit(0);
				
			default:
				System.out.println("<메뉴를 다시 입력해 주세요>");
				break;
			}
			
		}
		
	}
	
	
	static void add() {
		
		//입력을 받음. 배열에 추가
		System.out.print("이름>");
		String name = scan.next();
		System.out.print("나이>");
		int age = scan.nextInt();
		
		nameList[count] = name;
		ageList[count] = age;
		count++; //고객수 증가
	}
	
	static void printInfo() {
		System.out.println("이름:" + nameList[index]);
		System.out.println("나이:" + ageList[index]);
	}
	
	static void modify() {
		
		System.out.print("수정할 이름>");
		String name = scan.next();
		System.out.print("수정할 나이>");
		int age = scan.nextInt();
		
		nameList[index] = name;
		ageList[index] = age;
	}
	
	static void delete() {
		for(int i = index; i < count - 1; i++) {
			nameList[i] = nameList[i+1];
			ageList[i] = ageList[i+1];
		}
		
		
	}
	
	
	
}
