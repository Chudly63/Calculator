import java.io.*;

public class Operand implements EquationItem, Serializable{
    private String myValue;

    public Operand(String value){
        myValue = value;
    }

    public String accept(Visitor visitor){
        return visitor.visitOperand(this);
    }

    public String getValue(){
        return myValue;
    }

    public void setValue(String i){
        myValue = i;
    }
}