package NewYearPresent;

public class Cookie extends Sweets {

    public Cookie(String name, double price, double weight) {
        super(name, price, weight);
    }

    public String description() {
        return  name + " весом " + weight + " г. по цене " + price + "р. за шт.";
     }
}
