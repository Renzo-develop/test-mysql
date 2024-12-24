package com.school.student.service;

import com.school.student.entity.Student;
import com.school.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

  @Autowired
  private StudentRepository repository;

  public List<Student> findAllService() {
    List<Student> list = new ArrayList<>();

    repository.findAll().forEach(student -> list.add(student));
    return list;
  }

}
