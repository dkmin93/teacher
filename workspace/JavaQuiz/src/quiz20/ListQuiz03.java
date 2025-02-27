package quiz20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz03 {

	public static void main(String[] args) {
		
		/*
		 * 회원정보 프로그램 시뮬레이터
		 * 
		 * 무한반복문안에서 메뉴를 입력받고, 해당 메뉴에 알맞은 내용을 채워 넣어주면 됩니다.
		 * 
		 * 메뉴 1.유저등록, 2.전체회원정보출력, 3.회원정보검색, 4.회원정보삭제, 5.프로그램종료
		 * 
		 * 1. 스캐너로 name, age입력받아서 User객체를 리스트에 추가.
		 * 2. 모든 회원 정보를 출력하면 됩니다.
		 * 3. 찾을 이름을 입력받아서. 이름이 있으면, 이름과 나이를 출력해 줍니다.
		 * 	  찾는 이름이 없으면 "~~님은 목록에 없습니다" 를 출력합니다. -
		 * 4. 삭제할 이름을 입력받아서, 동일한 이름을 가진 회원이 있으면 User를 삭제
		 * 5. 종료
		 */
		
		
		
		
		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<>();
		
		
		while(true) {
			System.out.println("1.유저등록, 2.전체 회원정보출력, 3.회원정보검색, 4.회원정보삭제, 5.프로그램종료");
			System.out.print("메뉴>");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				
				System.out.print("이름>");
				String name = scan.next();
				System.out.print("나이>");
				int age = scan.nextInt();
				
				User user = new User(name, age);
				list.add(user);
				
			} else if(menu == 2) {
				
				System.out.println("=======전체 회원 정보 출력=======");
				for(User u : list) {
					System.out.println("이름:" + u.getName() + ", 나이:" + u.getAge());
				}
				
			} else if(menu == 3) {
				
				System.out.println("=======회원 정보 검색=======");
				System.out.print("검색할 이름>");
				String find = scan.next();
				
				boolean bool = true; //찾았다 vs 못찾았다 판별할 변수
				
				for(int i = 0; i < list.size(); i++) {
					
					User u = list.get(i);
					String name = u.getName();
					
					if(find.equals(name)) {
						System.out.println("찾은정보:" + u.getName() + ", " + u.getAge());
						bool = false;
					}
				}
				
				if(bool) {
					System.out.println(find + "님은 없습니다");
				}
				
			} else if(menu == 4) {
				
				System.out.println("=======회원 정보 삭제=======");
				System.out.print("삭제할 이름>");
				String find = scan.next();
				
				for(int i = 0; i < list.size(); i++) {
					if( list.get(i).getName().equals(find) ) {
						list.remove(i); //삭제
						System.out.println(find + "님이 삭제되었습니다");
						break; 
					}
				}
				
			} else if(menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			
		}
		
		
		
		
		
		
		
	}
}
