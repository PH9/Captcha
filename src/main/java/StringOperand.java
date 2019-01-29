public class StringOperand implements Operand {

    private final int value;

    public final String[] numbers = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public StringOperand(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return numbers[value - 1];
    }
}
