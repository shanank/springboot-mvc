package com.springbootMvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AppController {

    @Value("${spring.application.name}")
    String applicationName;

    private static Logger LOGGER = LoggerFactory.getLogger(AppController.class);

    @GetMapping(value = "/home")
    public String homePage(Model model) {
        model.addAttribute("applicationName" , applicationName);
        return "home";

    }

    @GetMapping(value = "/login")
    public String loginPage(Model model) {
        return "login";

    }
}
