package com.westernunion.assignment.service;

import org.springframework.data.repository.CrudRepository;

import com.westernunion.assignment.models.Task;

public interface WUCrudRepository  extends CrudRepository<Task, Integer>{

}
