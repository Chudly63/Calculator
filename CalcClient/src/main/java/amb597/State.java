/*
State.java
Alex M Brown

State abstract. Extended by StateCalc, StateFirst, StateOperator, StateSecond, StateStart
*/

public abstract class State{

    private CalcController control;

    protected void setState(State newState){
        if(control == null){
            control = CalcController.getInstance();
        }
        control.setState(newState);
    }

    protected void setRoot(EquationItem newRoot){
        if(control == null){
            control = CalcController.getInstance();
        }
        control.setRoot(newRoot);
    }

    protected EquationItem getRoot(){
        if(control == null){
            control = CalcController.getInstance();
        }
        return control.getRoot();
    }

    public abstract void newOperator(Operator newOperator);

    public abstract void newOperand(Operand newOperand);

    public abstract void calculate();
}