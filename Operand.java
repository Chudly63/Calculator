public class Operand implements EquationItem{
    private int myValue;

    public Operand(int value){
        myValue = value;
    }

    public double accept(Visitor visitor){
        return visitor.visitOperand(this);
    }

    public int getValue(){
        return myValue;
    }

    public void setValue(int i){
        myValue = i;
    }
}