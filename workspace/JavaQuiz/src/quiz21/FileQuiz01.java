package quiz21;

import java.io.FileWriter;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 이용해서 파일명을 입력 받습니다.
		 * 2. file폴더 하위에 입력받은 파일명으로 파일을 씁니다.
		 * 3. 파일을 쓸 때, "쓰고 싶은 말"을 사용자에게 입력 받습니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("파일명>");
		String file = scan.next();
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + file + ".txt";
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(path);
			scan.nextLine(); // 엔터값의 여부를 처리하고.
			
			//...
			String word = scan.nextLine();
			fw.write(word);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
		
		
		
	}
}
