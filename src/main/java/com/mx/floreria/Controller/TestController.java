package com.mx.floreria.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "test")
public class TestController {


    @GetMapping(value = "api")
    public String test(){
        return "Test Controller";
    }

    @GetMapping(value = "pru")
    public String pru(){
        return "Test";
    }
}
