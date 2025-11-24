enum Cards {
	
	HEART(100), CLUB(200), SPADE(300), DIAMOND(400);
	private int val;
	
	Cards(int v) { val = v; }
	
	int getVal( ) { return val; }
}

public class Code271 {
	
	public static void main(String[] args) {
//		Cards cd;
		System.out.println("Value of SPADE : " + Cards.SPADE.getVal( ));
		System.out.println("-------------------");
		System.out.println("All values of Cards");
		for (Cards c : Cards.values( ))
			System.out.println(c + " value : " + c.getVal( ));
	}
}