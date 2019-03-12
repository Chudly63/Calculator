public class Operator implements EquationItem{
    private EquationItem myLeft;
    private EquationItem myRight;

    public Operator(EquationItem left){
        myLeft = left;
    }

    public Operator(EquationItem left, EquationItem right){
        myLeft = left;
        myRight = right;
    }

    public EquationItem getRight(){
        return myRight;
    }

    public EquationItem getLeft(){
        return myLeft;
    }
}