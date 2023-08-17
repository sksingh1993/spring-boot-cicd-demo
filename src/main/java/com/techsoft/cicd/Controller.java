package com.techsoft.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @GetMapping("/message")
    public String getMessage(){
        return "Welcome to Tech soft !!";
    }
    @GetMapping("/number")
    public Map<String,Integer> getNumber(){
        Map<String, Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Ten",10);
        return map;
    }
}
