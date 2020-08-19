package com.noonpay.subtractservice.controller;

import com.noonpay.subtractservice.service.SubtractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/noonpay")
public class SubtractController {

@Autowired
private SubtractService subtractService;
    @RequestMapping(value = "/subtract", method = RequestMethod.POST)
    public Double subtract(@RequestParam(value = "value1")double value1,
                                           @RequestParam (value = "value2")double value2) {

        return  subtractService.getSubtraction(value1,value2) ;
    }
}
