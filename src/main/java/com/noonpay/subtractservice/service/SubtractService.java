package com.noonpay.subtractservice.service;

import org.springframework.stereotype.Service;

@Service
public class SubtractService {

    public Double getSubtraction(Double value1,Double value2){
        return value1-value2;
    }

}
