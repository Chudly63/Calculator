public class StateOperator extends State{

    public void newOperator(Operator newOperator){
        System.out.println("ERROR | DISCARD");        
    }

    public void newOperand(Operand newOperand){
        System.out.println("Operator -> Second");  
        setState(new StateSecond());    
    }

    public void calculate(){        
        System.out.println("ERROR | DISCARD");      
    }
}