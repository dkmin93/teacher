package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcSelect3 {

	public static void main(String[] args) {
		
		/*
		 * 테이블은 employees, departments
		 * 
		 * 회원번호를 입력받아서, 이 회원의 이름, 부서아이디, 부서명, 급여
		 * 를 출력하는 join문장을 작성합니다.
		 * 
		 * sqldeveloper에서 먼저 sql을 연습을 하고 복붙.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("회원번호>");
		String mno = scan.nextLine();
		
		
		Connection conn = null; //연결객체
		PreparedStatement pstmt = null; //sql을 실행하기 위한 객체
		ResultSet rs = null; //sql을 실행한 결과를 반환 받을 객체
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "HR";
		String upw = "HR";
		
		String sql = "SELECT E.FIRST_NAME,\r\n"
				+ "       E.SALARY,\r\n"
				+ "       E.DEPARTMENT_ID,\r\n"
				+ "       D.DEPARTMENT_NAME\r\n"
				+ "FROM EMPLOYEES E\r\n"
				+ "LEFT JOIN DEPARTMENTS D\r\n"
				+ "ON E.DEPARTMENT_ID = D.DEPARTMENT_ID\r\n"
				+ "WHERE EMPLOYEE_ID = ?";
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mno);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				//1행에 대한 컬럼의 처리
				String name = rs.getString("first_name");
				int salary = rs.getInt("salary");
				int dId = rs.getInt("department_id");
				String dName = rs.getString("department_name");
				
				System.out.println(name);
				System.out.println(salary);
				System.out.println(dId);
				System.out.println(dName);
				
			} else {
				System.out.println("회원번호가 없습니다");
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
