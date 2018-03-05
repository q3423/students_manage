package com.lm.manage.service;

import com.lm.manage.domain.Student;

import java.util.List;

/**
 *@Title: StudentService
 *@Author:LiMan
 *@Date:2018/3/5 10:04
 *@Description: 
 */
public interface StudentService {
    int deleteByPrimaryKey(Long studentId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long studentId);

    List<Student> selectAll();

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}
