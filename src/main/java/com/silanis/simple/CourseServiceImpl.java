package com.silanis.simple;

import java.util.List;

public class CourseServiceImpl implements CourseService {
	CourseDao courseDao;
	
	public CourseDao getCourseDao() {
		return courseDao;
	}

	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	@Override
	public void processCourse(List<Course> courses) {
		getCourseDao().create(courses);
		List<Course> list=getCourseDao().findAll();
		System.out.println("The saved courses are -->" + list);
		
		for(Course course: list)
		{
			System.out.println("Id: " + course.getId() + "  Name: " + course.getName() + "  Course: " + course.getCourse());
				
		}
	}

}
