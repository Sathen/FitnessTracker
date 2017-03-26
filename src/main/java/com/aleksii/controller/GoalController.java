package com.aleksii.controller;

import com.aleksii.model.Goal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

/**
 * @author aleksii on 26.03.2017.
 */
@Controller
@SessionAttributes("goal")
public class GoalController {

    @RequestMapping(value = "/addGoal", method = RequestMethod.GET)
    public String addGoal(Model model) {
        Goal attributeValue = new Goal();
        attributeValue.setMinutes(10);
        model.addAttribute("goal", attributeValue);

        return "addGoal";
    }

    @RequestMapping(value = "/addGoal", method = RequestMethod.POST)
    public String updateGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result) {

        System.out.println("update: " + goal.getMinutes());
        System.out.println("Has errors: " + result.hasErrors());

        if (result.hasErrors()) {
            return "addGoal";
        }
        return "redirect:addMinutes.html";
    }
}
