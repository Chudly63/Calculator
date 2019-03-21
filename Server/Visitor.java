public interface Visitor{
    public String visitOperand(Operand operand);

    public String visitOperator(Operator operator);
}