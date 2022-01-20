package com.thinatech.cucumber;

import org.springframework.stereotype.Component;

@Component
public class MyService {

    Integer add(Integer arg0, Integer arg1) {
        return arg0 + arg1;
    }
}
