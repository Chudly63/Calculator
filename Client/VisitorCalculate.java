public class VisitorCalculate implements Visitor{
    public String visitOperand(Operand operand){
        return operand.getValue();
    }

    public String visitOperator(Operator operator){
        double left = Double.parseDouble(operator.getLeft().accept(this));
        double right = Double.parseDouble(operator.getRight().accept(this));
        String result = "";

        switch(operator.getType()){
            case "+":
                result = (left + right) + "";
                break;
            case "-":
                result = (left - right) + "";
                break;
            case "*":
                result = (left * right) + "";
                break;
            case "/":
                result = (left / right) + "";
                break;
            default:
                System.out.println("ERROR");
                return "";
        }
        //Remove trailing 0's and .'s
        while((result.endsWith("0") && result.contains(".")) || result.endsWith(".")){
            result = result.substring(0,result.length()-1);
        }

        return result;
    }
}