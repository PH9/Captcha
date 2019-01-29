import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OperandFactoryTest {

    final int DUMMY = 1;

    @Test
    public void whenPatternIs1_leftOperandShouldBeIntegerOperand() {
        OperandFactory operandFactory = new OperandFactory(1, DUMMY, DUMMY);
        Operand operand = operandFactory.generateLeftOperand();
        assertTrue(operand instanceof IntegerOperand);
    }

    @Test
    public void whenPatternIs2_leftOperandShouldBeStringOperand() {
        OperandFactory operandFactory = new OperandFactory(2,DUMMY, DUMMY);
        Operand operand = operandFactory.generateLeftOperand();
        assertTrue(operand instanceof StringOperand);
    }

    @Test
    public void whenPatternIs1_rightOperandShouldBeStringOperand() {
        OperandFactory operandFactory = new OperandFactory(1, DUMMY, DUMMY);
        Operand operand = operandFactory.generateRightOperand();
        assertTrue(operand instanceof StringOperand);
    }

    @Test
    public void whenPatternIs2_rightOperandShouldBeIntegerOperand() {
        OperandFactory operandFactory = new OperandFactory(2, DUMMY, DUMMY);
        Operand operand = operandFactory.generateRightOperand();
        assertTrue(operand instanceof IntegerOperand);
    }
}
