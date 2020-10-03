package Calculator;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator implements Calculator_inerface{
    public static Scanner scanner = new Scanner(System.in);
    public static double res = 0;
    public static double memory = 0;
    double input_new = 0;

    public static double value = 0;

    /**
     * Метод ввода значения пользователем с консоли
     * @return input
     * @throws IOException исключение, которое выдается при возникновении ошибки ввода-вывода
     */
    public double returnCorrectDouble() throws IOException {
        System.out.print("Введите число.\nПоле для ввода: ");
        try {
            value = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("Введено не число. Введите число.");
            scanner.nextLine();
            value = returnCorrectDouble();
        }
        return value;
    }


    /**
     * Метод для операции умножения
     * @throws IOException исключение, которое выдается при возникновении ошибки ввода-вывода
     */
    public void multiplication() throws IOException {
        Multiplication multiplication = new Multiplication();
        input_new = returnCorrectDouble();
        double result_multiply = multiplication.operation(res, input_new);
        res = result_multiply;
        print(result_multiply);
    }

    /**
     * Метод для операции деления
     * @throws IOException исключение, которое выдается при возникновении ошибки ввода-вывода
     */
    public void division() throws IOException {
        Division division = new Division();
        input_new = returnCorrectDouble();
        double result_division = division.operation(res, input_new);
        res = result_division;
        print(result_division);
    }

    /**
     * Метод для операции сложения
     * @throws IOException исключение, которое выдается при возникновении ошибки ввода-вывода
     */
    public void addition() throws IOException {
        Addition addition = new Addition();
        input_new = returnCorrectDouble();
        double result_addition = addition.operation(res, input_new);
        res = result_addition;
        print(result_addition);
    }

    /**
     * Метод для операции вычитания
     * @throws IOException исключение, которое выдается при возникновении ошибки ввода-вывода
     */
    public void subtraction() throws IOException {
        Subtraction subtraction = new Subtraction();
        input_new = returnCorrectDouble();
        double result_subtraction = subtraction.operation(res, input_new);
        res = result_subtraction;
        print(result_subtraction);
    }


    /**
     * Метод для операции M+ (прибавить к числу из памяти число, введенное пользователем и результат записать в память вместо предыдущего.)
     * @throws IOException исключение, которое выдается при возникновении ошибки ввода-вывода
     */
    public void memoryPlus() throws IOException {
        input_new = returnCorrectDouble();
        res = input_new;
        memory = memory + res;
    }


    /**
     * Метод для операции M- (вычесть из числа в памяти число, введенное пользователем и результат записать в память вместо предыдущего.)
     * @throws IOException исключение, которое выдается при возникновении ошибки ввода-вывода
     */
    public void memoryMinus() throws IOException {
        input_new = returnCorrectDouble();
        res = input_new;
        memory = memory - res;
    }


    /**
     * Метод печати результата операции
     * @param result результат операции между двумя числами
     */
    public  void print(double result) {
        System.out.printf("Результат операции: %.4f\n",  result);
    }
}

