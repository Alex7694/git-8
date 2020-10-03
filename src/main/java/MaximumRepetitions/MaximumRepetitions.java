package MaximumRepetitions;

import java.io.*;
import java.util.*;

/** Реализация по заданию:
 * Прочитать слова из файла.
 * Отсортировать в алфавитном порядке.
 * Посчитать сколько раз каждое слово встречается в файле.       Вывести статистику на консоль
 * Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
 * @author Toropov Alexander
 *@version 1.0
 */

public class MaximumRepetitions {
    public static void main(String[] args) throws Exception {

        readSaveAndSort();
    }

    /**
     * Метод для чтения из файла, перевода в массив, сортировки  массива
     *
     * @throws IOException исключение, которое выдается при возникновении ошибки ввода-вывода
     */
    public static void readSaveAndSort() throws IOException {
        File file = new File("src\\main\\java\\MaximumRepetitions\\file1.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        StringBuilder builder = new StringBuilder();
        String line = reader.readLine();
        do {
            builder.append(line);
            line = reader.readLine();
        } while (line != null);
        reader.close();

        String[] list = builder.toString().split(" ");
        Arrays.sort(list);
        readSaveAndSort(list);
    }

    /**
     * Метод для для подсчета сколько раз каждое слово встречается в массиве
     *
     * @param list отсортированный массив
     */

    public static void readSaveAndSort(String[] list) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String word : list) {
            if (!word.isEmpty()) {
                Integer count = map.get(word);
                if (count == null) {
                    count = 0;
                }
                map.put(word, ++count);
            }
        }
        print(map);
        print_max(map);

    }

    /**
     * Метод для вывода на консоль сколько раз каждое слово встречается в массиве
     *
     * @param map  массив
     */
    public static void print(Map<String, Integer> map) {

        for (String word : map.keySet()) {
            System.out.printf("Слово: '%s' встречается: %d раза\n", word, map.get(word));
        }
    }

    /**
     * Метод для поиска и вывода на консоль слова(слов) с максимальным количеством повторений и сколько раз оно встречается
     * @param map массив
     * массив
     */

    public static void print_max(Map<String, Integer> map) {

        int maxCount = 0;
        String max_word = "";
        String anotherWord = "";

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getValue() > maxCount) {
                maxCount = stringIntegerEntry.getValue();
                max_word = stringIntegerEntry.getKey();
            } else if (stringIntegerEntry.getValue() == maxCount) {
                anotherWord = stringIntegerEntry.getKey();
                max_word = max_word  + " и " + anotherWord;
            }
        }
        System.out.printf("\nСлово: '%s'  встречается наиболее часто: %d  раза\n", max_word, maxCount);
    }
}


