public class VisitorCalculate implements Visitor{
    public double visitOperand(Operand operand){
        return operand.getValue();
    }

    public double visitOperator(Operator operator){
        switch(operator.getType()){
            case "+":
                return operator.getLeft().accept(this) + operator.getRight().accept(this);
            case "-":
                return operator.getLeft().accept(this) - operator.getRight().accept(this);
            case "*":
                return operator.getLeft().accept(this) * operator.getRight().accept(this);
            case "/":
                return operator.getLeft().accept(this) / operator.getRight().accept(this);
            default:
                System.out.println("ERROR");
        }
        return 0;
    }
}