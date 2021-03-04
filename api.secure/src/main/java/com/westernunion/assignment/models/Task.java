package com.westernunion.assignment.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name="TASK")
public class Task {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	
	@Column(name = "TYPE")
	private String type;
	
	@Column(name="TASK_TOKEN")
	private String task_token;
	
	@CreatedDate
	@Column(name="CREATED_AT")
	private Date createdAt;
	
	@LastModifiedDate
	@Column(name="UPDATED_AT")
	private Date updatedAt;

	@Column(name="STATUS")
	private String status = "SAVED";
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTask_token() {
		return task_token;
	}

	public void setTask_token(String task_token) {
		this.task_token = task_token;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
