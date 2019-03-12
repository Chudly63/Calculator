public class StateFirst extends State{

    public void newOperator(Operator newOperator){
        System.out.println("First -> Operator");   
        setState(new StateOperator());     
    }

    public void newOperand(Operand newOperand){
        System.out.println("First -> First");
    }

    public void calculate(){
        System.out.println("ERROR | DISCARD");
    }
}