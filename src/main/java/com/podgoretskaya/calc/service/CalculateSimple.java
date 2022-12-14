package com.podgoretskaya.calc.service;

import com.podgoretskaya.calc.dto.OperationDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CalculateSimple {
    public double multiply(OperationDTO model){
        return  (model.getAmountOfVacationDays() * model.getAverageForTheYear());
    }
   public LocalDate multiplyData(OperationDTO model){
        return  (model.getVacationStart().plusDays(model.getAmountOfVacationDays()) );
    }
}
