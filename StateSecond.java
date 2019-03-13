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
        int currentValue = Integer.parseInt(currentOperand.getValue());
        int newValue = currentValue * 10 + Integer.parseInt(newOperand.getValue());
        currentOperand.setValue("" + newValue);
        currentRoot.setRight(currentOperand);
        setRoot(currentRoot);

    }

    public void calculate(){
        System.out.println("Second -> Calc");   

        VisitorCalculate test = new VisitorCalculate();
        String result = getRoot().accept(test);

        //Remove trailing 0's and .'s
        while((result.endsWith("0") && result.contains(".")) || result.endsWith(".")){
            result = result.substring(0,result.length()-1);
        }

        setRoot(new Operand(result));
        setState(new StateCalc());
    }
}