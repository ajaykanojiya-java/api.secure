package com.westernunion.assignment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.westernunion.assignment.models.Request;
import com.westernunion.assignment.models.Task;

public class WUCrudService {

	@Autowired
	WUCrudRepository crudRepository;
	
	public Task saveTask(Request request) {
		Task task = new Task();
		task.setType("THREAT_MATE");
		task.setTask_token(request.getBlob());
		Task savedTask = crudRepository.save(task);
		return savedTask;
	}
	
	public Task updateTask(Request request,int id) {
		Optional<Task> task = crudRepository.findById(id);
		if(!task.isPresent())
			return null;
		else
			return task.get();
	}
	
}
