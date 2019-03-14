public class VisitorTreePrint implements Visitor{

    public String visitOperand(Operand operand){

        return operand.getValue();
    }

    //TODO: ADD ENOUGH SPACING FOR LARGE NUMBERS
    public String visitOperator(Operator operator){
        String left = operator.getLeft().accept(this);
        String right = "";
        String contruct = "";
        if(operator.getRight() != null)
            right = operator.getRight().accept(this);
        
        contruct += operator.getType() + "\n";
        contruct += "|\\\n";
        contruct += "  " + right;
        contruct += "\r" + left + "";

        return(contruct);
    }
}