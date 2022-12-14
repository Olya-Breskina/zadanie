package com.podgoretskaya.calc.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
@Getter
@Setter
public class OperationDTO {
    private long amountOfVacationDays;//Количество дней отпуска
    private double averageForTheYear;//Средняя зарплата за 12 месяцев
    private LocalDate vacationStart;//Дата начала отпуска
    private LocalDate vacationEnd;//дата окончания отпуска
    private double vacationPay; //сумма отпускных
}
