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