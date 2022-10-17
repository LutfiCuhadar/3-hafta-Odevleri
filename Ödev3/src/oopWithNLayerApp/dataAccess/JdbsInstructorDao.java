package oopWithNLayerApp.dataAccess;

import oopWithNLayerApp.entities.Instructor;

public class JdbsInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbs ile veritabanına eklendi");
		
	}

}
