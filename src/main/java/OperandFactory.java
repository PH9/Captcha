public class OperandFactory {

    private final int pattern;
    private final int leftOperand;
    private final int rightOperand;

    public OperandFactory(int pattern, int leftOperand, int rightOperand) {
        this.pattern = pattern;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public Operand generateLeftOperand() {
        if (pattern == 2) {
            return new StringOperand(leftOperand);
        }
        return new IntegerOperand(leftOperand);
    }


    public Operand generateRightOperand() {
        if (pattern == 1) {
            return new StringOperand(rightOperand);
        }
        return new IntegerOperand(rightOperand);
    }
}
