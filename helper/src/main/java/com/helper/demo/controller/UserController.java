package com.helper.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.helper.demo.model.Courses;
import com.helper.demo.model.HelperDetails;
import com.helper.demo.model.UserDetails;
import com.helper.demo.service.Service;

@RestController
public class UserController {
	
	@Autowired
	private Service service;
	
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	
@GetMapping("/home")
public String home(){
	return "this is home";
}

@GetMapping("/courses")
public List<Courses> getAllCourses(){
	
	return this.service.getAllCourses();
}
@GetMapping("/course/{cid}")
public Optional<Courses> getCourse(@PathVariable String cid){
	
	return this.service.getCourse(Integer.parseInt(cid));
}
@PostMapping("/courses")
public Courses createCourse(@RequestBody Courses courses){
	return this.service.createCourse(courses);
}
@PutMapping("/courses")
public Courses updateCourse(@RequestBody Courses courses){
	return this.service.updateCourse(courses);
}
@DeleteMapping("/course/{cid}")
public String removeCourse(@PathVariable String cid){
	
	return this.service.removeCourse(Integer.parseInt(cid));
}

/////////////////////////user section///////////////////////////

@GetMapping("/users")
public List<UserDetails> getAllUsers(){
	return this.service.getAllUsers();
}

@PostMapping("/users")
public UserDetails createUser(@RequestBody UserDetails userDetails){
	return this.service.createUser(userDetails);
}

///////////////////////helper section//////////////////////

@GetMapping("/helpers")
public List<HelperDetails> getAllHelper(){
	return this.service.getAllHelper();
}

@PostMapping("/helpers")
public HelperDetails createHelper(@RequestBody HelperDetails helperDetails){
	
	UserDetails userDetails=ac.getBean(UserDetails.class);
	userDetails.setUserid(2);
	helperDetails.setUserDetails(userDetails);
	return this.service.createHelper(helperDetails);
}



}
