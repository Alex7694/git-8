package Calculator;

public class Subtraction extends Operations_abstact {

    /**
     * Метод для вычитания двух чисел
     * @param one число один
     * @param two число два
     * @return результат вычитания двух чисел
     */
    @Override
    public double operation(double one, double two) {
        return one - two;
    }
}
