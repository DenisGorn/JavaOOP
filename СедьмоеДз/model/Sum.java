package model;

public class Sum implements Command{
    @Override
    public double calculate(double number1, double number2) {
        return number1 + number2;
    }
}
