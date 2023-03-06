package com.example.mockca;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
	
	@GetMapping("/employee")
	public String MockcaApplication(Model model) {
		model.addAttribute("employee", new Employee());
		return "employee";
	}
	
	@PostMapping("/employee")
	public String saveEmployee(@ModelAttribute Employee employee, Model model) {
		model.addAttribute("employee", employee);
		return "displayForm";
	}
	
	

}
