package com.abc.servicefeign.service.impl;

import com.abc.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name){
        return "sorry"+name;
    }
}
