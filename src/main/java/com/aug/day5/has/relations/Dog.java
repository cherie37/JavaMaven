package com.aug.day5.has.relations;

public class Dog extends Animal {

	Dog(String name, String color, String size, String sex) {
		super(name, color, size, sex);
	}

	@Override
	public void move() {
		System.out.println("Dog move");

	}

	@Override
	public void eat() {
		System.out.println("Dog eat");

	}

}
