package ssi;

class Friend{
	String name;
	int age;
	Friend(){}
	Friend(String n, int a){
		this.name = n;
		this.age = a;
	}
	void printFriend() {
		System.out.println(name + " , " + age);
	}
}

public class Test02 {

	public static void main(String[] args) {
		Friend f = new Friend("ȫ�浿", 25);
		f.printFriend();

	}

}
