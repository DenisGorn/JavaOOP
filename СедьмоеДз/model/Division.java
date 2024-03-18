package model;

import org.w3c.dom.ls.LSOutput;

public class Division implements Command{
    @Override
    public double calculate(double number1, double number2) {
        if (isZero(number2)) {
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        return number1 / number2;
    }
    boolean isZero (double number) {
        return number == 0;
    }
}
