package com.indus.training.core.domain;

/**
 * Represents the input for converting distances between kilometers and meters.
 */
public class DistanceConverterInput {

	private double param1;

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

}
