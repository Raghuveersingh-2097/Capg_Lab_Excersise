package com.cg.exception_lab.customexception;

import java.util.Scanner;

import com.cg.exception_lab.domain.ExceptionInfo;
import com.cg.exception_lab.exception.*;

public class EmployeeServiceImpl extends ExceptionInfo implements EmployeeService {
	ExceptionInfo inf=new ExceptionInfo();
/**
*-----------------------------------------Method to check the validity of age---------------------------------------*
**/
	@Override
	public void age_validation(int age)throws InvalidAgeException{
		int age1=age;
		if(age1<15){
			throw new InvalidAgeException("Your age is not valid");
}
		else
		{
			System.out.println(age1+" is valid age.");
}
}
/**
*-----------------------------------------Method to check the validity of Name on the basis of surname of first name---------------------------------------*
**/
	@Override
	public void name_validation(String name,String surname)throws InvalidNameException{
	String name1=name;
	String surname1=surname;
	        if(name1==""|| surname1=="") {
		throw new InvalidNameException("Your name is not valid");
}
	        else
	        {
		System.out.println("Your name is valid");
}
}
/**
*-----------------------------------------Method to check the validity of salary on the basis of certain amount---------------------------------------*
**/
	@Override
	public void salary_validation(double salary)throws InvalidSalaryException{
	double salary1=salary;
		if(salary<10000) {
			throw new InvalidSalaryException("Your Salary is not Valid");
}
		else {
			System.out.println(salary1+" is valid salary.");
}
}
}
