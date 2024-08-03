package com.indus.training.core.domain;

/**
 * Represents the input for calculating Body Mass Index (BMI).
 */
public class BMICalculatorInput {

	private double height;
	private double weight;

	/**
	 * gets the height
	 * 
	 * @return the height in meters
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * sets the height
	 * 
	 * @param height the height in meters to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * gets the weight
	 * 
	 * @return the weight in Kilograms
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Sets the weight in Kilograms
	 * 
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
