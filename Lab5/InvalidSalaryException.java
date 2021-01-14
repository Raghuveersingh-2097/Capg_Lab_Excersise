package com.cg.exception_lab.exception;

public class InvalidSalaryException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	/**
	 * Create InvalidSalaryException object without error message
	 */
	public InvalidSalaryException() {
		super();
	}
	/**
	 * Create InvalidSalaryException object with error message
	 */
	public InvalidSalaryException(String errMsg){
		super(errMsg);
	}
}
