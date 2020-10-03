package Calculator;

public class Addition extends Operations_abstact {

    /**
     * Метод производящий сложение двух чисел
     * @param one число один
     * @param two число два
     * @return результат сложения двух чисел
     */
    @Override
    public double operation(double one, double two) {
        return one + two;
    }
}
