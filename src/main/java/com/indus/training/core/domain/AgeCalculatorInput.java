package com.indus.training.core.domain;

/**
 * Represents an input for calculating age based on birth year and current year.
 */
public class AgeCalculatorInput {

	private int birthYear;
	private int currentYear;

	/**
	 * gets the birthYear
	 * 
	 * @return the birthYear
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * Sets the birth Year
	 * 
	 * @param birthYear the year of birth to set
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * gets the currentYear
	 * 
	 * @return the currentYear
	 */
	public int getCurrentYear() {
		return currentYear;
	}

	/**
	 * sets the currentYear
	 * 
	 * @param currentYear the currentYear to set
	 */
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

}
