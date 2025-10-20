package abs2;

interface Papa { public void genderFather(); }
interface Mama { public void genderMother(); }

class Baby implements Papa, Mama {
	public void genderFather() { System.out.println("나는 아버지 !"); }
	public void genderMother() { System.out.println("나는 어머니 !"); }
	public void printInfo() { System.out.println("나는 아기입니다."); }
}

public class Ex06 {

	public static void main(String[] args) {
		Baby b = new Baby();
		b.genderFather();
		b.genderMother();
		b.printInfo();

	}

}
