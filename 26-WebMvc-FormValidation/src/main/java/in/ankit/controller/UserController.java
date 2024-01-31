package in.ankit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ankit.binding.User;
import jakarta.validation.Valid;
@Controller
public class UserController {
	
	@GetMapping("/")
	public String getForm(Model model) {
		User userobj=new User();
		model.addAttribute("user", userobj);
		return "index";
	}
	@PostMapping("/register")
	public String handleRegistration(@Valid User user,BindingResult result,Model model) {
		if(result.hasErrors()) {
			return "index";
		}
		System.out.println(user);
		model.addAttribute("msg","You Registration Sucess");
		return "success";
	}

}
