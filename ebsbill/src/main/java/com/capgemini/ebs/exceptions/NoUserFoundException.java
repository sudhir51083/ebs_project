package com.capgemini.ebs.exceptions;

public class NoUserFoundException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public NoUserFoundException(String errorMessage) {
        super(errorMessage);
    }
}
