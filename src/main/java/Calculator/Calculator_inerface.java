package Calculator;

import java.io.IOException;

/**
 * Интерфейс калькулятора
 */

public interface Calculator_inerface {

    // Методы для реализиции в классе, реализовавшем интерфейс
    public double returnCorrectDouble() throws IOException;
    public void multiplication() throws IOException;
    public void division() throws IOException;
    public void addition() throws IOException;
    public void subtraction() throws IOException;
    public void memoryPlus() throws IOException;
    public void memoryMinus() throws IOException;
    public void print(double result);
}
