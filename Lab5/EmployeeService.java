package com.cg.exception_lab.customexception;

import com.cg.exception_lab.exception.*;

public interface EmployeeService {
/**
*-----------------------------------------Check the validity of age---------------------------------------*
**/	
	void age_validation(int age ) throws InvalidAgeException; 
/**
*-----------------------------------------Check the validity of name---------------------------------------*
**/
    void name_validation(String name,String surname ) throws InvalidNameException;
/**
*-----------------------------------------Check the validity of salary---------------------------------------*
**/
    void salary_validation(double salary)throws InvalidSalaryException;
}
