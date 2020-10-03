package NewYearPresent;

public class Сhocolate extends Sweets {

    public Сhocolate(String name, double price, double weight) {
        super(name, price, weight);
    }


    public String description() {
        return  name + " весом " + weight + " г. по цене " + price + "р. за шт.";
    }
}