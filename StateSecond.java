public class StateSecond extends State{

    public void newOperator(Operator newOperator){
        newOperator.setLeft(getRoot());
        setRoot(newOperator);

        setState(new StateOperator());   
        
    }

    public void newOperand(Operand newOperand){
        Operator currentRoot = (Operator)getRoot();
        Operand currentOperand = (Operand)currentRoot.getRight();
        currentOperand.setValue(currentOperand.getValue() + newOperand.getValue());
        currentRoot.setRight(currentOperand);
        setRoot(currentRoot);

    }

    public void calculate(){
        VisitorCalculate test = new VisitorCalculate();
        String result = getRoot().accept(test);        

        setRoot(new Operand(result));
        setState(new StateCalc());
    }
}