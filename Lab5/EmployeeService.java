package com.cg.exception_lab.customexception;

import com.cg.exception_lab.exception.*;

public interface EmployeeService {
	void age_validation(int age ) throws InvalidAgeException; 
    void name_validation(String name,String surname ) throws InvalidNameException;
    void salary_validation(double salary)throws InvalidSalaryException;
}