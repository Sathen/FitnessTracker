package com.aleksii.controller;

import com.aleksii.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author aleksii on 26.03.2017.
 */
@Controller
public class MinutesController {

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute("exercise")Exercise exercise){
        System.out.println("minutes: "+exercise.getMinutes());
        return "addMinutes";
    }
}
