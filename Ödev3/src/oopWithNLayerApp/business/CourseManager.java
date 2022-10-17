package oopWithNLayerApp.business;

import java.util.List;
import oopWithNLayerApp.core.logging.Logger;
import oopWithNLayerApp.dataAccess.CourseDao;
import oopWithNLayerApp.dataAccess.HibernateCourseDao;
import oopWithNLayerApp.dataAccess.JdbsCourseDao;
import oopWithNLayerApp.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager (CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		if(course.getPrice()<0) {
			throw new Exception("Kursun fiyatı 10'dan küçük olamaz" + course.getCoursename());
		}
		
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.Log(course.getCoursename());
		}
	}
}
