package com.jenushan.demoapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class laptop implements computer{
    @Override
    public void compile() {
        System.out.println("It works laptop");
    }
}
