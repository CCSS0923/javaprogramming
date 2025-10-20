package com.section22;

public class Ex333 {

	public static void main(String[] args) {
		System.out.println((int) (Math.random() * 2));
		System.out.println((int) (Math.random() * 5));
		System.out.println((int) (Math.random() * 7));
		System.out.println((int) (Math.random() * 10));
		System.out.println((int) (Math.random() * 100));
		System.out.println((int) (Math.random() * 1000));
		
//		for(int i = 0; i < 6; i++)
//		{
//			for(int j = 0; j < 6; j++)
//			{
//				if(j < 5)
//				{
//					System.out.print("[" + (int) ((Math.random() * 45) + 1) + "] ");
//				}
//				else if(j == 5)
//				{
//					System.out.print("+ [" + (int) ((Math.random() * 45) + 1) + "] ");
//				}
//			}
//			System.out.println();
//		}
		
		int result;
		
		for(int i = 0; i < 5; i++)
			{
				for(int j = 0; j < 6; j++)
				{
					result = (int) ((Math.random() * 45) + 1);
					if(j < 5)
					{
						System.out.print("[");
						if(result < 10)
						{
							System.out.print(result + " ] ");
						}
						else
						{
							System.out.print(result + "] ");
						}
					}
					else if(j == 5)
					{
						System.out.print("+ [");
						if(result < 10)
						{
							System.out.print(result + " ] ");
						}
						else
						{
							System.out.print(result + "] ");
						}
					}
				}
				System.out.println();
			}
		

	}

}
