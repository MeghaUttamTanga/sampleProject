package com.property.assignment.exception;

public class DataNotFoundException extends RuntimeException{
	
	String Errorcode;
	String Errormesaage;
	
	
	public DataNotFoundException(String errorCode, String errorMesaage) {
		super();
		Errorcode = errorCode;
		Errormesaage = errorMesaage;
	}
	
	

}
