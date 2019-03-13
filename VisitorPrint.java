public class VisitorPrint implements Visitor{

    public double visitOperand(Operand operand){

        System.out.print(operand.getValue() + " ");
        return 0;
    }

    public double visitOperator(Operator operator){
        operator.getLeft().accept(this);
        System.out.print(operator.getType() + " ");
        if(operator.getRight() != null)
            operator.getRight().accept(this);
        return 0;
    }
}