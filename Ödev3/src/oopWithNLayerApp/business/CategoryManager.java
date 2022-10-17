package oopWithNLayerApp.business;

import java.util.ArrayList;
import java.util.List;
import oopWithNLayerApp.core.logging.Logger;
import oopWithNLayerApp.dataAccess.CategoryDao;
import oopWithNLayerApp.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<String> categoryName = new ArrayList<>();
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) {
		if(categoryName.size() == 0) {
			categoryDao.add(category);
			for (Logger logger : loggers) {
				logger.Log(category.getCategoryname());
			}
		} else {
			for (String name : categoryName) {
				if (name.equals(category.getCategoryname())) {
					System.out.println("Aynı kategoriyi birden fazla ekleyemezsiniz !!" + category.getCategoryname());
					break;
				} else {
					categoryDao.add(category);
					for (Logger logger : loggers) {
						logger.Log(category.getCategoryname());
					}
				}
			}
		}
	}
}
