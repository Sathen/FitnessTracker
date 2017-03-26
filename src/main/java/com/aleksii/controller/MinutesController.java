package com.aleksii.controller;

import com.aleksii.model.Activity;
import com.aleksii.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * @author aleksii on 26.03.2017.
 */
@Controller
@SessionAttributes("exercise")
public class MinutesController {

    @RequestMapping(value = "/addMinutes", method = RequestMethod.GET)
    public String addMinutesGet(Model model) {
        Exercise exercise = new Exercise();
        model.addAttribute("exercise",exercise);
        return "addMinutes";
    }

    @RequestMapping(value = "/addMinutes", method = RequestMethod.POST)
    public String addMinutesPost(@ModelAttribute("exercise") Exercise exercise) {
        System.out.println("minutes Post: " + exercise.getMinutes());
        System.out.println("activity Post: " + exercise.getActivity());
        return "redirect:addMinutes.html";
    }

    @RequestMapping(value = "/activities",method = RequestMethod.GET)
    public @ResponseBody List<Activity> finaAllActivities(){

        Activity run = new Activity();
        run.setDesc("Run");

        Activity bike = new Activity();
        bike.setDesc("Bike");

        Activity swim = new Activity();
        swim.setDesc("Swim");

        return Arrays.asList(run,bike,swim);
    }
}
