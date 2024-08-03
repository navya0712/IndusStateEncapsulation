package com.indus.training.core.svc;

import com.indus.training.core.domain.DistanceConverterInput;
import com.indus.training.core.domain.DistanceConverterOutput;
import com.indus.training.core.impl.DistanceConverter;

import junit.framework.TestCase;

public class TestDistanceConverter extends TestCase {

	private DistanceConverter disConOutObj = null;

	protected void setUp() throws Exception {
		disConOutObj = new DistanceConverter();

	}

	protected void tearDown() throws Exception {
		disConOutObj = null;
	}

	public void testKmToMeterConverter() {

		// 1. Inputs
		DistanceConverterInput disConInObj = new DistanceConverterInput();
		disConInObj.setParam1(2.0);

		// 2. Expected Result
		DistanceConverterOutput ExpdisConOutObj = new DistanceConverterOutput();
		ExpdisConOutObj.setParam1(2.0);
		ExpdisConOutObj.setResult(2000);

		// 3. Actual Result
		DistanceConverterOutput ActDisConOutObj = disConOutObj.kmToMeterConverter(disConInObj);

		// 4. Assertion
		assertEquals(ExpdisConOutObj.getParam1(), ActDisConOutObj.getParam1(), 0);
		assertEquals(ExpdisConOutObj.getResult(), ActDisConOutObj.getResult(), 0);

	}

	public void testMeterToKmConverter() {

		// 1. Inputs
		DistanceConverterInput disConInObj = new DistanceConverterInput();
		disConInObj.setParam1(2000.0);

		// 2. Expected Result
		DistanceConverterOutput ExpdisConOutObj = new DistanceConverterOutput();
		ExpdisConOutObj.setParam1(2000.0);
		ExpdisConOutObj.setResult(2.0);

		// 3. Actual Result
		DistanceConverterOutput ActDisConOutObj = disConOutObj.meterToKmConverter(disConInObj);

		// 4. Assertion
		assertEquals(ExpdisConOutObj.getParam1(), ActDisConOutObj.getParam1(), 0);
		assertEquals(ExpdisConOutObj.getResult(), ActDisConOutObj.getResult(), 0);
	}

}
