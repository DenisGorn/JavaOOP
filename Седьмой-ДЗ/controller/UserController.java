package controller;

import java.util.Scanner;

public class UserController {
    private Scanner scanner;
    private double number1;
    private double number2;
    private String command;

    public String getUserInput() {
        System.out.println("Введите первое число");
        scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        scanner = new Scanner(System.in);
        number2 = scanner.nextInt();
        System.out.println("Введите математическое действие");
        scanner = new Scanner(System.in);
        command = scanner.nextLine();

    }

}
