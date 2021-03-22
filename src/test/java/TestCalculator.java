import org.junit.Before;
import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calculator;

    @Before
    public void  before() {
        calculator = new Calculator();
    }

    @Test
    public void addNumbers() {
        assertEquals(12, calculator.add(10, 2));
    }

    @Test
    public void subtractNumbers() {
        assertEquals(8, calculator.subtract(10, 2));
    }

    @Test
    public void multiplyNumbers(){
        assertEquals(20, calculator.multiply(10, 2));
    }

    @Test
    public  void divideNumbers(){
        assertEquals(5, calculator.divide(10, 2), 0.0);
    }
}
