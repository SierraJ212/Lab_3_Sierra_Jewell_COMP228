package com.sj.week6.hospitalManagementSystem;

/**
 * Represents a nurse. A Nurse is a Person assigned to a department and a shift.
 * Together with Doctor it shows hierarchical inheritance, since both extend Person.
 *
 * @author Sierra Jewell
 * 
 */

public class Nurse extends Person {

	private String department;
	private String shift;
	
	public Nurse(int personId, String name, int age, String department, String shift) {
		super(personId, name, age);
		this.department = department;
		this.shift = shift;
	}
	
	public void assistPatient() {
		System.out.println("nurse is assisting patient");
	}
	
	public String getDepartment() {
		return department;
	}
 
	public void setDepartment(String department) {
		this.department = department;
	}
 
	public String getShift() {
		return shift;
	}
 
	public void setShift(String shift) {
		this.shift = shift;
	}
 

	
	@Override
	public void performDuties() {
		System.out.println("nurse " + getName() + " is examining patients");
	}
}
