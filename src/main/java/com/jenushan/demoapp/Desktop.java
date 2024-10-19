package com.jenushan.demoapp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements computer{
    @Override
    public void compile() {
        System.out.println("It works desktop");
    }
}
