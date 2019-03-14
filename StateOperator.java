public class StateOperator extends State{

    public void newOperator(Operator newOperator){
        System.out.println("ERROR | DISCARD");        
    }

    public void newOperand(Operand newOperand){
        Operator currentRoot = (Operator)getRoot();
        currentRoot.setRight(newOperand);
        setRoot(currentRoot);   

        setState(new StateSecond());    
    }

    public void calculate(){        
        System.out.println("ERROR | DISCARD");      
    }
}