package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Division extends Operations_abstact {

    /**
     * Метод производящий сложение двух чисел с проверкой деления на ноль
     * @param one число один
     * @param two число два
     * @return результат вычитания двух чисел
     * @throws IOException исключение, которое выдается при возникновении ошибки ввода-вывода
     */
    @Override
    public double operation(double one, double two) throws IOException {
        if (two != 0) {
            return one / two;
        } else {
            System.err.println("Деление на ноль запрещено. Введите число:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            double input_1 = Integer.parseInt(reader.readLine());
            Calculator.res = input_1;
            Main.run(input_1);
        }
        return one / two;
    }
}



