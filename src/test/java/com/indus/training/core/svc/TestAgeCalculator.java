package com.indus.training.core.svc;

import com.indus.training.core.domain.AgeCalculatorInput;
import com.indus.training.core.domain.AgeCalculatorOutput;
import com.indus.training.core.impl.AgeCalculator;

import junit.framework.TestCase;

public class TestAgeCalculator extends TestCase {

	private AgeCalculator ageCalObj = null;

	protected void setUp() throws Exception {
		ageCalObj = new AgeCalculator();
	}

	protected void tearDown() throws Exception {
		ageCalObj = null;
	}

	public void testCalculateAge() {

		// 1. Inputs
		AgeCalculatorInput ageInpObj = new AgeCalculatorInput();
		ageInpObj.setCurrentYear(2024);
		ageInpObj.setBirthYear(2000);

		// 2. Expected Result
		AgeCalculatorOutput expAgeOutObj = new AgeCalculatorOutput();
		expAgeOutObj.setCurrentYear(2024);
		expAgeOutObj.setBirthYear(2000);
		expAgeOutObj.setAge(24);

		// 3. Actual Result
		AgeCalculatorOutput actualAgeOutObj = ageCalObj.calculateAge(ageInpObj);

		// 4. Assertion
		assertEquals(expAgeOutObj.getCurrentYear(), actualAgeOutObj.getCurrentYear(), 0);
		assertEquals(expAgeOutObj.getBirthYear(), actualAgeOutObj.getBirthYear(), 0);
		assertEquals(expAgeOutObj.getAge(), actualAgeOutObj.getAge(), 0);

	}

}
