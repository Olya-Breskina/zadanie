package com.podgoretskaya.calc.controller;


import com.podgoretskaya.calc.dto.OperationDTO;
import com.podgoretskaya.calc.service.CalculateSimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SuppressWarnings("unused")
public class CalculatorController {

    OperationDTO operationModel = new OperationDTO();
    private final CalculateSimple calculateSimple;

    @Autowired
    private CalculatorController(CalculateSimple calculateSimple) {
        this.calculateSimple = calculateSimple;
    }

    @GetMapping("/calculator")
    public ResponseEntity<String> getCalculatorPage(@RequestParam(required = false, name = "get") String param, @RequestBody OperationDTO model) {
        return new ResponseEntity("все работает", HttpStatus.OK);
    }

    @PostMapping(value = "/calculator")
    public ResponseEntity<String> getCalculatorPages(@RequestBody OperationDTO model) {
        return new ResponseEntity("amountOfVacationDays=" + model.getAmountOfVacationDays() +
                ", averageForTheYear= " + model.getAverageForTheYear() +
                ", vacationStart= " + model.getVacationStart() +
                ", vacationEnd= " + calculateSimple.multiplyData(model) +
                ", vacationPay= " + calculateSimple.multiply(model)
                , HttpStatus.OK);
    }
}
