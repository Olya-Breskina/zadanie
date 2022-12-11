package com.podgoretsaya.calc.controllers;


import com.podgoretsaya.calc.dto.OperationDTO;
import com.podgoretsaya.calc.service.CalculateSimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    OperationDTO operationModel = new OperationDTO();
    private final CalculateSimple calculateSimple;
    @Autowired
    private CalculatorController (CalculateSimple calculateSimple){
       this. calculateSimple=calculateSimple;
    }


    @GetMapping("/calculator")
    public ResponseEntity<String> getCalculatorPage(
            Model model
            //@RequestParam String param, @RequestBody OperationDTO model
    ){
        return new ResponseEntity("все работает", HttpStatus.OK);
    }

    @PostMapping(value="/calculator")
    public ResponseEntity getCalculatorPages(@RequestBody OperationDTO model) {
    return new ResponseEntity("amountOfVacationDays="+model.getAmountOfVacationDays()+
            ", averageForTheYear= "+model.getAverageForTheYear()+
            ", vacationStart= "+ model.getVacationStart(), HttpStatus.OK);
            //calculateSimple.multiplyData(operationModel), HttpStatus.OK);
            //
    }
  /* @PostMapping(value="/calculator")
    public ResponseEntity<String> multiply(@ModelAttribute("operationModel") OperationDTO operationModel, Model model ){
        model.addAttribute("result", calculateSimple.multiply(operationModel));
        return "calculator";}*/
}
