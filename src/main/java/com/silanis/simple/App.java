package com.silanis.simple;

import java.util.ArrayList;
import java.util.List;

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
        List<Course> courses = new ArrayList<Course>(10);
        Course c1 = new Course("John","Java");
        courses.add(c1);
        Course c2= new Course("Peter", "Hibernate");
        courses.add(c2);
        
        CourseService service = new CourseServiceImpl();
        service.processCourse(courses);
    }
}
