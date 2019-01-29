public class Captcha {

    private final Operand leftOperand;
    private final int operator;
    private final Operand rightOperand;

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.operator = operator;
        OperandFactory operandFactory = new OperandFactory(pattern, leftOperand, rightOperand);
        this.leftOperand = operandFactory.generateLeftOperand();
        this.rightOperand = operandFactory.generateRightOperand();
    }

    public Operand getLeftOperand() {
        return leftOperand;
    }

    public Operand getRightOperand() {
        return rightOperand;
    }

    public String getOperator() {
        String[] operators = {"+", "-", "/"};
        return operators[operator - 1];
    }

    @Override
    public String toString() {
        return getLeftOperand().toString() + " " + getOperator() + " " + getRightOperand().toString();
    }
}
