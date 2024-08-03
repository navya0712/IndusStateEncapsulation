package com.indus.training.core.domain;

/**
 * Represents the output of AgeCalculator
 */
public class AgeCalculatorOutput {

	private int birthYear;
	private int currentYear;
	private int age;

	/**
	 * gets the birthYear
	 * 
	 * @return the year of birth
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * sets the birthYear
	 * 
	 * @param birthYear the birthYear to set
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * gets the currentYear
	 * 
	 * @return the current year
	 */
	public int getCurrentYear() {
		return currentYear;
	}

	/**
	 * Sets the current year
	 * 
	 * @param currentYear the current Year to set
	 */
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

	/**
	 * gets the age
	 * 
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * sets the age
	 * 
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
