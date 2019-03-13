public class StateFirst extends State{

    public void newOperator(Operator newOperator){
        System.out.println("First -> Operator");   

        newOperator.setLeft(getRoot());
        setRoot(newOperator);

        setState(new StateOperator());     
    }

    public void newOperand(Operand newOperand){
        System.out.println("First -> First");

        Operand test = (Operand)getRoot();
        int originalValue = test.getValue();
        int newValue = originalValue * 10 + newOperand.getValue();
        newOperand.setValue(newValue);
        System.out.println(""+newValue);
        setRoot(newOperand);
        

    }

    public void calculate(){
        System.out.println("ERROR | DISCARD");
    }
}