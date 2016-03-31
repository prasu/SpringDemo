package com.att.ci;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.att.ci.elements.Data;

@Controller
public class PerformanceDataController {
	
	@RequestMapping(value ="/ci-perf-board",method = RequestMethod.GET)
	public String getDashboard(){
	
		return "pages/CI_dashboard";
		
	}
	
	@RequestMapping(value ="/performanceData")
	public ModelAndView getPerformanceData(){
		
		ArrayList<Data> list = new ArrayList<Data>();
		Data d = null;
		
		for(int i=0;i<=10;i++){
			d= new Data();
			d.setClient("eoder");
			d.setLayer("Spring");
			d.setTotalTime(i+"ms");
			list.add(d);
		}
		
		ModelAndView  view = new ModelAndView("check");
		view.addObject("quote", "check hi");
		
		return view;
		
	}

}
