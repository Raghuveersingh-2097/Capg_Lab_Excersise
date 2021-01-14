package com.cg.assigment.util;

import java.util.*;

import com.cg.exception_lab.customexception.*;
import com.cg.exception_lab.domain.ExceptionInfo;
import com.cg.exception_lab.exception.*;
public class Utill {
	 public static void mains() {
		EmployeeService employeeservice=new EmployeeServiceImpl();
		ExceptionInfo inf=new ExceptionInfo();
		try {
			Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
			employeeservice.age_validation(inf.setAge(age));
		String name=sc.next();
		String surname=sc.next();
			employeeservice.name_validation(inf.setName(name),inf.setSurname(surname));
			double salary=sc.nextInt();
			employeeservice.salary_validation(inf.setSalary(salary));	
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		catch(InvalidNameException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		catch(InvalidSalaryException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}
