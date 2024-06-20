package com.example.jpa.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class firstController {

    @RequestMapping(value="/first-url", method= RequestMethod.GET)
    public void first(){

    }
    @ResponseBody
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String helloWorld(){
        return "helloWorld";
    }

    public String helloSpring(){
        return "hello spring";
    }

}
