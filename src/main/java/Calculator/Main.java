package Calculator;

import java.io.IOException;
import java.util.Scanner;

/** Реализация  калькулятора в стиле ООП
 * @author Toropov Alexander
 *@version 1.0
 */

public class Main {
    public static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) throws IOException {

        Calculator calculator = new Calculator();
        double input_1 = calculator.returnCorrectDouble();
        Calculator.res = input_1;
        run(input_1);
    }

    /**
     * Метод для выбора типа операции пользователем
     * @param one первое число
     * @throws IOException
     */
    public static void run(double one) throws IOException {

        boolean ended = false;
        Calculator calculator = new Calculator();

        while (!ended) {
            System.out.println("Введите операцию из списка: *, /, +, -, MS, MR, M+, M-, MC, C, end");
            String operation = scanner.nextLine();

            switch (operation) {
                case "*":
                    calculator.multiplication();
                    break;
                case "/":
                    calculator.division();
                    break;
                case "+":
                    calculator.addition();
                    break;
                case "-":
                    calculator.subtraction();
                    break;
                case "MS":
                    calculator.memory = calculator.res;
                    break;
                case "MR":
                    System.out.println("MR" + calculator.memory);
                    break;
                case "M+":
                    calculator.memoryPlus();
                    break;
                case "M-":
                    calculator.memoryMinus();
                    break;
                case "MC":
                    calculator.memory = 0;
                    break;
                case "C":
                    calculator.res = 0;
                    break;
                case "end":
                    ended = true;
            }
        }
    }
}
