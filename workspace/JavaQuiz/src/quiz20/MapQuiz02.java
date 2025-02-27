package quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz02 {

	public static void main(String[] args) {
		/*
		메뉴관리 시뮬레이터 (과제)
		
		무한 반복문안에서 음식 메뉴를 입력받고, 해당 메뉴에 알맞은 내용을 채워 넣어주면 됩니다.
		
		* 음식메뉴는 key로 등록하고 가격은 value로 등록합니다.
		음식 메뉴 정보
		1. 신규 메뉴 등록 2. 메뉴판 전체 보기 3. 메뉴판 수정 4. 메뉴판 삭제 5. 프로그램 종료
		
		1. 이미 등록된 메뉴인지 확인 후에 메뉴 등록
		2. 메뉴와 가격을 전부 출력
		3. 변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
		4. 변경할 메뉴를 받아서 메뉴가 있다면 삭제
		5. 프로그램 종료
		*/
		
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		
		while(true) {
			
			System.out.println("1. 신규 메뉴 등록 2. 메뉴판 전체 보기 3. 메뉴판 수정 4. 메뉴판 삭제 5. 프로그램 종료");
			System.out.print("메뉴>");
			int menus = scan.nextInt();
			
			if(menus == 1) {
				
				System.out.print("메뉴명>");
				String menu = scan.next();
				
				if(map.containsKey(menu)) {
					
					System.out.println(menu + "는 이미 등록된 메뉴 입니다");
				} else {
					System.out.print("가격>");
					int price = scan.nextInt();
					
					map.put(menu, price);
					System.out.println("메뉴가 등록되었습니다!");
				}
				
			} else if(menus == 2) {
				
				System.out.println("======메뉴명======");
				Set<Entry<String, Integer>> entrySet = map.entrySet();
				
				for(Entry<String, Integer> entry : entrySet) {
					System.out.println("메뉴:" + entry.getKey() + ", 가격:" + entry.getValue());
				}
				
				
			} else if(menus == 3) {
				//3. 변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
				
				System.out.print("변경할 메뉴명>");
				String menu = scan.next();
				
				if(map.containsKey(menu)) {
					//수정
					System.out.print("수정할 가격>");
					int price = scan.nextInt();
					
					map.put(menu, price);
					System.out.println("메뉴가 수정되었습니다");
				} else {
					System.out.println("해당 메뉴는 없습니다");
				}
				
			} else if(menus == 4) {
				
				System.out.print("삭제할 메뉴명>");
				String menu = scan.next();
				
				if(map.containsKey(menu)) {
					map.remove(menu);
					System.out.println("메뉴가 삭제 되었습니다");
				} else {
					 System.out.println("해당 메뉴는 없습니다");
				}
				
			} else if(menus == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}

		
	}
}
