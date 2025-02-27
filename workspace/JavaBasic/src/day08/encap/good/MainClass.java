package day08.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		//me.setYear(2026);
		me.setYear(2025);
		
		int year = me.getYear();
		System.out.println("년도:" + year);
		
		me.setMonth(1);
		me.setDay(14);
		me.setSsn("1231231231231");
		
		System.out.println( me.getYear()  );
		System.out.println( me.getMonth()  );
		System.out.println( me.getDay()  );
		System.out.println( me.getSsn()  );
		
		
		
		
		
		
	}
}
