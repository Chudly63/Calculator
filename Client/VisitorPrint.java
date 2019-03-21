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