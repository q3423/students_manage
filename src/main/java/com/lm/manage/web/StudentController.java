package com.lm.manage.web;

import com.lm.manage.domain.Student;
import com.lm.manage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *@Title: StudentController
 *@Author:LiMan
 *@Date:2018/3/5 10:08
 *@Description: 
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/students")
    public List<Student> findAll(){
        return studentService.selectAll();
    }
    @GetMapping("/students/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentService.selectByPrimaryKey(id);
    }
    @PostMapping("/students")
    public Long addStudent(@ModelAttribute Student student){
        return studentService.insertSelective(student);
    }
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable("id") Long id){
        studentService.deleteByPrimaryKey(id);
        return "success";
    }



}
