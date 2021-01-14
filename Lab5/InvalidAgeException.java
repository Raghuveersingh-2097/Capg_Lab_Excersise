package com.cg.exception_lab.exception;

public class InvalidAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create InvalidAgeException object without error message
	 */
	public InvalidAgeException() {
		super();
	}
	/**
	 * Create InvalidAgeException object with error message
	 */
	public InvalidAgeException(String errMsg){
		super(errMsg);
	}

}

