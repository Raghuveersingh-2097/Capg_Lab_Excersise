package com.cg.exception_lab.domain;

import com.cg.exception_lab.exception.InvalidNameException;

public class ExceptionInfo {
private int age;
private String name;
private double salary;
private String surname;

public String getSurname() {
	return surname;
}

public String setSurname(String surname) {
	this.surname = surname;
	return surname;
}

public double getSalary() {
	return salary;
}

public double setSalary(double salary) {
	this.salary = salary;
	return salary;
}

public String getName() {
	return name;
}

public String setName(String name) {
	this.name = name;
	return name;
}

public int getAge() {
	return age;
}

public int setAge(int age) {
	this.age = age;
	return age;
}

}
