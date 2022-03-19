package test;

import java.util.Scanner;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Age");
		
		int age = scanner.nextInt();
		
		if (age>=18)
		{
			System.out.println("You are Eligible for Voting");
		}
		else if(age == 17) 
		{
			System.out.println("You are not Eligible for Voting, try doing next year");
		}
		else 
		{
			int eligibleYear = 18-age;
			
			System.out.println("You are not Eligible for Voting for this Year, try after" + eligibleYear);
		}

		scanner.close();
	}

}
