package Calculator;

public class Multiplication extends Operations_abstact {

    /**
     * Метод, производящий перемножение двух чисел
     * @param one число один
     * @param two число два
     * @return результат перемножения двух чисел
     */
    @Override
    public double operation(double one, double two) {
        return one * two;
    }


}
