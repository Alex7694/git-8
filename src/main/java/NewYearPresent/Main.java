package NewYearPresent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Реализация консольного калькулятора
 * @author Toropov Alexander
 *@version 1.0
 */

public class Main {

//Создаем экземпляры сладостей
     static Sweets cookie_example = new Cookie("Печенье Oreo", 100,100);
     static Sweets candy_example = new Candy("Конфета Merci", 100,100);
     static Sweets chocolate_example = new Сhocolate("Шоколадка Ritter Sport", 100,100);

    public static void main(String[] args) throws IOException {

        NewYearPresent newYearPresent = new NewYearPresent();
        boolean ended = false;

        newYearPresent.print();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (!ended) {
            String choice = reader.readLine();

            switch (choice) {
                case "1":
                    Sweets cookie = new Cookie("Печенье Oreo", 100,100);
                    newYearPresent.addNewSweet(cookie);
                    System.out.println("\nПеченье Oreo добавлено в подарок");
                    newYearPresent.cookie_Amount++;
                    newYearPresent.overallWeight();
                    newYearPresent.overallCost();
                    newYearPresent.amount();
                    newYearPresent.print();
                    break;
                case "2":
                    Sweets candy = new Candy("Конфета Merci", 100,100);
                    newYearPresent.addNewSweet(candy);
                    System.out.println("\nКонфета Merci добавлена в подарок");
                    newYearPresent.candy_Amount++;
                    newYearPresent.overallWeight();
                    newYearPresent.overallCost();
                    newYearPresent.amount();
                    newYearPresent.print();
                    break;
                case "3":
                    Sweets chocolate = new Сhocolate("Шоколадка Ritter Sport", 100,100);
                    newYearPresent.addNewSweet(chocolate);
                    System.out.println("\nШоколадка Ritter Sport добавлена в подарок");
                    newYearPresent.chocolate_Amount++;
                    newYearPresent.overallWeight();
                    newYearPresent.overallCost();
                    newYearPresent.amount();
                    newYearPresent.print();
                    break;
                case "4":
                    newYearPresent.deleteLastSweet();
                    newYearPresent.overallWeight();
                    newYearPresent.amount();
                    break;
                case  "5":
                    ended = true;
                    break;
            }
        }
    }
}
