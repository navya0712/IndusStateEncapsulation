package com.indus.training.core.domain;

public class BMICalculatorOutput {

	private double height;
	private double weight;
	private double result;

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

	/**
	 * gets the result
	 * 
	 * @return the result (BMI)
	 */
	public double getResult() {
		return result;
	}

	/**
	 * Sets the result
	 * 
	 * @return the result to set (BMI)
	 */
	public void setResult(double result) {
		this.result = result;
	}

}
