package oopWithNLayerApp.entities;

public class Course {
	private String coursename;
	private double price;
	
	public Course() {

	}
	
	public Course(String name, double price) {
		this.coursename = name;
		this.price = price;
	}

	public String getCoursename() {
		return coursename;
	}

	private void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public double getPrice() {
		return price;
	}

	private void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
