package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/ProviderHome")
public class ProviderHomeController {
    private MealServices mealServices;

    @Autowired
    public ProviderHomeController(MealServices mealServices) {
        super();
        this.mealServices = mealServices;

    }

    @GetMapping
    public String findByRESTAURANT_NAME(Model model) {
        model.addAttribute("meals", this.mealServices.findByRESTAURANT_NAME("CHI CHIS"));
        return "ProviderHome";
    }

}
