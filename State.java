public abstract class State{

    private CalcController control = CalcController.getInstance();

    protected void setState(State newState){
        if(control == null){
            System.out.println("Huh?");
            control = CalcController.getInstance();
        }
        control.setState(newState);
    }

    public abstract void newOperator(Operator newOperator);

    public abstract void newOperand(Operand newOperand);

    public abstract void calculate();
}