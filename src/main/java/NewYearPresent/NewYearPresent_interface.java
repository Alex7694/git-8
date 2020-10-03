package NewYearPresent;

/**
 * Интерфейс для новогоднего подарка
 */

public interface NewYearPresent_interface {

    // Методы для реализиции в классе реализовавшем интерфейс
     public void addNewSweet(Sweets sweet);
     public void deleteLastSweet();
     public double overallWeight();
     public double overallCost();


}
