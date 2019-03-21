/*
StateSecond.java
Alex M Brown

State when the calculator is building the next operand
*/

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
        VisitorCalculate calculate = new VisitorCalculate();
        String result = getRoot().accept(calculate);        

        CalcClient client = new CalcClient();
        client.sendToServer(getRoot());

        setRoot(new Operand(result));
        setState(new StateCalc());
    }
}