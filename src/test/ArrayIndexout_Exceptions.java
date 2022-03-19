package test;

public class ArrayIndexout_Exceptions {

	public static void main(String[] args) {
int num =10;
		
		int[] array1 = {5,67,234,78}; // Array Index Out of Bound Exceptions
		
		try {
			int result = num/0;
			//System.out.println(array1[10]);
			
		}catch(ArithmeticException e) {
			
			System.out.println("inside ArithmeticException");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("inside ArrayIndexOutOfBoundsException");
			
		} catch (Exception e) {
			
			System.out.println("inside default exception");
			
		} finally {
			
			System.out.println("inside finally");
		}
		
		System.out.println("after try and catch");
		

	}

}

	
