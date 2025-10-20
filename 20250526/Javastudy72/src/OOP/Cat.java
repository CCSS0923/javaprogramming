package OOP;

public class Cat {
	String breed;
	String color;
	int age;
	double weight;
	
	Cat(){
		System.out.println("Cat 기본 생성자 호출");
	}
	
	void eat() {
		System.out.println("고양이 먹이를 먹다");
	}
	void scratch() {
		System.out.println("발톱으로 할퀴다");
	}
	void meow() {
		System.out.println("야옹~");
	}
}
