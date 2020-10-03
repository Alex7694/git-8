package Calculator;

import java.io.IOException;

public abstract class Operations_abstact {
// Абстрактный класс для операции между двумя числами

    public double first;
    public double second;


    public abstract double operation(double one, double two) throws IOException;

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }
}
