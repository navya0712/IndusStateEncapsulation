package com.indus.training.core.domain;

/**
 * Represents the output for a percentage calculation.
 */
public class PercentageCalculatorOutput {

	private double param1;
	private double param2;
	private double result;

	/**
	 * Gets the first parameter.
	 * 
	 * @return the first parameter
	 */
	public double getParam1() {
		return param1;
	}

	/**
	 * Sets the first parameter.
	 * 
	 * @param param1 the first parameter to set
	 */
	public void setParam1(double param1) {
		this.param1 = param1;
	}

	/**
	 * Gets the second parameter.
	 * 
	 * @return the second parameter
	 */
	public double getParam2() {
		return param2;
	}

	/**
	 * Sets the second parameter.
	 * 
	 * @param param2 the second parameter to set
	 */
	public void setParam2(double param2) {
		this.param2 = param2;
	}

	/**
	 * Gets the result of the percentage calculation.
	 * 
	 * @return the result of the calculation
	 */
	public double getResult() {
		return result;
	}

	/**
	 * Sets the result of the percentage calculation.
	 * 
	 * @param result the result to set
	 */
	public void setResult(double result) {
		this.result = result;
	}

}
