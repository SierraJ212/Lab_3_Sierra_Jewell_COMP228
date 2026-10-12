package com.sj.week6.hospitalManagementSystem;

/**
 * Represents a doctor. A Doctor is a Person with a specialization and a
 * consultation fee (single inheritance).
 *
 * @author Sierra Jewell
 * 
 */

public class Doctor extends Person{
	
	private String specialization;
	private double consultationFee;
	public Doctor(int personId, String name, int age, String specialization, double consultationFee) {
		super(personId, name, age);
		this.specialization = specialization;
		this.consultationFee = consultationFee;
		
	}
	
	public String getSpecialization() {
		return specialization;
	}
 
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
 
	public double getConsultationFee() {
		return consultationFee;
	}
 
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}
	
	public void diagnosePatient() {
		System.out.println("Diagnosing patient");
	}
	@Override
	public void performDuties() {
		System.out.println("Dr. " + getName() + " is examining patients");
	}
	
}
