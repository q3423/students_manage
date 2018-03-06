package com.lm.manage.mapper;


import com.lm.manage.domain.Student;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Long studentId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long studentId);

    List<Student> selectAll();

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}