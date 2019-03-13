public interface Visitor{
    public double visitOperand(Operand operand);

    public double visitOperator(Operator operator);
}