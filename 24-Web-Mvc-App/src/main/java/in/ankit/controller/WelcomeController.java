package in.ankit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView welcomemsg() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "WELCOME TO ASHOK IT...!");
		mav.setViewName("welcome");
		return mav;
	}

}
