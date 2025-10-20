import java.util.Scanner;


public class a20250512 {

	public static void main(String[] args) {
		int num;

	    System.out.print("정수를 입력 하세요 : ");
	    Scanner n = new Scanner(System.in);
	    num = n.nextInt();


	    for(int i=0; i<num; i++)
	    {
	        for(int k=i; k<(num-1); k++)
	        {
	        	System.out.print(" ");
	        }
	        for(int k=0; k<=(i*2); k++)
	        {
	        	System.out.print("*");
	        }
	        System.out.print("\n");

	    }
	    for(int i=(num-2); i>=0; i--)
	    {
	        for(int k=i; k<(num-1); k++)
	        {
	        	System.out.print(" ");
	        }
	        for(int k=0; k<=(i*2); k++)
	        {
	        	System.out.print("*");
	        }
	        System.out.print("\n");

	    }

	}

}
