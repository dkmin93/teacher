package day07.inherit.bad;

//상속이 없다면? 비슷한 클래스
public class Student {

	String name;
	int age;
	String studentId;
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
	
}
