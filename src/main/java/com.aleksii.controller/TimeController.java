package com.aleksii.controller;

import com.aleksii.model.Activity;
import com.aleksii.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TimeController {

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise)
    {
        System.out.println("exercise: "+exercise.getMinutes());

        return "addMinutes";
    }

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public @ResponseBody   List<Activity> findAllActivities(){

        List<Activity> activities = new ArrayList<Activity>();

        Activity run = new Activity();
        run.setDescript("Run");
        activities.add(run);

        Activity bike = new Activity();
        bike.setDescript("Bike");
        activities.add(bike);

        Activity swim = new Activity();
        swim.setDescript("Swim");
        activities.add(swim);

        return activities;


    }

}
