package com.employee;
import com.employee.Bean;
public class Service {
	Dao dao= new Dao();
	public void addEmployeeDetails(Bean add) {
		Bean refadd = calculateinsurance(add);
		dao.datastoreaddemp(refadd);
	}
	public void retrieveEmployeeDetails(Bean retrieve) {
		dao.dataStoreRetEmp(retrieve);		 
	}
	public void deleteEmployeeService(Bean delete) {
		dao.dataStoreDelete(delete);
	}
	 
	public Bean calculateinsurance(Bean parker) {
		float salary= parker.getSalary();
		float insuranceamt=0;
		if(salary>0&&salary<5000) {
			insuranceamt =(float)(salary*0.05);
		}
		else if(salary>5000&&salary<10000) {
			insuranceamt = (float)(salary*0.10);
		}
		else if(salary>10000) {
			insuranceamt=(float)(salary*0.15);
		}
		else {
			System.out.println("Entered valid salary.");
		}
		parker.setInsuranceamt(insuranceamt);
		return parker;
		
	}

}
