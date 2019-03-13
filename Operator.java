public class Operator implements EquationItem{
    private EquationItem myLeft;
    private EquationItem myRight;
    private String myType;

    public Operator(String type){
        myType = type;
    }

    public String accept(Visitor visitor){
        return visitor.visitOperator(this);
    }

    public EquationItem getRight(){
        return myRight;
    }

    public EquationItem getLeft(){
        return myLeft;
    }

    public String getType(){
        return myType;
    }

    public void setRight(EquationItem newRight){
        myRight = newRight;
    }

    public void setLeft(EquationItem newLeft){
        myLeft = newLeft;
    }
}