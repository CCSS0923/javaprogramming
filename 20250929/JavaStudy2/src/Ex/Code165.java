package Ex;

abstract class Person {
	
	private int no;
	private String name;
	
	Person( ){}
	
	Person(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	int getNo( ) {
		return no;
	}
	
	String getName( ) {
		return name;
	}
	
	abstract void show( );
}


class Teacher extends Person {
	
	private String subject;
	
	Teacher( ){}
	
	Teacher(int no, String name, String subject) {
		super(no, name);
		this.subject = subject;
	}
	
	void show( ) {
		System.out.println("선생님 정보");
//		System.out.println("-------------------");
		System.out.println("teacher_id : " + getNo( ));
		System.out.println("name : " + getName( ));
		System.out.println("subject : " + this.subject);
	}
}

class Student extends Person {
	
	private int year;
	
	Student( ){}
	
	Student(int no, String name, int year) {
		super(no, name);
		this.year = year;
	}
	
	void show( ) {
		System.out.println("학생 정보");
//		System.out.println("-------------------");
		System.out.println("number : " + getNo( ));
		System.out.println("name : " + getName( ));
		System.out.println("year : " + this.year);
	}
}


public class Code165 {
	
	public static void main(String[] args) {
		Person t1 = new Teacher(112, "백두산", "수학");
		Person t2 = new Teacher(115, "한라산", "영어");
		Person s1 = new Student(205, "유한이", 2);
		Person s2 = new Student(207, "춘향이", 1);
		
		t1.show( );
		System.out.println( );
		t2.show( );
		System.out.println( );
		System.out.println("-------------------");
		s1.show( );
		System.out.println( );
		s2.show( );
	}
}