package com.westernunion.assignment.models;

import java.util.Date;

public class Response {

	private Date created_at;
	private Date expiring_at;
	private String type;
	private Date updated_at;
	private String task_token;
	private String status;
	private String msg;
	
	private String client_ip;
	private String auth_token;
	
	
	public Response() {
		super();
	}
	public Response(Date created_at, Date expiring_at, String type, Date updated_at, String task_token,
			String client_ip, String auth_token) {
		super();
		this.created_at = created_at;
		this.expiring_at = expiring_at;
		this.type = type;
		this.updated_at = updated_at;
		this.task_token = task_token;
		this.client_ip = client_ip;
		this.auth_token = auth_token;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getExpiring_at() {
		return expiring_at;
	}
	public void setExpiring_at(Date expiring_at) {
		this.expiring_at = expiring_at;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public String getTask_token() {
		return task_token;
	}
	public void setTask_token(String task_token) {
		this.task_token = task_token;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
