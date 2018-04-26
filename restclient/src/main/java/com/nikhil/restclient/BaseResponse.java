package com.nikhil.restclient;

public class BaseResponse {

	private String status;
	private Integer code;
	private boolean userFound;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
	public boolean isUserFound() {
		return userFound;
	}

	public void setUserFound(boolean userFound) {
		this.userFound = userFound;
	}

	@Override
	public String toString() {
		return "BaseResponse [status=" + status + ", code=" + code + ", userFound=" + userFound + "]";
	}
	
}
