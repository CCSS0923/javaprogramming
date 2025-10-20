class Student9 {
	private String name;
	private int score;
	
	Student9(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	String getName() {
		return name;
	}
	int getScore() {
		return score;
	}
	
	void print() {
		System.out.println(name + "(" + score + ")");
	}
}

public class Code125 {
	public static void main(String[] args) {
		Student9 st[] = new Student9[5];
		
		st[0] = new Student9("백두산", 87);
		st[1] = new Student9("한라산", 99);
		st[2] = new Student9("금강산", 77);
		st[3] = new Student9("태백산", 91);
		st[4] = new Student9("지리산", 85);
		
		int total = 0;
		for(int i=0; i < st.length; i++) {
			total += st[i].getScore();
			System.out.println(st[i].getName() + " : " + st[i].getScore());
		}
		
		double ave = (double)total / st.length;
		
		System.out.println("평 균 : " + ave);

	}
}