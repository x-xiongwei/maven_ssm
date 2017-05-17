package com.maven.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maven.ssm.po.Student;
import com.maven.ssm.service.StudentService;

@Controller 
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/findAll.action")
	public String findAll(Model mdoel){
		List<Student> student = studentService.selectAll();
		mdoel.addAttribute("stu", student);
		return "stuList";
	}
	
}
