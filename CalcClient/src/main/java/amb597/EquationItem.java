/*
EquationItem.java
Alex M Brown

Composite interface. Implemented by Operand and Operator
*/

public interface EquationItem{
    public String accept(Visitor visitor);
}