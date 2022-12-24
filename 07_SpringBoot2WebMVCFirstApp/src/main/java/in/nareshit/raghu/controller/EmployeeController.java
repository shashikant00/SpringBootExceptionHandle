package in.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/show")
	public String showPage() {
		return "EmpHome";
	}
	
	@GetMapping("/test")
	public String testPage() {
		return "test";
	}
	
	@GetMapping("/develop")
	public String testPage22() {
		return "develop";
	}
	
	@GetMapping("/develop1")
	public String testPage122() {
		return "develop1";
	}
	
	@GetMapping("/developnew")
	public String testPage1212() {
		return "developnew";
	}
}
