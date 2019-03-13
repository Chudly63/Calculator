import java.awt.event.*;

public class CalcController implements ActionListener{

    public static CalcController control = new CalcController();

    private EquationItem root;
    private State currentState = new StateStart();

    private CalcController(){}

    public static CalcController getInstance(){
        return control;
    }

    public void actionPerformed(ActionEvent e){
        //System.out.println(e.getActionCommand());
        switch(e.getActionCommand()){
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                currentState.newOperand(new Operand(Integer.parseInt(e.getActionCommand())));
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                currentState.newOperator(new Operator(e.getActionCommand()));
                break;
            case "C":
                System.out.println("Clear");
                root = null;
                currentState = new StateStart();
                break;
            case "=":
                currentState.calculate();
                break;
            default:
                System.out.println("oops");
        }
        VisitorPrint test = new VisitorPrint();
        if(root != null)
            root.accept(test);
        System.out.println("");
    }

    public EquationItem getRoot(){
        return root;
    }

    public void setRoot(EquationItem r){
        root = r;
    }

    public void setState(State newState){
        currentState = newState;
    }
    
}