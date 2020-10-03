package NewYearPresent;

public abstract class Sweets {

    String name;
    double price;
    double weight;

    /**
     * Конструктор - создание нового объекта "cладость" с параметрами
     *
     * @param name   название
     * @param price  цена
     * @param weight вес
     */
    public Sweets(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    // Метод получения описания экземпляра сладости
    public abstract String description();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Метод получения цены экземпляра сладости
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Метод получения веса экземпляра сладости
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

