package com.sj.week6.hospitalManagementSystem;

/**
 * Demonstrates the hospital class hierarchy. Creates a doctor, nurse, surgeon and
 * emergency doctor, then shows their details, specialized methods, method overriding,
 * polymorphism and interface methods.
 *
 * @author Sierra Jewell
 * 
 */

public class MainDriver {

	public static void main(String[] args) {

		//Create one object of each major class
		Doctor doctor = new Doctor(1, "John Doe", 45, "Cardiology", 250.00);
		Nurse nurse = new Nurse(2, "James Don", 32, "Pediatrics", "Night");
		Surgeon surgeon = new Surgeon(3, "Brian David", 50, "Orthopedics", 400.00, "Knee Replacement", 3);
		EmergencyDoctor emergencyDoctor = new EmergencyDoctor(4, "Peter Patel", 38, "Emergency Medicine", 300.00);

		//Display the details of each object
		System.out.println("===== Object Details =====");
		System.out.println("Doctor: " + doctor.getName() + ", age " + doctor.getAge() + ", "
				+ doctor.getSpecialization() + ", fee $" + doctor.getConsultationFee());
		System.out.println("Nurse: " + nurse.getName() + ", age " + nurse.getAge() + ", "
				+ nurse.getDepartment() + ", " + nurse.getShift() + " shift");
		System.out.println("Surgeon: " + surgeon.getName() + ", age " + surgeon.getAge() + ", "
				+ surgeon.getSpecialization() + ", fee $" + surgeon.getConsultationFee() + ", "
				+ surgeon.getSurgeryType() + ", room " + surgeon.getOperatingRoom());
		System.out.println("Emergency Doctor: " + emergencyDoctor.getName() + ", age " + emergencyDoctor.getAge()
				+ ", " + emergencyDoctor.getSpecialization() + ", fee $" + emergencyDoctor.getConsultationFee());

		// Specialized methods
		System.out.println("\n===== Specialized Methods =====");
		doctor.diagnosePatient();
		nurse.assistPatient();
		surgeon.performSurgery();
		emergencyDoctor.handleEmergency();

		// Method overriding
		System.out.println("\n===== Method Overriding =====");
		doctor.performDuties();
		nurse.performDuties();
		surgeon.performDuties();
		emergencyDoctor.performDuties();

		// Polymorphism with a Person reference
		System.out.println("\n===== Polymorphism =====");
		Person person;

		person = new Doctor(5, "Eva Brown", 41, "Neurology", 275.00);
		person.performDuties();

		person = new Nurse(6, "Frank Wu", 29, "Oncology", "Day");
		person.performDuties();

		person = new Surgeon(7, "Grace Kim", 48, "Cardiac", 500.00, "Bypass", 5);
		person.performDuties();

		person = new EmergencyDoctor(8, "Henry Adams", 36, "Trauma", 320.00);
		person.performDuties();

		// 6. Interface methods
		System.out.println("\n===== Interface Methods =====");
		emergencyDoctor.prescribeMedication();
		emergencyDoctor.generateBill();
	}
}