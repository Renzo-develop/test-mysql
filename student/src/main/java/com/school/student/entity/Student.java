package com.school.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Student {
  @Id
  private Integer id;

  private String name;
  private int age;
}
