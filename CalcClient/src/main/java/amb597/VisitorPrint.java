/*
VisitorPrint.java
Alex M Brown

Visitor pattern that gets the string interpretation of an equation.
For equations with many operators, all but the last are compiled into a single operand.
*/

public class VisitorPrint implements Visitor{

    public String visitOperand(Operand operand){

        return operand.getValue() + " ";
    }

    public String visitOperator(Operator operator){
        VisitorCalculate hunch = new VisitorCalculate();
        String left = operator.getLeft().accept(hunch) + " ";
        String right = "";
        if(operator.getRight() != null)
            right = operator.getRight().accept(this);
        return(left + operator.getType() + " " + right);
    }
}