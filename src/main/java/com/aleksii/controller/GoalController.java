package com.aleksii.controller;

import com.aleksii.model.Goal;
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
    public String updateGoal(@ModelAttribute("goal") Goal goal) {

        System.out.println("update: " + goal.getMinutes());
        return "redirect:addMinutes.html";
    }
}
