package com.noonpay.subtractservice.service;


import mockit.Tested;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public  class SubtractserviceApplicationTests {
	@Tested
	private SubtractService subtractService;


	@Test
	public void checkPositiveCases(){
		Double subtract=subtractService.getSubtraction(11.0,10.0);
		assertEquals(1.0,subtract,0);
	}

	@Test
	public void checkZeroCase(){
		Double subtract=subtractService.getSubtraction(0.0,0.0);
		assertEquals(0,subtract,0);
	}



}
