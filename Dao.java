package com.employee;
import com.employee.Bean;
public class Dao {
	Bean array[]= new Bean[10];
	public void datastoreaddemp(Bean addemp)
	{
		array[0]= addemp;
		System.out.println("employee added successfully with insurance amt."+array[0]);
	}
public void dataStoreRetEmp(Bean retemp) {
	if(array[0]==null) {
		System.out.println("employee not found");
	}
	else {
		if(array[0].getId()==retemp.getId()) {
		
			System.out.println("\n Id:"+" "+array[0].getId()+" \n Employee name: \n "+""+array[0].getName()+"\n Employee salary:"+""+array[0].getSalary()+"\n insurance amt:"+""+array[0].getInsuranceamt());;
		}
		else {
			System.out.println("employee not found");
		}
	}
}
public void dataStoreDelete(Bean delemp) {
	if(array[0]==null) {
		System.out.println("Employee not found");
		
	}
	else {
		if(array[0].getId()==delemp.getId()) {
			array[0]=null;
			System.out.println("Deletion successfull");
		}
		else {
			System.out.println("Employee not found");
		}
	}
}
}
