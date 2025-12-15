package ssch51;

public class HelloRun {

	public void go() {
		HelloWorld1 hello1 = new HelloWorld1();
		hello1.print();

		HelloWorld1 hello2 = new HelloWorld1("My Hello World!!");
		hello2.print();

		HelloWorld1 hello3 = new HelloWorld1("Hello",2);
		hello3.print();

		hello2.setMsg("반갑습니다!!");
		System.out.println(hello2.getMsg());

		HelloWorld1.prefix = "Greetings: ";
		hello2.print();
		hello3.print();
		HelloWorld1.prefix = "인사말: ";
		hello2.print();
		hello3.print();	
	}
	
	public static void main(String[] args) {
		HelloRun hr = new HelloRun();
		hr.go();
	}
}