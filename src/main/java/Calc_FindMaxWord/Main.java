package Calc_FindMaxWord;

import java.io.IOException;
import java.util.Scanner;

/** Реализация консольного калькулятора
 * @author Toropov Alexander
 *@version 1.0
 */

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите программу для запуска: \n 1 - Калькулятор \n 2 - Максимальный элемент в массиве \n Введите свой выбор: ");
        boolean choice = false;

        while (!choice) {
            String program = scanner.nextLine();
            if (program.equals("1")) {
                choice = true;
                new Calc().start();
            } else if (program.equals("2")) {
                choice = true;
                new FindMaxWord().input_size();
            } else
                System.err.print("Введено неверное значение. Выберите программу для запуска: \n 1 - Калькулятор \n 2 - Максимальный элемент в массиве \n Введите свой выбор:  ");
        }
    }
}


