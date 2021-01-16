package com.powernode.springboot.service;

import com.powernode.springboot.model.Student;

public interface StudentService {
    Student queryStu(Integer id);

    int insert(Student student);
}
