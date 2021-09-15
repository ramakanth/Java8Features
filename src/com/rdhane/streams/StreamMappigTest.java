package com.rdhane.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	private boolean isActive;
	private int age;
	private List<String> skills;
	public Employee(int id, String firstName, String lastName, int salary, boolean isActive, int age,
			List<String> skills) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.isActive = isActive;
		this.age = age;
		this.skills = skills;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
}
public class StreamMappigTest {
	
	
	public static void main(String[] args) {
		Employee employee1 = new Employee(200, "ramakanth", "dhane", 20000, true, 40, Arrays.asList("java","sql","nosql","javascript"));
		Employee employee2 = new Employee(200, "aadhya", "vaishampayana", 20000, true, 40, Arrays.asList("pyhon","sql","nosql","javascript"));
		Employee employee3 = new Employee(200, "ramakanth", "dhane", 20000, true, 40, Arrays.asList("java","sql","nosql","javascript"));
		Employee employee4 = new Employee(200, "ramakanth", "dhane", 20000, true, 40, Arrays.asList("java","sql","nosql","javascript"));
		Employee employee5 = new Employee(200, "ramakanth", "dhane", 20000, true, 40, Arrays.asList("java","sql","nosql","javascript"));
		Employee employee6 = new Employee(200, "ramakanth", "dhane", 20000, true, 40, Arrays.asList("java","sql","nosql","javascript"));
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);
		
	}

}
