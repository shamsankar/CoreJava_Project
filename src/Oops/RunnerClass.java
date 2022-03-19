package Oops;

import java.util.jar.Attributes.Name;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*Employee emp1 = new Employee();
		
		emp1.Name = "Sachin";
		emp1.EmployeeId = 11111;
		emp1.Salary = 20000;
		
		
		Employee emp2 = new Employee();
		
		emp1.Name = "Mahesh";
		emp1.EmployeeId = 2222;
		emp1.Salary = 30000;*/
		
		Employee emp1 = new Employee("Sachin",1111,20000);
		Employee emp2 = new Employee("Mahesh",2222,30000);
	
		emp1.PrintName();
		emp2.PrintName();
		
		Employee emp3 = new Employee("Rahul",33333);
		emp3.PrintName();

		//Employee emp4 = new Employee();
		
		//Person per1=new Person();
		
		ChildClass child1 = new ChildClass("Rahul",30,"Actor");
		
		MethodOverloadingExample obj = new MethodOverloadingExample();
		obj.sum(5,4);
		obj.sum(5, 4,3);
		
		ICICIBank bank1= new ICICIBank();
		bank1.CreditCard();
		bank1.Welcome();
		
		EncapsulationExample obj10 = new EncapsulationExample();
		obj10.setName("Rohit");
		System.out.println(obj10);
		
	}

}
