package com.aleksii.controller;

import com.aleksii.model.Goal;
import org.springframework.expression.spel.support.StandardTypeComparator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.RequestScope;

import javax.validation.Valid;


@Controller
@SessionAttributes("goal")
public class GoalController {

    @RequestMapping(value = "/addGoals", method = RequestMethod.GET)
    public String addGoal(Model model){

        Goal goal = new Goal();
        goal.setMinutes(10);

        model.addAttribute("goal", goal);

        return "addGoals";
    }

    @RequestMapping(value = "/addGoals", method = RequestMethod.POST)
    public String updateGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result){

        System.out.println(" Result errors: "+result.hasErrors());

        System.out.println("Minutes: "+ goal.getMinutes());

        if(result.hasErrors())
            return "/addGoals";

        return "redirect:/addMinutes.html";
    }
}
