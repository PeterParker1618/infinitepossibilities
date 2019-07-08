package com.employee;

public class Bean {
	int id;
	String name;
	float salary, insuranceamt;
	public Bean(int id)
	{
		 this.id=id;
	 }
	 public Bean(int id, String name,float salary)
	 {
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
	 }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getInsuranceamt() {
		return insuranceamt;
	}
	public void setInsuranceamt(float insuranceamt) {
		this.insuranceamt = insuranceamt;
		
	}
	@Override
	public String toString() {
		return "Bean [id=" + id + ", name=" + name + ", salary=" + salary + ", insuranceamt=" + insuranceamt + "]";
	}

}
