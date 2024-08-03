package com.indus.training.core.svc;

import com.indus.training.core.domain.CelsiusFahrenheitConverterInput;
import com.indus.training.core.domain.CelsiusFahrenheitConverterOutput;
import com.indus.training.core.impl.CelsiusFahrenheitConverter;

import junit.framework.TestCase;

public class TestCelsiusFahrenheitConverter extends TestCase {

	private CelsiusFahrenheitConverter celFahConObj = null;

	protected void setUp() throws Exception {
		celFahConObj = new CelsiusFahrenheitConverter();
	}

	protected void tearDown() throws Exception {
		celFahConObj = null;
	}

	public void testCelciusToFahrenheit() {

		// 1. Inputs
		CelsiusFahrenheitConverterInput celFahInpObj = new CelsiusFahrenheitConverterInput();
		celFahInpObj.setParam1(25.0);

		// 2. Expected Result
		CelsiusFahrenheitConverterOutput ExpCelFahObj = new CelsiusFahrenheitConverterOutput();
		ExpCelFahObj.setParam1(25.0);
		ExpCelFahObj.setResult(77.0);

		// 3. Actual Result
		CelsiusFahrenheitConverterOutput ActCelFahObj = celFahConObj.celciusToFahrenheit(celFahInpObj);

		// 4. Assertion
		assertEquals(ExpCelFahObj.getParam1(), ActCelFahObj.getParam1(), 0);
		assertEquals(ExpCelFahObj.getResult(), ActCelFahObj.getResult(), 0);

	}

	public void testFahrenheitToCelsius() {

		// 1. Inputs
		CelsiusFahrenheitConverterInput celFahInpObj = new CelsiusFahrenheitConverterInput();
		celFahInpObj.setParam1(77.0);

		// 2. Expected Result
		CelsiusFahrenheitConverterOutput ExpCelFahObj = new CelsiusFahrenheitConverterOutput();
		ExpCelFahObj.setParam1(77.0);
		ExpCelFahObj.setResult(25.0);

		// 3. Actual Result
		CelsiusFahrenheitConverterOutput ActCelFahObj = celFahConObj.FahrenheitToCelsius(celFahInpObj);

		// 4. Assertion
		assertEquals(ExpCelFahObj.getParam1(), ActCelFahObj.getParam1(), 0);
		assertEquals(ExpCelFahObj.getResult(), ActCelFahObj.getResult(), 0);
	}

}
