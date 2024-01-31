package in.ankit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/welcome1")
	public ModelAndView getWelcomeMsg() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","WELCOME TO ASHOKIT");
		mav.setViewName("welcome");
		return mav;
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {
		ModelAndView mav =new ModelAndView();
		mav.addObject("msg","GOOD MORNING WELOME..");
		mav.setViewName("greet");
		return mav;
	}
	@GetMapping("/wish")
	public ModelAndView getWishMessage() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","ALLTHE BEST");
		mav.setViewName("wish");
		return mav;
		
	}

}
