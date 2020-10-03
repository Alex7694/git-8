package Calc_FindMaxWord;
import java.util.InputMismatchException;
import java.util.Scanner;

/** Реализация консольного калькулятора
 * @author Toropov Alexander
 *@version 1.0
*/

public class Calc {
    private static Scanner scanner = new Scanner(System.in);
    private static double value = 0;

    /**
     * Метод калькулятора
     */
    public static void start() {
        double input_1 = returnInput();
        double input_2 = returnInput();
        String operation = operationSelect();

        switch (operation) {
            case "+":
                System.out.printf("%.2f + %.2f = %.2f", input_1, input_2, input_1 + input_2);
                break;
            case "-":
                System.out.printf("%.2f - %.2f = %.2f", input_1, input_2, input_1 - input_2);
                break;
            case "/":
                System.out.printf("%.2f / %.2f = %.2f", input_1, input_2, input_1 / input_2);
                break;
            case "*":
                System.out.printf("%.2f * %.2f = %.2f", input_1, input_2, input_1 * input_2);
                break;
            default:
                System.err.println("Ошибка при вводе операции. Повторите ввод.");
                operationSelect();
        }
        scanner.close();
    }

    /**
     *  Метод ввода значения пользователем с консоли
     * @return возвращает значение, введенное пользователем с консоли
     * @see Calc#start
     */
    public static double returnInput(){

        System.out.print("Введите число.\nПоле для ввода: ");
            try {
                value = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.err.print("Введено не число. Введите число: \nПоле для ввода: ");
                scanner.nextLine();
                value = returnInput();
            }
            return value;
        }


    /**
     *  Метод по выбору типа операции пользователем
     * @return возвращает тип операции, введеный пользователем
     * @see Calc#start
     */
    private static String operationSelect(){
        System.out.print("Выберите операцию: \n+  Сложение \n-  Вычитание \n/  Деление \n*  Умножение Выход \nВведите выбранное значение: ");
        return scanner.next();
    }
}