package com.org.weather.controller;

import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
@PropertySource(value = { "classpath:application.properties" })
public class IndexController {
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String index( HttpSession session) {
	
		return "index";
		}

}