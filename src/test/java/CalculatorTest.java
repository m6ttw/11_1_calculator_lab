import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(6, calculator.add(4, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(8, calculator.subtract(9, 1));
    }

    @Test
    public void canMultiply(){
        assertEquals(4, calculator.multiply(2, 2));
    }

    @Test
    public void canDivide(){
        assertEquals(3, calculator.divide(12, 4), 0.1);
    }
}
