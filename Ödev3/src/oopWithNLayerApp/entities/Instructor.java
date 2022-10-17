package oopWithNLayerApp.entities;

public class Instructor {
	private String name;
	private String lastName;
	
	public Instructor() {
		
	}
	
	public Instructor(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
