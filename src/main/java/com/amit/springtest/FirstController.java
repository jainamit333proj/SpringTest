package com.amit.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	
	@RequestMapping("test")
	public ModelAndView message( @RequestParam(value = "name",required = false, defaultValue = "Name") String name){
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("name", name);
		return mv;
	}
}
