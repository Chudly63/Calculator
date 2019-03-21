/*
StateStart.java
Alex M Brown

State when the calculator is initialized and cleared
*/

public class StateStart extends State{

    public void newOperator(Operator newOperator){
        //Do nothing
    }

    public void newOperand(Operand newOperand){
        setRoot(newOperand);

        setState(new StateFirst());        
    }

    public void calculate(){
        //Do nothing
    }
}