public class Operand implements EquationItem{
    private int myValue;

    public Operand(int value){
        myValue = value;
    }

    public int getValue(){
        return myValue;
    }

    public void setValue(int i){
        myValue = i;
    }
}