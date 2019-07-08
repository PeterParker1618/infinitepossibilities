package com.employee;
import java.util.Scanner;
public class Record {
	Service service= new Service();
	public void Addrecord() {
		Scanner s=new Scanner(System.in);
		System.out.println("*******enter employee details*******");
		System.out.println("id no:");
		int id= s.nextInt();
		System.out.println("Name:");
		String name= s.next();
		System.out.println(" salary");
		float salary=s.nextInt();
		System.out.println("*******************");
		Bean bean= new Bean(id, name, salary);
		service.addEmployeeDetails(bean);
	}
	public void Retrieverecord() {
		Scanner s= new Scanner(System.in);
		System.out.print("enter id to retrieve:");
		int id= s.nextInt();
		Bean bean= new Bean(id);
		service. retrieveEmployeeDetails(bean);
	}
	public void Deleterecord() {
		Scanner s= new Scanner(System.in);
		System.out.println("enter id to delete:");
		int id= s.nextInt();
		Bean bean= new Bean(id);
		service.deleteEmployeeService(bean);
	}

}
