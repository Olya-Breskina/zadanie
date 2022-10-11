package com.example.calc.service;


import com.example.calc.model.OperationModel;
import org.springframework.stereotype.Service;

@Service
public class CalculateSimple {
    public double multiply(OperationModel model){

        return  (model.getA() * model.getB());
    }
}
