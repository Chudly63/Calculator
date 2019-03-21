public class VisitorFullPrint implements Visitor{

    public String visitOperand(Operand operand){

        return operand.getValue() + " ";
    }

    public String visitOperator(Operator operator){
        String left = operator.getLeft().accept(this);
        String right = "";
        if(operator.getRight() != null)
            right = operator.getRight().accept(this);
        return(left + operator.getType() + " " + right);
    }
}