package com.indus.training.core.domain;

/**
 * Represents the input for converting temperatures between Celsius and
 * Fahrenheit.
 */
public class CelsiusFahrenheitConverterInput {

	private double param1;

	/**
	 * Gets the temperature value to be converted.
	 * 
	 * @return the temperature
	 */
	public double getParam1() {
		return param1;
	}

	/**
	 * Sets the temperature value to be converted.
	 * 
	 * @param param1 the temperature to set
	 */
	public void setParam1(double param1) {
		this.param1 = param1;
	}

}
