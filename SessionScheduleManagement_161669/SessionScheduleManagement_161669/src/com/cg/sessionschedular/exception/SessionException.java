package com.cg.sessionschedular.exception;

public class SessionException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public String msg;
	public SessionException(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}
}
