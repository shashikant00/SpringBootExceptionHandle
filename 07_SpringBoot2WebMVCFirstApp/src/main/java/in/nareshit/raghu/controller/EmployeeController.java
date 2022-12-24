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
	
	@GetMapping("/feature")
	public String testPage12() {
		return "feature";
	}
	
	@GetMapping("/feature2")
	public String testPage122() {
		return "feature2";
	}
	

}
