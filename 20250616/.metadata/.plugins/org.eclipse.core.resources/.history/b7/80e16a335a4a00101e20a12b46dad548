package ssi;

class A{
	public String x() { return "A.x"; }
}
class B extends A{
	public String x() { return "B.x"; }
	public String y() { return "B.y"; }
}

public class Test03 {

	public static void main(String[] args) {
		A obja = new A();
		B objb = new B();
		A obj = new B();
		
		System.out.println(obja.x());
		System.out.println(objb.x());
		System.out.println(objb.y());
		System.out.print(obj.x());
		
	}

}
