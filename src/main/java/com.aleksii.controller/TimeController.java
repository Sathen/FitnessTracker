package com.aleksii.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;

/**
 * Created by Sathen on 01.04.2016.
 */
@Controller
public class TimeController {
    @RequestMapping(value = "/addminutes")
    public String addMinutes(Model model){

        Calendar calendar = Calendar.getInstance();
        model.addAttribute("getTime",calendar.getTime().toString());

        return "addMinutes";
    }
}
