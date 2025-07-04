package com.wipro.exception;

public class NullStudentObjectException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
		return "object is null";
	}
	
}
