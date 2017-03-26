package com.aleksii.controller;

import com.aleksii.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author aleksii on 26.03.2017.
 */
@Controller
@SessionAttributes("exercise")
public class MinutesController {

    @RequestMapping(value = "/addMinutes", method = RequestMethod.GET)
    public String addMinutesGet(Model model) {
        Exercise exercise = new Exercise();
        exercise.setMinutes(5);
        model.addAttribute("exercise",exercise);
        return "addMinutes";
    }

    @RequestMapping(value = "/addMinutes", method = RequestMethod.POST)
    public String addMinutesPost(@ModelAttribute("exercise") Exercise exercise) {
        System.out.println("minutes Post: " + exercise.getMinutes());
        return "redirect:addMinutes.html";
    }
}
