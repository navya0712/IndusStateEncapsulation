package com.indus.training.core.svc;

import com.indus.training.core.domain.PowerOfNumberCalculatorInput;
import com.indus.training.core.domain.PowerOfNumberCalculatorOutput;
import com.indus.training.core.impl.PowerOfNumberCalculator;

import junit.framework.TestCase;

public class TestPowerOfNumberCalculator extends TestCase {

	private PowerOfNumberCalculator powCalObj = null;

	protected void setUp() throws Exception {
		powCalObj = new PowerOfNumberCalculator();
	}

	protected void tearDown() throws Exception {
		powCalObj = null;
	}

	public void testCalculatePower() {

		// 1. Inputs
		PowerOfNumberCalculatorInput powCalInpObj = new PowerOfNumberCalculatorInput();
		powCalInpObj.setBase(2.0);
		powCalInpObj.setExponent(3.0);

		// 2. Expected Result
		PowerOfNumberCalculatorOutput ExpPowCalObj = new PowerOfNumberCalculatorOutput();
		ExpPowCalObj.setBase(2.0);
		ExpPowCalObj.setExponent(3.0);
		ExpPowCalObj.setResult(8.0);

		// 3. Actual Result
		PowerOfNumberCalculatorOutput ActPowCalObj = powCalObj.calculatePower(powCalInpObj);

		// 4. Assertion
		assertEquals(ExpPowCalObj.getBase(), ActPowCalObj.getBase(), 0);
		assertEquals(ExpPowCalObj.getExponent(), ActPowCalObj.getExponent(), 0);
		assertEquals(ExpPowCalObj.getResult(), ActPowCalObj.getResult(), 0);

	}

}
