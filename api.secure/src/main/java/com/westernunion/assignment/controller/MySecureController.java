package com.westernunion.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.westernunion.assignment.models.Request;
import com.westernunion.assignment.models.Response;
import com.westernunion.assignment.models.Task;
import com.westernunion.assignment.models.User;
import com.westernunion.assignment.service.WUCrudService;
import com.westernunion.assignment.util.JwtUtil;

@RestController
@RequestMapping(value = "/api/v1")
public class MySecureController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	private WUCrudService crudService;
	
	@Autowired
	private JwtUtil jwtTokenUtil;
	
	    
	@RequestMapping(value = "/saveTask")
	public ResponseEntity<Response> saveTask(@RequestBody Request request) {
		Task task = crudService.saveTask(request);
		Response response = new Response();
		response.setType(task.getType());
		response.setAuth_token(task.getTask_token());
		response.setCreated_at(task.getCreatedAt());
		
		return new ResponseEntity<Response>(response,HttpStatus.CREATED);
	}

	@RequestMapping(value = "/resumeTask/{id}")
	public ResponseEntity<Response> resumeTask(@RequestBody Request request,@PathVariable("id") int id ) {
		Task task = crudService.updateTask(request, id);
		Response response = new Response();
		if(task != null) {
			response.setStatus(task.getStatus());
			response.setMsg("task has been resumed");
		}
		
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody User user) throws Exception {

		try {
			authenticationManager
					.authenticate(new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword()));
		} catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password", e);
		}

		final UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUserName());

		final String jwt = jwtTokenUtil.generateToken(userDetails);

		return ResponseEntity.ok(jwt);
	}
	 

}
