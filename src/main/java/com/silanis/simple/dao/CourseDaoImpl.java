package com.silanis.simple.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.silanis.simple.domain.Course;



public class CourseDaoImpl implements CourseDao{

	private static final SessionFactory sessionFactory;
	static
	{
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	public void create(List<Course> listCourses) {
		Session session	=sessionFactory.openSession();
		session.getTransaction().begin();
		for(Course course: listCourses)
		{
			session.save(course);
		}
		session.getTransaction().commit();
	}

	public List findAll() {
		Session session	=sessionFactory.openSession();
		List<Course> list = session.createQuery("From Course").list();
		return list;
	}

}
