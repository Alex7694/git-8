import Calculator.Calculator;
import Calculator.Multiplication;
import Calculator.Division;
import Calculator.Addition;
import Calculator.Subtraction;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;



public class TestsCalculator {

    Calculator calculator = new Calculator();

    //Проверка метода умножения
    @Test
    public void testMultiplication() {
        Multiplication multiplication = new Multiplication();
        double result = multiplication.operation(1.1, 2);
        Assert.assertEquals(2.2, result, 0);
    }

    //Проверка метода деления
    @Test
    public void testDivision() throws IOException {
        Division division = new Division();
        double result = division.operation(2.2, 2);
        Assert.assertEquals(1.1, result, 0);
    }

    //Проверка метода сложения
    @Test
    public void testAddition() {
        Addition addition = new Addition();
        double result = addition.operation(1.1, 1.1);
        Assert.assertEquals(2.2, result, 0);
    }

    //Проверка метода вычитания
    @Test
    public void testSubtraction() {
        Subtraction subtraction = new Subtraction();
        double result = subtraction.operation(2.2, 1.1);
        Assert.assertEquals(1.1, result, 0);
    }
}
