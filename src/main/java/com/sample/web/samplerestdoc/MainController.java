package com.sample.web.samplerestdoc;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name){
        return "Hello! " + name;
    }

}
