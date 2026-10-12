package com.sj.week6.hospitalManagementSystem;

/**
 * Represents a surgeon. A Surgeon is a Doctor who performs a type of surgery in
 * an operating room. This shows multilevel inheritance: Person -> Doctor -> Surgeon.
 *
 * @author Sierra Jewell
 * 
 */

public class Surgeon extends Doctor{
	
	private String surgeryType;
	private int operatingRoom;

	public Surgeon(int personId, String name, int age, String specialization,double consultationFee, String surgeryType, int operatingRoom)
	{
	 super(personId, name, age, specialization, consultationFee);
	 this.surgeryType = surgeryType;
	 this.operatingRoom = operatingRoom;
	}
	
	public void performSurgery() {
		System.out.println("the surgeon is performing surgery on a patient");
	}
	
	public String getSurgeryType() {
		return surgeryType;
	}
 
	public void setSurgeryType(String surgeryType) {
		this.surgeryType = surgeryType;
	}
 
	public int getOperatingRoom() {
		return operatingRoom;
	}
 
	public void setOperatingRoom(int operatingRoom) {
		this.operatingRoom = operatingRoom;
	}
	
	@Override 
	public void performDuties() {
		System.out.println("Surgeon " + getName() + " is examining patients");
	}
}
