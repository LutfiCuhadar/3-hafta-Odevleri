package oopWithNLayerApp.business;

import java.util.ArrayList;
import java.util.List;
import oopWithNLayerApp.core.logging.Logger;
import oopWithNLayerApp.dataAccess.InstructorDao;
import oopWithNLayerApp.entities.Instructor;


public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	private List<String> instructorName = new ArrayList<>();
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) throws Exception {
		if (instructorName.size() == 0) {
			instructorDao.add(instructor);
			for (Logger logger : loggers) {
				logger.Log(instructor.getName() + " " + instructor.getLastName());
			}
		} else {
			for (String name : instructorName) {
				if (name.equals(instructor.getName())) {
					//System.out.println("Aynı Eğitmeni birden fazla ekleyemezsiniz !!" + instructor.getName());
					//break;
					throw new Exception("Aynı eğitmeni birden fazla ekleyemezsiniz !!" + instructor.getName() + instructor.getLastName());
				} else {
					instructorDao.add(instructor);
					for (Logger logger : loggers) {
						logger.Log(instructor.getName() + " " + instructor.getLastName());
					}
				}
			}
		}
	} //add
}
