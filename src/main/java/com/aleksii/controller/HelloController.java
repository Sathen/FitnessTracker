package com.aleksii.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author aleksii on 26.03.2017.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/greeting")
    public String seyHello(Model model){

        model.addAttribute("greeting","HI World");

        return "hello";
    }
}
