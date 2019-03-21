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