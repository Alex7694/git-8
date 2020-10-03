package NewYearPresent;



public class NewYearPresent implements NewYearPresent_interface {

    public static int cookie_Amount = 0;
    public static int candy_Amount = 0;
    public static int chocolate_Amount = 0;
    public double totalWeight = 0;
    public double totalPrice = 0;
    Sweets[] sweets = new Sweets[0];

    /**
     * Метод добавления новой сладости
     * @param sweet сладость
     */
    @Override
    public void addNewSweet(Sweets sweet) {
        int oldItem = sweets.length;
        Sweets[] newSweets = new Sweets[oldItem + 1];
        for (int i = 0; i < oldItem; i++) {
            newSweets[i] = sweets[i];
        }
        newSweets[oldItem] = sweet;
        sweets = newSweets;
        totalWeight += sweet.weight;
        totalPrice += sweet.price;
    }

    /**
     * Метод удаления последней добавленной сладости из подарка
     */
    public void deleteLastSweet() {
        int last = sweets.length - 1;

        try {
            if (last == -1) {
                System.out.println("\nНовогодний подарок пуст");
                print();
                return;
            }
        } catch (Exception e) {
            System.out.println("Ошибка");
        }


        if (sweets[last].name == "Печенье Oreo") {
            cookie_Amount--;
        }
        if (sweets[last].name == "Конфета Merci") {
            candy_Amount--;
        }
        if (sweets[last].name == "Шоколадка Ritter Sport") {
            chocolate_Amount--;
        }

        int oldItem = sweets.length;
        Sweets[] newSweets = new Sweets[oldItem - 1];
        for (int i = 0; i < oldItem - 1; i++) {
            newSweets[i] = sweets[i];
        }
        sweets = newSweets;
        print();
    }

    /**
     * Метод подсчета и вывода на консоль веса подарка
     * @return sumweight общий вес  подарка
     */
    @Override
    public double overallWeight() {
        double sumweight = 0;
        for (int i = 0; i < sweets.length; i++) {
            sumweight += sweets[i].getWeight();
        }
        System.out.println("Общий вес " + sumweight);
        return sumweight;
    }

    /**
     * Метод подсчета и вывода на консоль суммы подарка
     * @return sumprice общая стоимость подарка
     */
    @Override
    public double overallCost() {
        double sumprice = 0;
        for (int i = 0; i < sweets.length; i++) {
            sumprice += sweets[i].getPrice();
        }
        System.out.println("Общая стоимость " + sumprice);
        return sumprice;
    }


    /**
     * Метод вывода на консоль количества сладостей в подарке
     */
    public void amountSweets() {
        for (int i = 0; i < sweets.length; i++) {
            System.out.println(sweets[i]);
        }
    }

    /**
     * Метод выбора действия пользователем
     */
    public static void print() {
        System.out.println("\nНажмите соответствующую цифру, чтобы добавить сладость в подарок.");
        System.out.println("'1' - " + Main.cookie_example.description());
        System.out.println("'2' - " + Main.candy_example.description());
        System.out.println("'3' - " + Main.chocolate_example.description());
        System.out.println("'4' - Удалить последнюю сладость");
        System.out.println("'5' - Закончить");
        System.out.print("Введите цифру:  ");
    }

    /**
     * Метод вывода на консоль составляющих подарка
     */
    public static void amount() {
        System.out.print("Подарок состоит из: ");
        if (cookie_Amount > 0) {
            System.out.print(cookie_Amount + "шт." + Main.cookie_example.name + ", \n");
        }
        if (candy_Amount > 0) {
            System.out.print(candy_Amount + "шт." + Main.candy_example.name + ", \n");
        }
        if (chocolate_Amount > 0) {
            System.out.println(chocolate_Amount + "шт. " + Main.chocolate_example.name + "\n");
        }
    }
}
