package shop;

public class ShopLauncher {

	// 프로그램 메인
	public static void main(String[] args) {

		IShop shop = new MyShop();
		shop.setTitle("MyShop");
		
		shop.genUser();
		shop.genProduct();
		shop.start();
	}
}