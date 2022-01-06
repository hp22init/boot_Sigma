package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorld {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    @RequestMapping("/hello")
        public String test(Model model){
        logger.debug("Logback from HelloWord->test()");
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
        public String index() {
        return "index";
    }

    @RequestMapping(value = "/scope", method = RequestMethod.GET)
    public String scope() {
        return "scope";
    }

    @RequestMapping("/aks")
        public String aks(){
        logger.debug("Logback from HelloWord->aks()");
        return "We will rise up together";
    }
    
}
