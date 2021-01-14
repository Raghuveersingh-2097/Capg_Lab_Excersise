package com.cg.exception_lab.exception;

public class InvalidNameException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	/**
	 * Create InvalidNameException object without error message
	 */
	public InvalidNameException() {
		super();
	}
	/**
	 * Create InvalidNameException object with error message
	 */
	public InvalidNameException(String errMsg){
		super(errMsg);
	}

}
