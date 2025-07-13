package example.Exercise_4;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup: Calculator object created");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator object set to null");
    }

    @Test
    public void testAddition() {
        int a=10, b=3;
        int res= calculator.add(a, b);
        assertEquals(13, res);
    }

    @Test
    public void testMultiplication() {
        int a=7,b=6;
        int res=calculator.multiply(a, b);
        assertEquals(24, res);
    }
}
