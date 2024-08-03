package com.indus.training.core.svc;

import com.indus.training.core.domain.PercentageCalculatorInput;
import com.indus.training.core.domain.PercentageCalculatorOutput;
import com.indus.training.core.impl.PercentageCalculator;

import junit.framework.TestCase;

public class TestPercentageCalculator extends TestCase {

	private PercentageCalculator testCalObj = null;

	protected void setUp() throws Exception {
		testCalObj = new PercentageCalculator();
	}

	protected void tearDown() throws Exception {
		testCalObj = null;
	}

	public void testCalculatePercentage() {

		// 1. Inputs
		PercentageCalculatorInput perCalInObj = new PercentageCalculatorInput();
		perCalInObj.setParam1(100.0);
		perCalInObj.setParam2(20.0);

		// 2. Expected Result
		PercentageCalculatorOutput ExpPerCalOutObj = new PercentageCalculatorOutput();
		ExpPerCalOutObj.setParam1(100.0);
		ExpPerCalOutObj.setParam2(20.0);
		ExpPerCalOutObj.setResult(20.0);

		// 3. Actual Result
		PercentageCalculatorOutput ActPerCalOutObj = testCalObj.calculatePercentage(perCalInObj);

		// 4. Assertion
		assertEquals(ExpPerCalOutObj.getParam1(), ActPerCalOutObj.getParam1(), 0);
		assertEquals(ExpPerCalOutObj.getParam2(), ActPerCalOutObj.getParam2(), 0);
		assertEquals(ExpPerCalOutObj.getResult(), ActPerCalOutObj.getResult(), 0);

	}

}
