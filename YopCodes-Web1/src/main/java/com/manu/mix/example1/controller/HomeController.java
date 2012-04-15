package com.manu.mix.example1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manu.mix.example1.service.HomeService;

@Controller
public class HomeController {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(HomeController.class);

	@Autowired
	private HomeService buswayService;

	@Autowired
	private MessageSource messageSource;
	
	@RequestMapping("/index")
	public String prepareSectionPage(ModelMap model) {

		return "index";

	}

}
