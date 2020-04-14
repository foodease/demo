package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

@Service
public class MealServices {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

   private MealRepository mealRepository;

    @Autowired
    public MealServices(MealRepository mealRepository) {
        super();
        this.mealRepository = mealRepository;
    }


    public List<Meal> getAllMeals(){
        List<Meal> meals = new ArrayList<>();
        this.mealRepository.findAll().forEach(meals::add);
        return meals;
    }


}
