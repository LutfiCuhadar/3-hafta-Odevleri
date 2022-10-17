package oopWithNLayerApp;

import oopWithNLayerApp.business.CategoryManager;
import oopWithNLayerApp.business.CourseManager;
import oopWithNLayerApp.business.InstructorManager;
import oopWithNLayerApp.core.logging.DatabaseLogger;
import oopWithNLayerApp.core.logging.FileLogger;
import oopWithNLayerApp.core.logging.Logger;
import oopWithNLayerApp.core.logging.MailLogger;
import oopWithNLayerApp.dataAccess.HibernateCategoryDao;
import oopWithNLayerApp.dataAccess.HibernateCourseDao;
import oopWithNLayerApp.dataAccess.HibernateInstructorDao;
import oopWithNLayerApp.dataAccess.InstructorDao;
import oopWithNLayerApp.dataAccess.JdbsCategoryDao;
import oopWithNLayerApp.dataAccess.JdbsCourseDao;
import oopWithNLayerApp.dataAccess.JdbsInstructorDao;
import oopWithNLayerApp.entities.Category;
import oopWithNLayerApp.entities.Course;
import oopWithNLayerApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		System.out.println("-Kurs-");
		
		CourseManager courseManager = new CourseManager(new JdbsCourseDao(), loggers);  
		Course course1 = new Course("Java Kampı", 10.0);
		courseManager.add(course1);
		
		System.out.println("---------------------------------------");
		
		System.out.println("-Eğitmen-");
		
		InstructorManager ınstructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		Instructor ınstructor1 = new Instructor("Engin","Demiroğ");
		ınstructorManager.add(ınstructor1);	
	
		System.out.println("---------------------------------------");
		
		System.out.println("-Eğitim Türü-");
		
		CategoryManager categoryManager = new CategoryManager(new JdbsCategoryDao(), loggers);
		Category category = new Category("Programlama");
		categoryManager.add(category);
	}

}





