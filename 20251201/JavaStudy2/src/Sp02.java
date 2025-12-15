
public class Sp02 {

	String msg;
	public Sp02() {
		msg = "Hello World !!";
	}
	
	public Sp02(String msg)  {
		this.msg = msg;
	}

	public Sp02(String msg, int option)  {
		if (option == 1)
			this.msg = msg;
		else if (option == 2)
			this.msg = msg + " , 안녕하세요?";
	}
	
	public void print() {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		Sp02 h1 = new Sp02();
		h1.print();
		
		Sp02 h2 = new Sp02("Hello ~");
		h2.print();
		
		Sp02 h3 = new Sp02("Ni Hao", 1);
		h3.print();
		
		Sp02 h4 = new Sp02("Ni Hao", 2);
		h4.print();

		Sp02 h5 = new Sp02("Ni Hao", 3);
		h5.print();
		
		Sp02 h6 = new Sp02("반갑습니다 ~");
		h6.print();
	}
}