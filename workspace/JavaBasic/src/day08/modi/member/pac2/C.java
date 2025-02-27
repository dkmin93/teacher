package day08.modi.member.pac2;

import day08.modi.member.pac1.A;

public class C {
	
	A a = new A(1); //public
//	A a2 = new A("홍길동"); //default (X)
//	A a3 = new A(true); //private (X)
	
	
	public C() {
		A a4 = new A();
		a4.a = 1; //public
		//a4.b = 1; //default (X)
		//a4.c = 1; //private (X)
		
		a4.method01();
		//a4.method02(); //default (X)
		//a4.method03(); //private (X)
	}
	
	
	
	
}
