package Composition;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank();
		Employee employee = new Employee("daman", 001, "Manager");
		Employee employee1 = new Employee("param", 002, "Junior_Manager");
		Employee employee2 = new Employee("ishan", 003, "Middle_Manager");
		Employee employee3 = new Employee("satvir", 004, "Deputy_general_Manager");
		Employee employee4 = new Employee("sahib", 005, "Financial_Planning_Advisor");
		Employee employee5 = new Employee("manvir", 006, "Branch_Manager");
		Employee employee6 = new Employee("kuldeep", 007, "Customer_Loan_Manager");
		Employee employee7 = new Employee("navjot", 012, "Credit_card_Manager");
		Employee employee8 = new Employee("harinder", 013, "Atm_Specialist");
		Employee employee9 = new Employee("sanil", 014, "Branch_Coordinator");

		bank.addEmployess(employee);
		bank.addEmployess(employee1);
		bank.addEmployess(employee2);
		bank.addEmployess(employee3);
		bank.addEmployess(employee4);
		bank.addEmployess(employee5);
		bank.addEmployess(employee6);
		bank.addEmployess(employee7);
		bank.addEmployess(employee8);
		bank.addEmployess(employee9);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int enteredId = sc.nextInt();
		System.out.println("Enter Employee Designation" + enteredId);
		String enteredDesignation = sc.next();
		System.out.println("Employee Name is: " + bank.getEmployeeName(enteredDesignation,enteredId));
		
		

	}

}
