package com.demo.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyDemoControllers {
	private String[] quotes= {"hit me",
			             "love me",
			             "propse to me",
			             "love me till u die"};
	
	@RequestMapping(value ="/getQuote")
	public ModelAndView getRandomQuote(){
		int rand = new Random().nextInt(quotes.length);
		String randomQuote = quotes[rand];
		
		ModelAndView  view = new ModelAndView("check");
		view.addObject("randomQuote", randomQuote);
		return view;
		
	}
	

}
