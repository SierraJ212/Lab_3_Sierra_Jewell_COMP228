package com.sj.week6.hospitalManagementSystem;

/**
 * Represents a person in the hospital management system.
 * This is the base class of the hierarchy: Doctor and Nurse extend it directly,
 * and Surgeon and EmergencyDoctor extend Doctor. All fields are private and
 * accessed through getters and setters (encapsulation).
 *
 * @author Sierra Jewell
 *
 */

public class Person {

	private int personId;
	private String name;
	private int age;
	
	//constructor
	public Person(int personId, String name,int age) {
		this.personId = personId;
		this.name = name;
		this.age = age;
	}
	
	public int getPersonId() {
		return personId;
	}
 
	public void setPersonId(int personId) {
		this.personId = personId;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public int getAge() {
		return age;
	}
 
	public void setAge(int age) {
		this.age = age;
	}
	
	public void performDuties() {
		System.out.println("person is examining patients");
	}
}
