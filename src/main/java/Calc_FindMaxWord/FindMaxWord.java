package Calc_FindMaxWord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;



public class FindMaxWord {
    public static Scanner scanner = new Scanner(System.in);

    /**
     * Метод задания пользователем через консоль размерности массива
     * @return размерность массива
     */

    public static int input_size(){
        System.out.println("Введите целое число, задающее размерность массива: ");
        try {
            int size = scanner.nextInt();
            input_word(size);
        }catch (Exception e){
            System.err.println("Вы ввели не целое число. Повторите ввод.  ");
            scanner.next();
            input_size();
        }
        return 0;
    }

    /**
     * Метод ввода пользователем через консоль слов в массив
     * @param size размерность массива
     * @throws IOException исключение, которое выдается при возникновении ошибки ввода-вывода
     */

    public static   void input_word(int size) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            System.out.printf("Введите слово %d: ", i + 1);
            String input = reader.readLine();
            arrayList.add(input);
        }
        find(arrayList);
    }

    /**
     * Метод поиска элемента максимальной длины и его индекса в массиве
     * @param arrayList массив
     */

    public static void find(ArrayList<String> arrayList) {
        int longest = arrayList.get(0).length();
        int index = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() >= longest) {
                longest = arrayList.get(i).length();
                index = i;
            }
        }
        print(arrayList,longest,index);
    }

    /**
     * Метод вывода  на консоль элемента массива с максимальной длинной
     * @param arrayList массив
     * @param longest элемента массива с максимальной длинной
     * @param index индекс элемента массива с максимальной длинной
     */

    public  static void print(ArrayList<String> arrayList, int longest, int index) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() == longest) {
                System.out.printf("Слово, введенное под №%d самое длинное: %s%n", i + 1, arrayList.get(index));
            }
        }
    }
}


