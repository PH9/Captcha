import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StringOperandTest {

    @Test
    public void itShouldBeOne() {
        StringOperand operand = new StringOperand(1);
        assertEquals("One", operand.toString());
    }

    @Test
    public void itShouldBeNine() {
        StringOperand operand = new StringOperand(9);
        assertEquals("Nine", operand.toString());
    }

    @Test
    public void itShouldConsist() {
        final int DUMMY = 1;
        String[] numbers = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        assertArrayEquals(numbers, (new StringOperand(DUMMY)).numbers);
    }
}
