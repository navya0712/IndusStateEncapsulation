package com.indus.training.core.svc;

import com.indus.training.core.domain.InterestCalculatorInput;
import com.indus.training.core.domain.InterestCalculatorOutput;
import com.indus.training.core.impl.InterestCalculator;

import junit.framework.TestCase;

public class TestInterestCalculator extends TestCase {

	private InterestCalculator intCalObj = null;

	protected void setUp() throws Exception {
		intCalObj = new InterestCalculator();
	}

	protected void tearDown() throws Exception {
		intCalObj = null;
	}

	public void testCalculateInterest() {

		// 1. Inputs
		InterestCalculatorInput intCalInpObj = new InterestCalculatorInput();
		intCalInpObj.setPrincipal(100.0);
		intCalInpObj.setRate(20.0);
		intCalInpObj.setTime(2.0);

		// 2. Expected Result
		InterestCalculatorOutput ExpIntCalOupObj = new InterestCalculatorOutput();
		ExpIntCalOupObj.setPrincipal(100.0);
		ExpIntCalOupObj.setRate(20.0);
		ExpIntCalOupObj.setTime(2.0);
		ExpIntCalOupObj.setInterest(40.0);

		// 3. Actual Result
		InterestCalculatorOutput ActualIntCalOupObj = intCalObj.calculateInterest(intCalInpObj);

		// 4. Assertion
		assertEquals(ExpIntCalOupObj.getPrincipal(), ActualIntCalOupObj.getPrincipal(), 0);
		assertEquals(ExpIntCalOupObj.getRate(), ActualIntCalOupObj.getRate(), 0);
		assertEquals(ExpIntCalOupObj.getTime(), ActualIntCalOupObj.getTime(), 0);
		assertEquals(ExpIntCalOupObj.getInterest(), ActualIntCalOupObj.getInterest(), 0);
	}

}
