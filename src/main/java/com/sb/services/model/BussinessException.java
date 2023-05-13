package com.sb.services.model;

public class BussinessException extends RuntimeException {
	
	private BussinesError error;
	
	public BussinessException(BussinesError error, String errorMessage, Throwable err) {
		super(errorMessage, err);
		this.error=error;
	}

	public BussinesError getError() {
		return error;
	}

	public void setError(BussinesError error) {
		this.error = error;
	}
	
	
}
