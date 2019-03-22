/*
Visitor.java
Alex M Brown

Interface for VisitorCalculate, VisitorPrint, VisitorFullPrint, VisitorTreePrint
*/

public interface Visitor{
    public String visitOperand(Operand operand);

    public String visitOperator(Operator operator);
}