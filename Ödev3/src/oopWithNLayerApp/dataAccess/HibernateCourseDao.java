package oopWithNLayerApp.dataAccess;

import oopWithNLayerApp.entities.Course;
import oopWithNLayerApp.entities.Instructor;

public class HibernateCourseDao implements CourseDao{
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanına eklendi");
	}
}
