package com.indus.training.core.domain;

/**
 * Represents the Output for converting distances between kilometers and meters.
 */
public class DistanceConverterOutput {

	private double param1;
	private double result;

	/**
	 * The distance value to be converted.
	 * 
	 * @return the distance value
	 */
	public double getParam1() {
		return param1;
	}

	/**
	 * Sets the distance value to be converted.
	 * 
	 * @param param1 the distance value to set
	 */
	public void setParam1(double param1) {
		this.param1 = param1;
	}

	/**
	 * Gets the result of the distance conversion.
	 * 
	 * @return the converted distance value
	 */
	public double getResult() {
		return result;
	}

	/**
	 * Sets the result of the distance conversion.
	 * 
	 * @param result the converted distance value to set
	 */
	public void setResult(double result) {
		this.result = result;
	}

}
