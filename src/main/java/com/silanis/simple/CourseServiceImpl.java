package com.silanis.simple;

import java.util.List;

public class CourseServiceImpl implements CourseService {

	@Override
	public void processCourse(List<Course> courses) {
		CourseDao dao = new CouseDaoImpl();
		dao.create(courses);
		List<Course> list=dao.findAll();
		System.out.println("The saved courses are -->" + list);
		
		for(Course course: list)
		{
			System.out.println("Id: " + course.getId() + "  Name: " + course.getName() + "  Course: " + course.getCourse());
				
		}
	}

}
