package net.javaguides.springannotations.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello(){
        return "Hello controller";
    }
}
