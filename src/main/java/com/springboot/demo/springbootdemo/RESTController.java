package com.springboot.demo.springbootdemo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class RESTController {
	
	    @RequestMapping("/home")
	    public String home() {
	        return "<html><h1>This is a test Spring boot application running on OPENSHIFT!</h1></html>";
	    }
}
