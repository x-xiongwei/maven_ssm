package com.maven.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.ssm.dao.StudentDao;
import com.maven.ssm.po.Student;

@Service 
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> selectAll() {
		return studentDao.selectAll();
	}

}
