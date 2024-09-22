package com.HelImerr.VacationCalc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/calculate")
public Double CalcVacation(@RequestParam int salary, int day) {
    double vacationvalue = salary / 29.3 * day;
    return vacationvalue; }
}

