package com.tu.bruno.servicea;


public class RandomEntry {

	private long id;
	private String randomValue;

	public RandomEntry(long id, String randomValue) {
		super();
		this.id = id;
		this.randomValue = randomValue;
	}

	public RandomEntry(String randomValue) {
		super();
		this.randomValue = randomValue;
	}
	
	public RandomEntry() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRandomValue() {
		return randomValue;
	}

	public void setRandomValue(String randomValue) {
		this.randomValue = randomValue;
	}

	@Override
	public String toString() {
		return "RandomEntry [id=" + id + ", randomValue=" + randomValue + "]";
	}
	
}
