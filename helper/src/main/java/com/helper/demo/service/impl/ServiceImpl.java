package com.helper.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.helper.demo.dao.CoursesDao;
import com.helper.demo.dao.HelperDetailsDao;
import com.helper.demo.dao.UserDetailsDao;
import com.helper.demo.model.Courses;
import com.helper.demo.model.HelperDetails;
import com.helper.demo.model.UserDetails;
import com.helper.demo.service.Service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service{

	@Autowired
	private CoursesDao cd;
	@Autowired
	private UserDetailsDao ud;
	@Autowired
	private HelperDetailsDao hd;
	
	@Override
	public List<Courses> getAllCourses() {
		return cd.findAll();
	}

	@Override
	public Optional<Courses> getCourse(int cid) {
		return cd.findById(cid);
	}

	@Override
	public Courses createCourse(Courses courses) {
		cd.save(courses);
		return courses;
	}

	@Override
	public Courses updateCourse(Courses courses) {
		cd.save(courses);
		return courses;
	}

	@Override
	public String removeCourse(int cid) {
		cd.deleteById(cid);
		return "course deleted sucessfully";
	}
	
	
////////////////////user section//////////////////////////////////////
	
	@Override
	public List<UserDetails> getAllUsers() {
		return ud.findAll();
	}
	
	@Override
	public UserDetails createUser(UserDetails userDetails) {
		ud.save(userDetails);
		return userDetails;
	}
	
	
	///////////////////helper section///////////////////////////
	
	@Override
	public List<HelperDetails> getAllHelper() {
		return hd.findAll();
	}

	@Override
	public HelperDetails createHelper(HelperDetails helperDetails) {
		hd.save(helperDetails);
		return helperDetails;
	}

	
}
