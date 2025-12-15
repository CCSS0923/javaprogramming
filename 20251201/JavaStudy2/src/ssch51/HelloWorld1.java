package ssch51;

public class HelloWorld1 {

	private String msg;
	static int count = 0;
	// int count = 0;
	static String prefix = "♥♡ ";

	public HelloWorld1() {
		msg = "Hello World !!";
	}

	public HelloWorld1(String msg) {
		this.msg = msg;
	}

	public HelloWorld1(String msg, int option) {
		if (option == 1)
			this.msg = msg;
		else if (option == 2)
			this.msg = msg + ", 안녕하세요?";
	}

	public void print() {
		// System.out.println(msg);
		count++;
		System.out.println("[" + count + "] " + prefix + msg);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
