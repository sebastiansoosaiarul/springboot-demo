package com.springboot.demo.springbootdemo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class RESTController {
	
	    @RequestMapping("/")
	    public String home() {
	        return "<html><h1>Spring boot application home!</h1></html>";
	    }
}
