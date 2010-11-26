package com.silanis.simple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
/**
 * @author zluo
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
    	ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
    	
        List<Course> courses = new ArrayList<Course>(10);
        Course c1 = new Course("John","Java");
        courses.add(c1);
        Course c2= new Course("Peter", "Hibernate");
        courses.add(c2);
        
        CourseService service = (CourseService) ctx.getBean("courseService");
        service.processCourse(courses);
    }
}
