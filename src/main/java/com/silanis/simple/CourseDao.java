package com.silanis.simple;

import java.util.List;

public interface CourseDao {
  public void create(List<Course> listCourses);
  public List findAll();
}
