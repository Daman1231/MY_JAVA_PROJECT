package Composition;

public class Employee {

	String name;
	int id;
	String designation;
	
	public Employee(String name, int id, String designation) {
		this.name = name;
		this.id = id;
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getDesignation() {
		return designation;
	}
	
}
