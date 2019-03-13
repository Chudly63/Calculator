public class StateSecond extends State{

    public void newOperator(Operator newOperator){
        System.out.println("Second -> Operator");   
        setState(new StateOperator());   
        
    }

    public void newOperand(Operand newOperand){
        System.out.println("Second -> Second");   

    }

    public void calculate(){
        System.out.println("CALCULATE");
        System.out.println("Second -> Start");   
        setState(new StateStart());

    }
}