package test;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while loop to print 1-10
		int num1 = 1;
		
		while(num1<=10);
		{
			if (num1==5) 
			 {
				num1 = num1+1;
				//continue;
			}
			
			System.out.println(num1);
			num1 = num1+1;	
			
		}
		
		// For Loop to type 1 to 10
		
		for(int count=1;count<=10;count++) {
			
			if(count==5) {
				break;
			}
			
			System.out.println("inside for loop " + count);
		}
		
		// for loop Print 10 to 1

		for(int count=10;count>=1;count--) 
		{
		
			System.out.println("the Couunt Value= " + count);
			
		}
		
		//Array with Loop
		int[] array1 = {10,20,30,40};
		for(int index=0; index<array1.length;index++)
		{
			System.out.println("Value inside Arrau " + array1[index]);
		}
		
		// for Each Loop
		for (int var1:array1)
		{
			System.out.println(var1);
		}
			
		
	}

}
