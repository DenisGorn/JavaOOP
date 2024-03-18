package model;

public class Multiply implements Command{
    @Override
    public double calculate(double number1, double number2) {
        return number1 * number2;
    }
}
