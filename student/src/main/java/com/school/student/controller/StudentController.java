package com.school.student.controller;

import com.school.student.entity.Student;
import com.school.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

  @Autowired
  private StudentService service;

  @GetMapping("/findall")
  public List<Student> findAllController() {
    return service.findAllService();
  }

}
