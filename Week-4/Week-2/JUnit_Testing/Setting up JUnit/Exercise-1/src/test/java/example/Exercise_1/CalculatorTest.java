package example.Exercise_1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int res=calc.add(3, 4);
        assertEquals(7, res);
        assertEquals(10,res);
    }
}
