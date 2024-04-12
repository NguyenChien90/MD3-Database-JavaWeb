package rikkei.academy.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import rikkei.academy.model.Customer;
import rikkei.academy.service.CustomerServiceIMPL;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController  {
    @Autowired
    private CustomerServiceIMPL customerService;

    @GetMapping("/customers")
    public String showList(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "customer/list";
    }

    @GetMapping("/customers/detail/{id}")
    public String detail(@PathVariable int id, HttpServletRequest request) {
        Customer customer = customerService.findById(id);
        request.setAttribute("customer", customer);
        return "/customer/view";
    }

}
