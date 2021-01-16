package com.powernode.springboot.web.controller;

import com.powernode.springboot.model.Student;
import com.powernode.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StuCtrl {

    @Resource
    private StudentService studentService;

    @RequestMapping("getById")
    public @ResponseBody Student queryStu(Integer id){
        return studentService.queryStu(id);
    }

    @RequestMapping("add")
    public @ResponseBody String insert(){
        Student student = new Student();
        student.setName("明天");
        student.setAge(20);
        int rows = 0;
        rows = studentService.insert(student);
        if (rows>0){
            return "成功";
        }
        return "no";
    }

}
