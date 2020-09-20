import java.util.*;
class Employee
{
	private int year;
	private int salary;
	private String name;
	private String address;
	
	public void readData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name Of Employee");
		name=sc.nextLine();
		
		System.out.println("Enter Year Of Joining");
		year=sc.nextInt();
		
		System.out.println("Enter Salary Of Employee");
		salary=sc.nextInt();
		
		String s=sc.nextLine();
		System.out.println("Enter Address Of Employee");
		address=sc.nextLine();
	}
	
	public void display()
	{
		System.out.println(name+"\t\t\t"+year+"\t\t\t"+salary+"\t\t\t"+address);
	}
}

class EmployeeDemo
{
	public static void main(String args[])
	{
		Employee e1,e2,e3;
		e1=new Employee();
		e2=new Employee();
		e3=new Employee();
		
		System.out.println("Details of First Employee ");
		e1.readData();
		
		System.out.println("Details of Second Employee ");
		e2.readData();
		
		System.out.println("Details of Third Employee ");
		e3.readData();
		
		System.out.println("NAME"+"\t\t"+"YEAR OF JOINING"+"\t\t\t"+"SALARY"+"\t\t\t"+"ADDRESS");
		e1.display();
		e2.display();
		e3.display();
	}
}