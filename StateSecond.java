public class StateSecond extends State{

    public void newOperator(Operator newOperator){
        System.out.println("Second -> Operator");   

        newOperator.setLeft(getRoot());
        setRoot(newOperator);

        setState(new StateOperator());   
        
    }

    public void newOperand(Operand newOperand){
        System.out.println("Second -> Second");   

        Operator currentRoot = (Operator)getRoot();
        Operand currentOperand = (Operand)currentRoot.getRight();
        currentOperand.setValue(currentOperand.getValue() * 10 + newOperand.getValue());
        currentRoot.setRight(currentOperand);
        setRoot(currentRoot);

    }

    public void calculate(){
        System.out.println("CALCULATE");
        System.out.println("Second -> Start");   

        VisitorCalculate test = new VisitorCalculate();
        System.out.println("RESULT: " + getRoot().accept(test));
        setRoot(null);

        setState(new StateStart());
    }
}