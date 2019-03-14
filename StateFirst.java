public class StateFirst extends State{

    public void newOperator(Operator newOperator){
        System.out.println("First -> Operator");   

        newOperator.setLeft(getRoot());
        setRoot(newOperator);

        setState(new StateOperator());     
    }

    public void newOperand(Operand newOperand){
        System.out.println("First -> First");

        Operand currentRoot = (Operand)getRoot();
        newOperand.setValue(currentRoot.getValue() + newOperand.getValue());
        //System.out.println(""+newValue);
        setRoot(newOperand);
        

    }

    public void calculate(){
        System.out.println("ERROR | DISCARD");
    }
}