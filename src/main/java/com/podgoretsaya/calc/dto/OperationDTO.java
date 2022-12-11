package com.podgoretsaya.calc.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
@Getter
@Setter
public class OperationDTO {
    private long amountOfVacationDays;//Количество дней отпуска
    private double averageForTheYear;//Средняя зарплата за 12 месяцев
    private LocalDate vacationStart;//Дата начала отпуска
}
