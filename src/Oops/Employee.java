package Oops;

public class Employee {

	
		// TODO Auto-generated method stub
		
	public String Name;
	public int EmployeeId;
	public static int Salary;
	public static String CompanyName = "Infosys";
	
	Employee() {
	
	}
	
	public Employee(String Name,int EmployeeId,int Salary){
		this.Name = Name;
		this.EmployeeId = EmployeeId;
		Employee.Salary= Salary;
	}
	public Employee(String Name,int EmployeeId){
		this.Name = Name;
		this.EmployeeId = EmployeeId;
	}
	public void PrintName(){
		System.out.println("Name of Emp is " + this.Name);
	}
	public void PrintSalary(){
		System.out.println("Name of Emp is " + Employee.Salary); //static can be accessed through Class name itself bcoz separate memory allocated to that/Bigger size employee salary can access thru that
	}
	public static void ChangeCompanyName() {
		
		Employee.CompanyName = "Infosys Technology";
	}

}
