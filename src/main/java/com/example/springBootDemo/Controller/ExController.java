package com.example.springBootDemo.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ExController {
    @Value("${spring.application.name}")
    String appName;


    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }
    @RequestMapping("/order")
    public String order() {
        return "order";
    }

    @RequestMapping("/pnv")
    public String pnv() {
        return "pnv";
    }

}
