package Composition;

public class Bank {

	Employee employee[] = new Employee[10];

	public void addEmployess(Employee employee) {
		for (int i = 0; i < this.employee.length; i++) {
			if(this.employee[i]==null ){
				this.employee[i]=employee;
				break;
			}
		}
		
	}
//	for (int i = 0; i < this.employee.length; i++) {
//		if (this.employee == null) {
//			this.employee[i] = employee;
//			break;
//		}
//	}
	public String getEmployeeName(String name, int id) {
		String name1 = "";
		for(int i = 0; i < employee.length; i++) {
			if(this.employee[i].getId() == id && this.employee[i].getDesignation().equalsIgnoreCase(name)){
				name1 = employee[i].getName();
				break;
			}
			
		}
		return name1;
		
	}

}
