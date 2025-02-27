package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcUpdate {

	public static void main(String[] args) {
		/*
		 * 업데이트도 insert와 동일하게 처리합니다.
		 * 회원번호, 이름, 주소 를 입력받아서 해당 회원의 이름과 주소를 변경해주세요.
		 * 만약에 회원번호가 없으면 "회원번호가 없습니다" 를 출력하면 됩니다.
		 */
		//이름, 주소를 입력
		Scanner scan = new Scanner(System.in);
		System.out.print("번호>");
		String mno = scan.nextLine();
		System.out.print("이름>");
		String name = scan.nextLine();
		System.out.print("주소>");
		String address =scan.nextLine();
		
		Connection conn = null; //연결객체
		PreparedStatement pstmt = null; //sql을 실행하기 위한 객체
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		
		String sql = "UPDATE MEMBERS SET NAME = ?, ADDRESS = ? WHERE MNO = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.setString(3, mno);
			
			int result = pstmt.executeUpdate(); //1 or 0 반환
			
			if(result == 1) {
				System.out.println("업데이트 처리 되었습니다");
			} else {
				System.out.println("없는 회원번호 입니다");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
			}
		}
		
		
	}
}
