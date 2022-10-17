package oopWithNLayerApp.dataAccess;

import oopWithNLayerApp.entities.Course;

public class JdbsCourseDao implements CourseDao{
	public void add(Course course) {
		System.out.println("Jdbs ile veritabanına eklendi");
	}
}
