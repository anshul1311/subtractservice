package com.noonpay.subtractservice.controller;

import com.noonpay.subtractservice.service.SubtractService;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SubtractControllerApplicationTests {

    @Tested
    private SubtractController subtractController;

    @Injectable
    private SubtractService subtractService;

    @Test
    public void ControllerCheck(){
        new Expectations(){{
            subtractService.getSubtraction(anyDouble,anyDouble);
            result=2.0;
            times=1;

        }};
        double result=subtractController.subtract(1.0,1.0);
        assertEquals(2.0, result,0);

    }
}
