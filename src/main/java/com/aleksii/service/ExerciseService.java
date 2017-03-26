package com.aleksii.service;

import com.aleksii.model.Activity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author aleksii on 26.03.2017.
 */
@Service("exerciseService")
public class ExerciseService {

    public List<Activity> findAllActivities(){
        Activity run = new Activity();
        run.setDesc("Run");

        Activity bike = new Activity();
        bike.setDesc("Bike");

        Activity swim = new Activity();
        swim.setDesc("Swim");

        return Arrays.asList(run,bike,swim);
    }

}
