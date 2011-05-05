package com.silanis.simple.dao;

import java.util.List;

import com.silanis.simple.domain.Course;


public interface CourseDao {
  public void create(List<Course> listCourses);
  public List findAll();
}
