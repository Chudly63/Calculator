public class VisitorCalculate implements Visitor{
    public String visitOperand(Operand operand){
        return operand.getValue();
    }

    public String visitOperator(Operator operator){
        double left = Double.parseDouble(operator.getLeft().accept(this));
        double right = Double.parseDouble(operator.getRight().accept(this));

        switch(operator.getType()){
            case "+":
                return (left + right) + "";
            case "-":
                return (left - right) + "";
            case "*":
                return (left * right) + "";
            case "/":
                return (left / right) + "";
            default:
                System.out.println("ERROR");
        }
        return "";
    }
}