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
	

}
