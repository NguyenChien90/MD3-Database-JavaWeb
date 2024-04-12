package rikkei.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import rikkei.academy.model.Category;
import rikkei.academy.service.CategoryService;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping
    public String home(Model model){
        model.addAttribute("categories",categoryService.findAll());
        return "home";
    }
    @GetMapping("/add")
    public String viewAdd(Model model){
        Category category = new Category();
        model.addAttribute("category",category);
        return "add";
    }
    @PostMapping("/add")
    public String handleAdd(@ModelAttribute Category category){
        categoryService.save(category);
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String viewEdit(@PathVariable Integer id, Model model){
        Category category = categoryService.findById(id);
        model.addAttribute("category",category);
        return "edit";
    }
    @PostMapping("/edit")
    public String handleEdit(@ModelAttribute Category category){
        categoryService.save(category);
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String handleDelete(@PathVariable Integer id){
        categoryService.delete(id);
        return "redirect:/";
    }




}
