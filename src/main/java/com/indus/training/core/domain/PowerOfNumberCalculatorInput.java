package com.indus.training.core.domain;

/**
 * Represents the input for calculating the power of a number.
 */
public class PowerOfNumberCalculatorInput {

	private double base;
	private double exponent;

	/**
	 * Gets the base value.
	 * 
	 * @return the base value
	 */
	public double getBase() {
		return base;
	}

	/**
	 * Sets the base value.
	 * 
	 * @param base the base value to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * Gets the exponent value.
	 * 
	 * @return the exponent value
	 */
	public double getExponent() {
		return exponent;
	}

	/**
	 * Sets the exponent value.
	 * 
	 * @param exponent the exponent value to set
	 */
	public void setExponent(double exponent) {
		this.exponent = exponent;
	}

}
