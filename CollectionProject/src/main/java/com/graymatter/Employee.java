package com.graymatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString

public class Employee implements Comparable<Employee>, Cloneable {
	
	private String empName;
	private int empId;
	private double salary;
	private String city;
	
	public Employee() {
		super();
	}
	
public Employee(String empName, int empId, double salary, String city) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
		this.city = city;
	}


public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}


@Override
public String toString() {
	return "Employee [empName=" + empName + ", empId=" + empId + ", salary=" + salary + ", city=" + city + "]";
}

@Override
public int compareTo(Employee o) {
	Employee e = new Employee();
	e = (Employee)o;
	
//	return this.getEmpId()-e.getEmpId(); //Sorting on basis of Employee ID
//	return this.getEmpName().compareTo(e.getEmpName()); //Sorting on basis of Employee Name
	return (int) (this.getSalary()-e.getSalary()); //Sorting on basis of Salary
	
	}

@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

}


