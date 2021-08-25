package com.helper.demo.service;

import java.util.List;
import java.util.Optional;

import com.helper.demo.model.Courses;
import com.helper.demo.model.HelperDetails;
import com.helper.demo.model.UserDetails;

public interface Service {

	public List<Courses> getAllCourses();
	public Optional<Courses> getCourse(int cid);
	public Courses createCourse(Courses courses);
	public Courses updateCourse(Courses courses);
	public String removeCourse(int cid);
	
	
	public List<UserDetails> getAllUsers();
	public List<HelperDetails> getAllHelper();
	public UserDetails createUser(UserDetails userDetails);
	public HelperDetails createHelper(HelperDetails helperDetails);
}
