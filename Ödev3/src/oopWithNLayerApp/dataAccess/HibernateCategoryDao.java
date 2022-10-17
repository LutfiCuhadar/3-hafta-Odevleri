package oopWithNLayerApp.dataAccess;

import java.util.Locale.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(oopWithNLayerApp.entities.Category category) {
		System.out.println("Hibernate ile veritabanına eklendi");
		
	}



}
