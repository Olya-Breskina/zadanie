package com.example.calc.controllers;


import com.example.calc.model.OperationModel;
import com.example.calc.service.CalculateSimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

 OperationModel operationModel = new OperationModel();

    @Autowired
    private CalculateSimple calculateSimple;

    @GetMapping("/calculator")
    public String getCalculatorPage(Model model){
        model.addAttribute("operationModel",operationModel);
        return "calculator";
    }
    @PostMapping(value="/calculator", params="multiply")
    public String multiply(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.multiply(operationModel));
        return "calculator";
    }

}
