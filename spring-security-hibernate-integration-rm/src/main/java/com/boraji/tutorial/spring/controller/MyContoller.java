package com.boraji.tutorial.spring.controller;

import java.security.Principal;
import org.springframework.security.access.prepost.PreAuthorize;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyContoller {

    @GetMapping("/")
    public String index(Model model, Principal principal) {
        model.addAttribute("message", "You are logged in as " + principal.getName());
        return "index";
    }

    @GetMapping("/test")
    public String test(Model model) {
        foo();
        return "test";
    }
    
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void foo(){
        
    }
}
