public class StateStart extends State{

    public void newOperator(Operator newOperator){
        System.out.println("Start -> Start");
    }

    public void newOperand(Operand newOperand){
        System.out.println("Start -> First");
        setState(new StateFirst());
    }

    public void calculate(){
        System.out.println("Start -> Start");
    }
}