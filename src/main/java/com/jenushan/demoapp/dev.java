package com.jenushan.demoapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class dev {
    @Autowired
    private computer comp;
    public void build(){
        comp.compile();
    }
}
