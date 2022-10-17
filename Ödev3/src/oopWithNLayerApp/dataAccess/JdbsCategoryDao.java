package oopWithNLayerApp.dataAccess;

import java.util.Locale.Category;

public class JdbsCategoryDao implements CategoryDao{

	@Override
	public void add(oopWithNLayerApp.entities.Category category) {
		System.out.println("Jdbs ile veritabanına eklendi");
		
	}

	

}
