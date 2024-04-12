package rikkei.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import rikkei.academy.service.EmployeeService;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping
    public String home(Model model){
        model.addAttribute("employees",employeeService.fillAll());
        return "home";
    }

}
