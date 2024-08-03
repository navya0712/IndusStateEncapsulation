package com.indus.training.core.domain;

/**
 * Represents the output of a temperature conversion between Celsius and
 * Fahrenheit.
 */
public class CelsiusFahrenheitConverterOutput {

	private double param1;
	private double result;

	/**
	 * Gets the temperature value
	 * 
	 * @return
	 */
	public double getParam1() {
		return param1;
	}

	/**
	 * Sets the temperature value
	 * 
	 * @param param1 the temperature value to set
	 */
	public void setParam1(double param1) {
		this.param1 = param1;
	}

	/**
	 * Gets the result of the temperature conversion.
	 * 
	 * @return the converted temperature value
	 */
	public double getResult() {
		return result;
	}

	/**
	 * Sets the result of the temperature conversion
	 * 
	 * @param result result the converted temperature value to set
	 */
	public void setResult(double result) {
		this.result = result;
	}

}
