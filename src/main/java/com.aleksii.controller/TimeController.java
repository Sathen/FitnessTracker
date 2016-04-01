package com.aleksii.controller;

import com.aleksii.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;

@Controller
public class TimeController {
    @RequestMapping(value = "/addminutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise)
    {
        System.out.println("exercise: "+exercise.getMinutes());


        return "addMinutes";
    }
}
