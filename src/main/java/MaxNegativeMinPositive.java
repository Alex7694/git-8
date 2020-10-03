import java.util.Arrays;
import java.util.Random;

/**
 * Реализация поиска и замены местами максимального отрицательного и минимального положительного элемента  в массиве
 * размерностью 20, заполняемого случайными числами от -10 до 10.
 *
 * @author Toropov Alexander
 * @version 1.0
 */

public class MaxNegativeMinPositive {

    public static void main(String[] args) {

        arrayWithRandomElements();
    }

    /**
     * Метод создания массива int размерностью 20 и заполнения его случайными числами от -10 до 10
     */
    public static void arrayWithRandomElements() {
        int amount = 20;
        int array[] = new int[amount];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;

        }
        elements_change(array);
    }

    /**
     * Метод поиска максимального отрицательного и минимального положительного элемента массива и их перемена местами
     * @param array массив
     */

    static void elements_change(int[] array) {
        System.out.println("Массив до изменения: \n" + Arrays.toString(array));

        int minValue = 10;
        int minPosition = 0;
        int maxValue = 10;
        int maxPosition = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minPosition = i;
            }
            if (maxValue > array[i] && array[i] > 0) {
                maxValue = array[i];
                maxPosition = i;
            }
        }
        array[maxPosition] = minValue;
        array[minPosition] = maxValue;

        print_array(array);
    }

    /**
     * Метод вывод массива на консоль после перемены местами максимального отрицательного и минимального положительного элемента  в массиве
     * @param array массив
     */

    public static void print_array(int[] array) {
        System.out.println("Массив после изменения: \n" + Arrays.toString(array));
    }
}


