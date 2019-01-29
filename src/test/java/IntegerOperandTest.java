import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerOperandTest {

    @Test
    public void itShouldBe1() {
        IntegerOperand operand = new IntegerOperand(1);
        assertEquals("1", operand.toString());
    }

    @Test
    public void itShouldBe9() {
        IntegerOperand operand = new IntegerOperand(9);
        assertEquals("9", operand.toString());
    }
}
