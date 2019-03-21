import javax.swing.*;

public class StateOperator extends State{

    ErrorView popup = new ErrorView();

    public void newOperator(Operator newOperator){
        if(!popup.isDiscarded()){
            setRoot(null);
            setState(new StateStart());
        }             
    }

    public void newOperand(Operand newOperand){
        Operator currentRoot = (Operator)getRoot();
        currentRoot.setRight(newOperand);
        setRoot(currentRoot);   

        setState(new StateSecond());    
    }

    public void calculate(){        
        if(!popup.isDiscarded()){
            setRoot(null);
            setState(new StateStart());
        }    
    }
}