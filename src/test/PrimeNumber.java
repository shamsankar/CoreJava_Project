package test;

public class PrimeNumber {

	private static boolean flag;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 13;
		boolean flag = true;
		
		for (int i=2; i<num/2; i ++)
		{
			int remainder = num%i;
			if(remainder==0) 
			{
				flag = false;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("Num in Prime");
		}
			
		else
			System.out.println("Num in not Prime");
	}

}
