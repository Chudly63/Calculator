/*
StateCalc.java
Alex M Brown

State when the calculator is displaying a result
*/

public class StateCalc extends State{

    public void newOperator(Operator newOperator){
        setRoot(null);
        setState(new StateStart());
    }

    public void newOperand(Operand newOperand){
        setRoot(newOperand);
        setState(new StateFirst());
    }

    public void calculate(){
        setRoot(null);
        setState(new StateStart());
    }
}