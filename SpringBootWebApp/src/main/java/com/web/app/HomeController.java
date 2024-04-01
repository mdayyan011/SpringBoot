package com.web.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home() {
		System.out.println("In home controller");
		return "home";
	}
	
	// Using special class of spring mvc
	@RequestMapping("about")
	public ModelAndView about(@RequestParam("name") String name) {

		ModelAndView mv = new ModelAndView();
		
		mv.addObject("userName",name);
		mv.setViewName("about");
		
		return mv;
	}
	
	// We can accept object as well by simply passing object of the corresponding pojo class
	@RequestMapping("user-details")
	public ModelAndView userDetails(UserDetails userDetailsObj) {

		ModelAndView mv = new ModelAndView();
		
		mv.addObject("userDetailsObj",userDetailsObj);
		mv.setViewName("userDetails");
		
		return mv;
	}
}
