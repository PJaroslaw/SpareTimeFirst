package com.test.SpareTime.web.resources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Greet {

    @GetMapping("/")
    public String greet() {
        return "Hello";
    }

    @GetMapping("/{name}")
    public String greetName(@PathVariable String name, Model model) {
        model.addAttribute("greeting", String.format("Hello %s", name));
        return "greeting";
    }
}
