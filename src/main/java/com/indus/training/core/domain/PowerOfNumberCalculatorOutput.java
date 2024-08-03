package com.indus.training.core.domain;

/**
 * Represents the output for calculating the power of a number.
 */
public class PowerOfNumberCalculatorOutput {

	private double base;
	private double exponent;
	private double result;

	/**
	 * Gets the base value used in the power calculation.
	 * 
	 * @return the base value
	 */
	public double getBase() {
		return base;
	}

	/**
	 * Sets the base value used in the power calculation.
	 * 
	 * @param base the base value to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * Gets the exponent value used in the power calculation.
	 * 
	 * @return the exponent value
	 */
	public double getExponent() {
		return exponent;
	}

	/**
	 * Sets the exponent value used in the power calculation.
	 * 
	 * @param exponent the exponent value to set
	 */
	public void setExponent(double exponent) {
		this.exponent = exponent;
	}

	/**
	 * Gets the result of the power calculation.
	 * 
	 * @return the result of the power calculation
	 */
	public double getResult() {
		return result;
	}

	/**
	 * Sets the result of the power calculation.
	 * 
	 * @param result the result to set
	 */
	public void setResult(double result) {
		this.result = result;
	}

}
