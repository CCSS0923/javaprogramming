//class NumberThread extends Thread {
//	
//	public void run( ) {
//		for (int i = 1; i<=26; i++) {
//			System.out.print(i + "  ");
//			try {
//				Thread.sleep(100); 
//				// 1초(1000ms) 동안 쉬었다가 수행
//			} catch (InterruptedException e) {
//				System.out.println(e.getMessage( ));
//			}
//		}
//	}
//}
//
//public class Code252 {
//	
//	public static void main(String[] args)
//	{
//		Thread t = new NumberThread( );
//		t.start( );
//		for (char ch = 'A'; ch <= 'Z'; ch++) {
//			System.out.print(ch + " ");
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				System.out.println(e.getMessage( ));
//			}
//		}
//	}
//}