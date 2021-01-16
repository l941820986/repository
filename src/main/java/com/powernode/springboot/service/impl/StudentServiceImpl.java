package com.powernode.springboot.service.impl;

import com.powernode.springboot.mapper.StudentMapper;
import com.powernode.springboot.model.Student;
import com.powernode.springboot.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student queryStu(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }
}

