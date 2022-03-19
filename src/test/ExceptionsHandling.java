package test;

public class ExceptionsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arithmatic Exception
		
		int num = 10;
		try
		{
			int result = num/10;
		}
		catch(Exception e)
		{
			System.out.println("Inside the Catch Block");
		}
		
		System.out.println("Outside the try and Catch Block");
		
	}

}
