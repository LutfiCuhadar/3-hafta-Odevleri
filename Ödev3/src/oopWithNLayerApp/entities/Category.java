package oopWithNLayerApp.entities;

public class Category {
	private String categoryname;

	public Category() {
	
	}

	public Category(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getCategoryname() {
		return categoryname;
	}

	private void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
}
