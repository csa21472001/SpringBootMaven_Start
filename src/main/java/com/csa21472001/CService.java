package com.csa21472001;
import org.springframework.stereotype.Service;

@Service
public class CService implements CalculatorService {
    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String sum(int num1, int num2) {
//            if (num1 == 0 || num2 == 0 ) {
//                throw new IllegalArgumentException("ВВедены не все параметры");
//            }
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
        float result = (float) num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }

}

