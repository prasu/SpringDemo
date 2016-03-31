package com.java.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringMVCController {
    
    @RequestMapping(value="/CI_Viewer.do",method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        return "CI_dashboard";
    }
    
    
    @RequestMapping(value="/performanceData.do", 
            method=RequestMethod.POST,
            produces={"application/xml", "application/json"})
    public @ResponseBody List<Data>  getPerformanceData(@RequestBody FormData formData) {    
    	
    	System.out.println("fromDate: "+formData.getFromDate()+" toDate: "+formData.getToDate());
    	ArrayList<Data> list = new ArrayList<Data>();
		Data d = null;
		
		for(int i=0;i<=10;i++){
			d= new Data();
			d.setClient("eoder");
			d.setLayer("Spring");
			d.setTotalTime(i+"ms");
			list.add(d);
		}
		
		System.out.println("size of list :"+list.size());
		
        return list;
    }
}
