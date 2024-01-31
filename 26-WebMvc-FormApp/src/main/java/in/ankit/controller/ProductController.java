package in.ankit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ankit.binding.Product;
@Controller
public class ProductController {

	@GetMapping("/")
	public String getFormData(Model model) {
		Product productObj = new Product();
         model.addAttribute("product",productObj);
         return "index";
	}
	@PostMapping("/product")
	public String handleFormData(Product product,Model model){
		System.out.println(product);
		model.addAttribute("msg", "Product Saved Sucessfully");
		return "sucess";
	}
}
