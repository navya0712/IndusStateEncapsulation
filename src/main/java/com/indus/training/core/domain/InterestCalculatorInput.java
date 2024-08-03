package com.indus.training.core.domain;

/**
 * Represents the input for calculating interest.
 */
public class InterestCalculatorInput {

	private double principal;
	private double rate;
	private double time;

	/**
	 * Gets the principal amount.
	 * 
	 * @return the principal amount
	 */
	public double getPrincipal() {
		return principal;
	}

	/**
	 * Sets the principal amount.
	 * 
	 * @param principal the principal amount to set
	 */
	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	/**
	 * Gets the interest rate.
	 * 
	 * @return the interest rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * Sets the interest rate.
	 * 
	 * @param rate the interest rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	/**
	 * Gets the time period for which interest is calculated.
	 * 
	 * @return the time period
	 */
	public double getTime() {
		return time;
	}

	/**
	 * Sets the time period for which interest is calculated.
	 * 
	 * @param time the time period to set
	 */
	public void setTime(double time) {
		this.time = time;
	}

}
