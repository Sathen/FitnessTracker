package com.aleksii.controller;

import com.aleksii.model.Activity;
import com.aleksii.model.Exercise;
import com.aleksii.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.xml.ws.soap.Addressing;
import java.util.Arrays;
import java.util.List;

/**
 * @author aleksii on 26.03.2017.
 */
@Controller
@SessionAttributes("exercise")
public class MinutesController {

    @Autowired
    private ExerciseService exerciseService;

    @RequestMapping(value = "/addMinutes", method = RequestMethod.GET)
    public String addMinutesGet(Model model) {
        Exercise exercise = new Exercise();
        model.addAttribute("exercise",exercise);
        return "addMinutes";
    }

    @RequestMapping(value = "/addMinutes", method = RequestMethod.POST)
    public String addMinutesPost(@Valid @ModelAttribute("exercise") Exercise exercise, BindingResult result) {
        if(result.hasErrors()){
            return "addMinutes";
        }
        System.out.println("minutes Post: " + exercise.getMinutes());
        System.out.println("activity Post: " + exercise.getActivity());
        return "redirect:addMinutes.html";
    }

    @RequestMapping(value = "/activities",method = RequestMethod.GET)
    public @ResponseBody List<Activity> finaAllActivities(){
        return exerciseService.findAllActivities();
    }
}
