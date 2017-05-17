package com.maven.ssm.dao;

import java.util.List;

import com.maven.ssm.po.Student;

public interface StudentDao {

	int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);
    
    List<Student> selectAll();

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}
