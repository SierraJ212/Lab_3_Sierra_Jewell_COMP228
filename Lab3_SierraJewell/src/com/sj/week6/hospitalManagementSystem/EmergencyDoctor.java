package com.sj.week6.hospitalManagementSystem;

/**
 * Represents an emergency doctor. It extends Doctor and implements both
 * MedicalProfessional and Billable, which shows multiple inheritance through interfaces.
 *
 * @author Sierra Jewell
 * 
 */

public class EmergencyDoctor extends Doctor implements MedicalProfessional, Billable{
	
	public EmergencyDoctor(int personId, String name, int age, String specialization, double cosultationFee) {
		super(personId, name, age, specialization, cosultationFee);
	}
	
	public void handleEmergency() {
		System.out.println("Dr." + getName() + " is handling an emergency");
	}
	
	@Override
	public void performDuties() {
		System.out.println("emergency Dr. " + getName() + " is treating urgent cases in the emergency department");
	}
	
	@Override
	public void prescribeMedication() {
		System.out.println("Dr." + getName() + " is prescribing medication");
	}
	@Override
    public void generateBill() {
        System.out.println("Generating bill.");
    }
}
