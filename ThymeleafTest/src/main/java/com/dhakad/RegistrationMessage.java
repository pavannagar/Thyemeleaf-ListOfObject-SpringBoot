package com.dhakad;

public class RegistrationMessage {

	private String message;
	private String type;
	
	public RegistrationMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistrationMessage(String message, String type) {
		super();
		this.message = message;
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "RegistrationMessage [message=" + message + ", type=" + type + "]";
	}
	
}
