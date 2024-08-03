package com.indus.training.core.svc;

import com.indus.training.core.domain.BMICalculatorInput;
import com.indus.training.core.domain.BMICalculatorOutput;
import com.indus.training.core.impl.BMICalculator;

import junit.framework.TestCase;

public class TestBMICalculator extends TestCase {

	private BMICalculator BMIcalObj = null;

	protected void setUp() throws Exception {
		BMIcalObj = new BMICalculator();
	}

	protected void tearDown() throws Exception {
		BMIcalObj = null;
	}

	public void testCalculateBMI() {

		// 1. Inputs
		BMICalculatorInput BMIInpObj = new BMICalculatorInput();
		BMIInpObj.setHeight(2.0);
		BMIInpObj.setWeight(100.0);

		// 2. Expected Result
		BMICalculatorOutput BMIExpResult = new BMICalculatorOutput();
		BMIExpResult.setHeight(2.0);
		BMIExpResult.setWeight(100.0);
		BMIExpResult.setResult(25.0);

		// 3. Actual Result
		BMICalculatorOutput BMIActualResult = BMIcalObj.calculateBMI(BMIInpObj);

		// 4. Assertion
		assertEquals(BMIExpResult.getHeight(), BMIActualResult.getHeight(), 0);
		assertEquals(BMIExpResult.getWeight(), BMIActualResult.getWeight(), 0);
		assertEquals(BMIExpResult.getResult(), BMIActualResult.getResult(), 0);

	}

}
