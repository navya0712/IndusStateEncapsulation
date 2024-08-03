package com.indus.training.core.domain;

/**
 * Represents the output for interest calculation.
 */
public class InterestCalculatorOutput {

	private double principal;
	private double rate;
	private double time;
	private double interest;

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
	 * Gets the time period for which interest was calculated.
	 * 
	 * @return the time period
	 */
	public double getTime() {
		return time;
	}

	/**
	 * Sets the time period for which interest was calculated.
	 * 
	 * @param time the time period to set
	 */
	public void setTime(double time) {
		this.time = time;
	}

	/**
	 * Gets the calculated interest amount.
	 * 
	 * @return the calculated interest
	 */
	public double getInterest() {
		return interest;
	}

	/**
	 * Sets the calculated interest amount.
	 * 
	 * @param interest the calculated interest to set
	 */
	public void setInterest(double interest) {
		this.interest = interest;
	}

}
