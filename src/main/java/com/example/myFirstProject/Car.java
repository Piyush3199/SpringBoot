package com.example.myFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


//Creates a bean similar to @Component
@RestController
public class Car {


    // Dependency Injection : Spring provides object of the Dog class which is stored in IOC : Field Injection
    @Autowired
    private Dog dog;

    @GetMapping("/ok")    
    public String ok(){
        return dog.fun();
    }

}
