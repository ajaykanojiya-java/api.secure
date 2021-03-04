package com.westernunion.assignment.models;

public class Request {
	
	private String blob;
	private String threat_mate;
	private String client_ip;
	private String auth_token;
	
	
	public Request() {
		super();
	}

	public Request(String blob, String threat_mate, String client_ip, String auth_token) {
		super();
		this.blob = blob;
		this.threat_mate = threat_mate;
		this.client_ip = client_ip;
		this.auth_token = auth_token;
	}
	
	public String getBlob() {
		return blob;
	}
	public void setBlob(String blob) {
		this.blob = blob;
	}
	public String getThreat_mate() {
		return threat_mate;
	}
	public void setThreat_mate(String threat_mate) {
		this.threat_mate = threat_mate;
	}
	public String getClient_ip() {
		return client_ip;
	}
	public void setClient_ip(String client_ip) {
		this.client_ip = client_ip;
	}
	public String getAuth_token() {
		return auth_token;
	}
	public void setAuth_token(String auth_token) {
		this.auth_token = auth_token;
	}
	

}
