package com.lm.manage.service.impl;

import com.lm.manage.dao.StudentMapper;
import com.lm.manage.domain.Student;
import com.lm.manage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Title: StudentServiceImpl
 *@Author:LiMan
 *@Date:2018/3/5 10:02
 *@Description: 
 */
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentMapper studentMapper;

    @Override
    public int deleteByPrimaryKey(Long studentId) {
        return studentMapper.deleteByPrimaryKey(studentId);
    }

    @Override
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    @Override
    public Student selectByPrimaryKey(Long studentId) {
        return studentMapper.selectByPrimaryKey(studentId);
    }

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }
}
