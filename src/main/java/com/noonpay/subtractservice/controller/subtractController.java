package com.noonpay.subtractservice.controller;

import com.noonpay.subtractservice.service.subtractService;
import com.sun.istack.internal.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/noonpay")
public class subtractController {

    private final AtomicLong counter = new AtomicLong();

    @Validated
    @RequestMapping(value = "/subtract", method = RequestMethod.GET)
    public ResponseEntity<Double> subtract(@NotNull @RequestParam(value = "value1",required = true)double value1,
                                           @NotNull @RequestParam (value = "value2",required = true)double value2) {

        return  ResponseEntity.ok(new subtractService().getSubtraction(value1,value2)) ;
    }
}
