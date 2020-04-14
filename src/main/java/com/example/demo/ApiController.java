package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    private MealServices mealServices;

    @Autowired
    public ApiController(MealServices mealServices) {
        super();
        this.mealServices = mealServices;
    }

    @GetMapping("/meals")
    public List<Meal> getAllMeals(){
        return this.mealServices.getAllMeals();

    }
}
